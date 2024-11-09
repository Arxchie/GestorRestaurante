/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author HP
 */
public class Producto 
{
    
    private long codigo;
    private String nombre;
    private String categoria;
    private float costoCompra;
    private float precioVenta;
    private String descripcion;
    private int cantidadStock;
    private String unidadDeMedida;

    public Producto(String nombre, String categoria, float costoCompra, float precioVenta, String descripcion, int cantidadStock, String unidadDeMedida)
    {
        this.nombre = nombre;
        this.categoria = categoria;
        this.costoCompra = costoCompra;
        this.precioVenta = precioVenta;
        this.descripcion = descripcion;
        this.cantidadStock  = cantidadStock;
        this.unidadDeMedida = unidadDeMedida;
    }
    public void setCodigo(long codigo)
    {
        this.codigo=codigo;
    }
    
    public long getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String getCategoria()
    {
        return categoria;
    }

    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }

    public float getCostoCompra()
    {
        return costoCompra;
    }

    public void setCostoCompra(float costoCompra)
    {
        this.costoCompra = costoCompra;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public String getUnidadDeMedida()
    {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida)
    {
        this.unidadDeMedida = unidadDeMedida;
    }

    public void agregarCantidadProducto(int cantidad)
    {
        this.cantidadStock += cantidad;
    }


    public boolean reducirCantidadProducto(int cantidad)
    {
        if (this.cantidadStock >= cantidad)
        {
            this.cantidadStock -= cantidad;
            return true;
        } else
        {
            return false;
        }
    }

   
    public String getNombre()
    {
        return this.nombre;
    }

  
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public float getPrecioVenta()
    {
        return this.precioVenta;
    }

    public int getCantidadStock()
    {
        return this.cantidadStock;
    }

  
    public void setPrecioVenta(float precio)
    {
        this.precioVenta = precio;
    }

  
    public void setCantidadStock(int cantidad)
    {
        this.cantidadStock = cantidad;
    }


    public void setCodigo(Long codigo)
    {
        this.codigo=codigo;
    }

}
