
package componenteVenta;

import java.time.LocalDate;
import java.util.List;
import modelo.Venta;



/**
 *
 * @author HP
 */
public interface IServicioVentas
{
    void finalizarVenta(long idVenta);
    void agregarVenta(Venta venta);
    Venta buscarVentaPorId(long idVenta);
    List<Venta> obtenerListaVentas(); 
    boolean eliminarVenta(long idVenta); 
    void actualizarVenta(Venta venta); 
    double calcularIngresosTotales(); 
    List<Venta> buscarVentasPorFecha(LocalDate fecha); 
    List<Venta> buscarVentasPorRangoDeFecha(LocalDate fechaInicial,LocalDate fechaFinal); 
    double obtenerTotalVentas();
}
