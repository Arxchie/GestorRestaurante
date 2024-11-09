package modelo;



/**
 * Clase que representa un detalle de venta en una transacción de venta,
 * implementa la interfaz IDetalleVenta.
 */
public class DetalleVenta 
{

    private Producto producto;
    private int cantidad;
    private float subTotal;

    public DetalleVenta(Producto producto, int cantidad)
    {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subTotal = (producto != null) ? cantidad * producto.getPrecioVenta() : 0;
    }

    public int getCantidadProducto()
    {
        return cantidad;
    }

    public void setCantidadProducto(int cantidad)
    {
        this.cantidad = cantidad;
        calcularSubtotalDetalle(); // Recalcula subtotal al actualizar cantidad
    }

    public float getSubTotal()
    {
        return subTotal;
    }

    public Producto getProducto()
    {
        return producto;
    }

    public void setProducto(Producto producto)
    {
        this.producto = producto;
        calcularSubtotalDetalle(); // Recalcula subtotal al actualizar producto
    }


    private float calcularSubtotalDetalle()
    {
        if (producto != null)
        {
            this.subTotal = cantidad * producto.getPrecioVenta(); // Evita variable temporal
            return subTotal;
        }
        return 0; // Retorna 0 si producto es null para evitar valores negativos
    }


 

}
