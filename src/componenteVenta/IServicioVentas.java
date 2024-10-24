
package componenteVenta;

import java.time.LocalDate;
import java.util.List;



/**
 *
 * @author HP
 */
public interface IServicioVentas
{
    void finalizarVenta(long idVenta);
    void agregarVenta(IVenta venta);
    IVenta buscarVentaPorId(long idVenta);
    List<IVenta> obtenerListaVentas(); 
    boolean eliminarVenta(long idVenta); 
    void actualizarVenta(IVenta venta); 
    double calcularIngresosTotales(); 
    List<IVenta> buscarVentasPorFecha(LocalDate fecha); 
    List<IVenta> buscarVentasPorRangoDeFecha(LocalDate fechaInicial,LocalDate fechaFinal); 
    
}
