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

    public boolean guardarVentaEnBaseDeDatos(Venta venta)
    {
        if (venta != null)
        {
            String sql = "INSERT INTO Venta (Fecha, Anotaciones, Subtotal, Total) VALUES (?, ?, ?, ?)";
            try (Connection conn = Conexion.conectar(); PreparedStatement pstm = conn.prepareStatement(sql))
            {
                pstm.setDate(1, new java.sql.Date(venta.getFecha().getTime())); 
                pstm.setString(2, venta.getAnotaciones()); 
                pstm.setDouble(3, venta.getSubTotal()); 
                pstm.setDouble(4, venta.getTotal()); 

                return pstm.executeUpdate() > 0;
            } catch (SQLException e)
            {
                e.printStackTrace();
                System.out.println("Error al guardar la venta: " + e.getMessage());
            }
        } else
        {
            System.out.println("La venta proporcionada es nula.");
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

        dao.guardarVentaEnBaseDeDatos(venta);

    }

}
