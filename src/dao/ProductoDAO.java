/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
import modelo.Producto;
import java.sql.*;

/**
 *
 * @author chemo
 */
public class ProductoDAO
{

    public static boolean agregarProducto(Producto producto)
    {
        String sql = "INSERT INTO Productos (CodigoProductos, Nombre, Categoria, Costo, Precio, Descripcion, CantidadInventario, UnidadDeMedida) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {

            pstmt.setLong(1, producto.getCodigo());
            pstmt.setString(2, producto.getNombre());
            pstmt.setString(3, producto.getCategoria());
            pstmt.setFloat(4, producto.getCostoCompra());
            pstmt.setFloat(5, producto.getPrecioVenta());
            pstmt.setString(6, producto.getDescripcion());
            pstmt.setInt(7, producto.getCantidadStock());
            pstmt.setString(8, producto.getUnidadDeMedida());

            pstmt.executeUpdate();
            System.out.println("Producto agregado con éxito");
            return true;
        } catch (SQLException e)
        {
            System.err.println("Error al agregar el producto: " + e.getMessage());
            return false;
        }
    }
}
