/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
import modelo.Venta;
import java.sql.*;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.util.List;
import modelo.DetalleVenta;
import modelo.Producto;

/**
 *
 * @author HP
 */
public class VentaDAO
{

    public int guardarVenta(Venta venta)
    {
        if (venta != null)
        {
            String sql = "INSERT INTO Venta (Fecha, Anotaciones, Subtotal, Total) VALUES (?, ?, ?, ?)";
            try (Connection conn = Conexion.conectar(); PreparedStatement pstm = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS))
            {

                pstm.setDate(1, new java.sql.Date(venta.getFecha().getTime()));
                pstm.setString(2, venta.getAnotaciones());
                pstm.setDouble(3, venta.getSubTotal());
                pstm.setDouble(4, venta.getTotal());

                int affectedRows = pstm.executeUpdate();
                if (affectedRows > 0)
                {
                    // Obtener el ID generado
                    try (ResultSet rs = pstm.getGeneratedKeys())
                    {
                        if (rs.next())
                        {
                            return rs.getInt(1); // Retornar el ID de la venta
                        }
                    }
                } else
                {
                    System.out.println("No se pudo insertar la venta.");
                }

            } catch (SQLException e)
            {
                e.printStackTrace();
                System.out.println("Error al guardar la venta: " + e.getMessage());
            }
        } else
        {
            System.out.println("La venta proporcionada es nula.");
        }
        return -1; // Indica error
    }

    public boolean guardarDetallesVenta(int idVenta, List<DetalleVenta> detallesVenta)
    {
        if (idVenta > 0 && detallesVenta != null && !detallesVenta.isEmpty())
        {
            String sql = "INSERT INTO DetalleVenta (IdProducto, Cantidad, PrecioUnitario,CodigoVenta) VALUES (?, ?, ?, ?)";
            try (Connection conn = Conexion.conectar(); PreparedStatement pstm = conn.prepareStatement(sql))
            {

                for (DetalleVenta detalle : detallesVenta)
                {
                    pstm.setLong(1, detalle.getProducto().getCodigo());
                    pstm.setInt(2, detalle.getCantidadProducto());
                    pstm.setDouble(3, detalle.getProducto().getPrecioVenta()); 
                    pstm.setLong(4, idVenta);

                    pstm.addBatch(); // Añadir al batch
                }
                pstm.executeBatch(); // Ejecutar batch
                return true;

            } catch (SQLException e)
            {
                e.printStackTrace();
                System.out.println("Error al guardar los detalles de la venta: " + e.getMessage());
            }
        } else
        {
            System.out.println("El ID de la venta o los detalles proporcionados son inválidos.");
        }
        return false;
    }

    public static void main(String[] args)
    {
        VentaDAO dao = new VentaDAO();
        ProductoDAO daoProd = new ProductoDAO();
        Producto p1 = daoProd.buscarProductoPorCodigo(3);
        DetalleVenta detalle = new DetalleVenta(p1, 1);
        Date fecha = new Date();

        Venta venta = new Venta(0, fecha, "2312", 400, 2000, 1000);

        dao.guardarVenta(venta);

    }

}
