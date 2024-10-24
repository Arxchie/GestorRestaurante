
package componenteVenta;

import componenteProductos.IProducto;
import java.util.List;

/**
 *
 * @author HP
 */

public interface IVenta
{
    boolean agregarDetalle(IDetalleVenta detalle); 
    boolean eliminarDetalle(IDetalleVenta detalle);
    List<IDetalleVenta> getListaDetalles();
    void setListaDetalles(List<IDetalleVenta> detalles); 
    boolean validarVenta(); 
    IDetalleVenta buscarDetallePorProducto(IProducto producto); 
    float calcularSubTotalVenta();
    float calcularTotal();
    float calcularImpuestos(float porcentajeImpuesto);
}
