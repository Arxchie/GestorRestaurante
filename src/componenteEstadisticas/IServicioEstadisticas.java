/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package componenteEstadisticas;

import java.time.LocalDate;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author HP
 */
public interface IServicioEstadisticas
{
    List<Producto> getProductosMasVendidos();
    double ingresosPorFecha(LocalDate fechaInicial, LocalDate fechaFinal);
//    double egresosPorFecha(LocalDate fechaInicial, LocalDate fechaFinal);
    //double balancePorFecha(LocalDate fecha);
    double totalVentasPorProducto(Producto producto);
}
