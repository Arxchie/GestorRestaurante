/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import componenteProductos.IServicioProductos;
import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author HP
 */
public class controladorProducto implements IServicioProductos
{

    private List<Producto> productos;

    public controladorProducto()
    {
        this.productos = new ArrayList<>();
    }

    
    public void agregarProductoo(Producto producto)
    {
        if (!productoExiste(producto.getCodigo()))
        {
            productos.add(producto);
            System.out.println("Producto agregado: " + producto.getNombre());
        } else
        {
            System.out.println("Producto ya existe con ID: " + producto.getCodigo());
        }
    }

    @Override
    public void eliminarProducto(long idProducto)
    {
        Producto producto = buscarProductoPorCodigo(idProducto);
        if (producto != null)
        {
            productos.remove(producto);
            System.out.println("Producto eliminado con ID: " + idProducto);
        } else
        {
            System.out.println("Producto no encontrado con ID: " + idProducto);
        }
    }

    @Override
    public void modificarProducto(Producto producto)
    {
        Producto productoExistente = buscarProductoPorCodigo(producto.getCodigo());
        if (productoExistente != null)
        {
            int index = productos.indexOf(productoExistente);
            productos.set(index, producto);
            System.out.println("Producto modificado: " + producto.getNombre());
        } else
        {
            System.out.println("Producto no encontrado con ID: " + producto.getCodigo());
        }
    }

    @Override
    public Producto buscarProductoPorCodigo(long idProducto)
    {
        for (Producto producto : productos)
        {
            if (producto.getCodigo() == idProducto)
            {
                return producto;
            }
        }
        return null;
    }

    @Override
    public List<Producto> getListaProductos()
    {
        return new ArrayList<>(productos);
    }

    @Override
    public Producto buscarProductoPorNombre(String nombre)
    {
        for (Producto producto : productos)
        {
            if (producto.getNombre().equalsIgnoreCase(nombre))
            {
                return producto;
            }
        }
        return null;
    }

    @Override
    public void actualizarStock(long idProducto, int nuevaCantidad)
    {
        Producto producto = buscarProductoPorCodigo(idProducto);
        if (producto != null)
        {
            producto.setCantidadStock(nuevaCantidad);
            System.out.println("Stock actualizado para producto: " + producto.getNombre());
        } else
        {
            System.out.println("Producto no encontrado para actualización de stock.");
        }
    }

    @Override
    public boolean productoExiste(long idProducto)
    {
        return buscarProductoPorCodigo(idProducto) != null;
    }

    @Override
    public boolean agregarProducto(Producto producto)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
