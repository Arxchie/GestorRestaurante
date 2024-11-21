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
    List<Object[]> getProductosMasVendidos();
    double ingresosPorFecha(LocalDate fechaInicial, LocalDate fechaFinal);
    double totalVentasPorProducto(Producto producto);
    List<Object[]> obtenerTotalesVentasPorProducto();
    List<Object[]> getStockPorProducto();
}
