/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import componenteProductos.IServicioProductos;
import conexion.Conexion;
import modelo.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chemo
 */
public class ProductoDAO implements IServicioProductos
{

    public List<Producto> obtenerTodosLosProductos()
    {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT CodigoProductos, Nombre, Categoria, Costo, Precio, Descripcion, CantidadInventario, UnidadDeMedida FROM Productos";

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
                productos.add(producto);
            }
        } catch (SQLException e)
        {
            System.err.println("Error al obtener los productos: " + e.getMessage());
        }

        return productos;
    }

    public boolean agregarProducto(Producto producto)
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

    @Override
    public void eliminarProducto(long codigoProducto)
    {
        String sql = "DELETE FROM Productos WHERE CodigoProductos = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setLong(1, codigoProducto);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0)
            {
                System.out.println("Producto eliminado con éxito.");
            } else
            {
                System.out.println("No se encontró el producto con el código especificado.");
            }
        } catch (SQLException e)
        {
            System.err.println("Error al eliminar el producto: " + e.getMessage());
        }
    }

    public boolean actualizarCantidadProducto(long codigoProducto, int cantidadVendida)
    {
        String sql = "UPDATE Productos SET CantidadInventario = CantidadInventario - ? WHERE CodigoProductos = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setInt(1, cantidadVendida); // La cantidad a descontar
            pstmt.setLong(2, codigoProducto); // Código del producto

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e)
        {
            System.err.println("Error al actualizar la cantidad del producto: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean modificarProducto(Producto producto)
    {
        String sql = "UPDATE Productos SET Nombre = ?, Categoria = ?, Costo = ?, Precio = ?, Descripcion = ?, CantidadInventario = ?, UnidadDeMedida = ? WHERE CodigoProductos = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, producto.getNombre());
            pstmt.setString(2, producto.getCategoria());
            pstmt.setFloat(3, producto.getCostoCompra());
            pstmt.setFloat(4, producto.getPrecioVenta());
            pstmt.setString(5, producto.getDescripcion());
            pstmt.setInt(6, producto.getCantidadStock());
            pstmt.setString(7, producto.getUnidadDeMedida());
            pstmt.setLong(8, producto.getCodigo());

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e)
        {
            System.err.println("Error al modificar el producto: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Producto buscarProductoPorCodigo(long codigoProducto)
    {
        String sql = "SELECT * FROM Productos WHERE CodigoProductos = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setLong(1, codigoProducto);

            try (ResultSet rs = pstmt.executeQuery())
            {
                if (rs.next())
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

                    System.out.println("Producto encontrado:");
                    System.out.println("Código: " + producto.getCodigo());
                    System.out.println("Nombre: " + producto.getNombre());
                    System.out.println("Categoría: " + producto.getCategoria());
                    System.out.println("Costo: " + producto.getCostoCompra());
                    System.out.println("Precio: " + producto.getPrecioVenta());
                    System.out.println("Descripción: " + producto.getDescripcion());
                    System.out.println("Cantidad en Inventario: " + producto.getCantidadStock());
                    System.out.println("Unidad de Medida: " + producto.getUnidadDeMedida());

                    return producto;
                } else
                {
                    System.out.println("No se encontró ningún producto con el código especificado.");
                    return null;
                }
            }
        } catch (SQLException e)
        {
            System.err.println("Error al buscar el producto: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Producto> getListaProductos()
    {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM Productos";

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

                productos.add(producto);
            }
        } catch (SQLException e)
        {
            System.err.println("Error al obtener la lista de productos: " + e.getMessage());
        }
        return productos;
    }

    @Override
    public Producto buscarProductoPorNombre(String nombre)
    {
        String sql = "SELECT * FROM Productos WHERE Nombre = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, nombre);

            try (ResultSet rs = pstmt.executeQuery())
            {
                if (rs.next())
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

                    return producto;
                } else
                {
                    System.out.println("No se encontró ningún producto con el nombre especificado.");
                    return null;
                }
            }
        } catch (SQLException e)
        {
            System.err.println("Error al buscar el producto por nombre: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void actualizarStock(long idProducto, int nuevaCantidad)
    {
        String sql = "UPDATE Productos SET CantidadInventario = ? WHERE CodigoProductos = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setInt(1, nuevaCantidad);
            pstmt.setLong(2, idProducto);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0)
            {
                System.out.println("El stock del producto se actualizó correctamente.");
            } else
            {
                System.out.println("No se encontró el producto con el ID especificado.");
            }
        } catch (SQLException e)
        {
            System.err.println("Error al actualizar el stock del producto: " + e.getMessage());
        }
    }

    @Override
    public boolean productoExiste(long idProducto)
    {
        String sql = "SELECT 1 FROM Productos WHERE CodigoProductos = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setLong(1, idProducto);

            try (ResultSet rs = pstmt.executeQuery())
            {
                return rs.next();
            }
        } catch (SQLException e)
        {
            System.err.println("Error al verificar si el producto existe: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean existeNombreProducto(String nombre)
    {
        String sql = "SELECT COUNT(*) AS total FROM Productos WHERE Nombre = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, nombre);

            try (ResultSet rs = pstmt.executeQuery())
            {
                if (rs.next())
                {
                    return rs.getInt("total") > 0;
                }
            }
        } catch (SQLException e)
        {
            System.err.println("Error al verificar el nombre del producto: " + e.getMessage());
        }
        return false;
    }

}
