package dao;

import componenteEstadisticas.IServicioEstadisticas;
import conexion.Conexion;
import java.time.LocalDate;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author chemo
 */
public class EstadisticasDAO implements IServicioEstadisticas
{

    public static void main(String[] args)
    {
        EstadisticasDAO estadisticasDAO = new EstadisticasDAO();

        //estadisticasDAO.getProductosMasVendidos();
//        LocalDate fechaInicial = LocalDate.of(2024, 10, 1);
//        LocalDate fechaFinal = LocalDate.of(2024, 10, 30);
//
//        double ingresos = estadisticasDAO.ingresosPorFecha(fechaInicial, fechaFinal);
//        System.out.println("Los ingresos totales entre " + fechaInicial + " y " + fechaFinal + " son: $" + ingresos);
        Producto producto = new Producto();
        producto.setCodigo(3L); 

        double totalVentas = estadisticasDAO.totalVentasPorProducto(producto);

        System.out.println("El total de ventas del producto es: $" + totalVentas);
    }

    @Override
    public List<Producto> getProductosMasVendidos()
    {
        List<Producto> productosMasVendidos = new ArrayList<>();
        String sql = "SELECT p.CodigoProductos, p.Nombre, p.Categoria, p.Costo, p.Precio, p.Descripcion, p.CantidadInventario, p.UnidadDeMedida, SUM(dv.Cantidad) AS TotalVendida "
                + "FROM Productos p "
                + "JOIN DetalleVenta dv ON p.CodigoProductos = dv.IdProducto "
                + "GROUP BY p.CodigoProductos, p.Nombre, p.Categoria, p.Costo, p.Precio, p.Descripcion, p.CantidadInventario, p.UnidadDeMedida "
                + "ORDER BY TotalVendida DESC";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery())
        {
            while (rs.next())
            {
                Producto producto = new Producto();
                producto.setCodigo(rs.getLong("CodigoProductos"));
                producto.setNombre(rs.getString("Nombre"));
                producto.setCategoria(rs.getString("Categoria"));
                producto.setCostoCompra(rs.getFloat("Costo"));
                producto.setPrecioVenta(rs.getFloat("Precio"));
                producto.setDescripcion(rs.getString("Descripcion"));
                producto.setCantidadStock(rs.getInt("CantidadInventario"));
                producto.setUnidadDeMedida(rs.getString("UnidadDeMedida"));

                System.out.println("Producto: " + producto.getNombre() + " | Total Vendido: " + rs.getInt("TotalVendida"));

                productosMasVendidos.add(producto);
            }
        } catch (SQLException e)
        {
            System.err.println("Error al obtener los productos más vendidos: " + e.getMessage());
        }

        return productosMasVendidos;

    }

    @Override
    public double ingresosPorFecha(LocalDate fechaInicial, LocalDate fechaFinal)
    {
        String sql = "SELECT SUM(Total) AS Ingresos FROM Venta WHERE Fecha BETWEEN ? AND ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setDate(1, Date.valueOf(fechaInicial));
            pstmt.setDate(2, Date.valueOf(fechaFinal));

            try (ResultSet rs = pstmt.executeQuery())
            {
                if (rs.next())
                {
                    return rs.getDouble("Ingresos");
                }
            }
        } catch (SQLException e)
        {
            System.err.println("Error al calcular los ingresos: " + e.getMessage());
        }

        return 0.0;
    }

//    @Override
//    public double egresosPorFecha(LocalDate fechaInicial, LocalDate fechaFinal)
//    {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
////    }
//    @Override
//    public double balancePorFecha(LocalDate fecha)
//    {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//
//    }
    @Override
    public double totalVentasPorProducto(Producto producto)
    {
        String sql = "SELECT SUM(dv.Cantidad * dv.PrecioUnitario) AS TotalVentas "
                + "FROM DetalleVenta dv "
                + "WHERE dv.IdProducto = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setLong(1, producto.getCodigo());

            try (ResultSet rs = pstmt.executeQuery())
            {
                if (rs.next())
                {
                    return rs.getDouble("TotalVentas");
                }
            }
        } catch (SQLException e)
        {
            System.err.println("Error al calcular el total de ventas por producto: " + e.getMessage());
        }

        return 0.0;
    }
}
