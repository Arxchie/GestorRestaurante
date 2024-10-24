package componenteVenta;

import componenteProductos.IProducto;

/**
 *
 * @author HP
 */
public interface IDetalleVenta
{
    float calcularSubtotalDetalle();
    int getCantidadProducto();
    IProducto getProducto();
    void setCantidadProducto(int cantidad);  // Para modificar la cantidad
    void setProducto(IProducto producto);
}
