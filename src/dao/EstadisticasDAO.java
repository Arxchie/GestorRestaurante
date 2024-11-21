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
    @Override
    public List<Object[]> getProductosMasVendidos()
    {
        List<Object[]> productosMasVendidos = new ArrayList<>();
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

                int totalVendida = rs.getInt("TotalVendida");

                System.out.println("Producto: " + producto.getNombre() + " | Total Vendido: " + totalVendida);

                productosMasVendidos.add(new Object[]
                {
                    producto, totalVendida
                });
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

    public List<Object[]> obtenerTotalesVentasPorProducto()
    {
        String sql = "SELECT p.Nombre, SUM(dv.Cantidad * dv.PrecioUnitario) AS TotalVentas "
                + "FROM DetalleVenta dv "
                + "JOIN Productos p ON dv.IdProducto = p.CodigoProductos "
                + "GROUP BY p.Nombre";

        List<Object[]> datos = new ArrayList<>();

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery())
        {
            while (rs.next())
            {
                String nombreProducto = rs.getString("Nombre");
                double totalVentas = rs.getDouble("TotalVentas");
                datos.add(new Object[]
                {
                    nombreProducto, totalVentas
                });
            }
        } catch (SQLException e)
        {
            System.err.println("Error al obtener totales de ventas por producto: " + e.getMessage());
        }

        return datos;
    }

    public List<Object[]> getStockPorProducto()
    {
        String sql = "SELECT CodigoProductos, Nombre, CantidadInventario FROM Productos";
        List<Object[]> stockPorProducto = new ArrayList<>();

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery())
        {
            while (rs.next())
            {
                String nombreProducto = rs.getString("Nombre");
                int cantidadStock = rs.getInt("CantidadInventario");

                stockPorProducto.add(new Object[]
                {
                    nombreProducto, cantidadStock
                });
            }
        } catch (SQLException e)
        {
            System.err.println("Error al obtener el stock por producto: " + e.getMessage());
        }

        return stockPorProducto;
    }
}
