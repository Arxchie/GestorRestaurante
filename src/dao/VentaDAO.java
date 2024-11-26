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
        if (venta.isValida())
        {
            String sql = "INSERT INTO Venta VALUES (?,?,?,?,?)";
            try (Connection conn = Conexion.conectar(); PreparedStatement pstm = conn.prepareStatement(sql))
            {
                Date fecha =new Date();
                

         
                pstm.setDate(1,  new java.sql.Date(fecha.getTime()));
                pstm.setString(2, venta.getAnotaciones());
                pstm.setDouble(3, venta.getSubTotal());
                pstm.setDouble(4, venta.getTotal());
                return pstm.executeUpdate() > 0;
            } catch (Exception e)
            {
                e.printStackTrace();
                System.out.println("Error al guardar la venta: " + e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        VentaDAO dao = new VentaDAO();
        ProductoDAO daoProd = new ProductoDAO();
        Producto p1 = daoProd.buscarProductoPorCodigo(3);
        DetalleVenta detalle = new DetalleVenta(p1, 1);
        Venta v = new Venta();
        v.agregarDetalle(detalle);
        System.out.println(dao.guardarVentaEnBaseDeDatos(v));

    }

}
