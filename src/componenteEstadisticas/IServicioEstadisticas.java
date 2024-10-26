/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package componenteEstadisticas;

import componenteProductos.IProducto;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IServicioEstadisticas
{
    List<IProducto> getProductosMasVendidos(LocalDate fecha);
    double ingresosPorFecha(LocalDate fechaInicial, LocalDate fechaFinal);
    double egresosPorFecha(LocalDate fechaInicial, LocalDate fechaFinal);
    double balancesPorFecha(LocalDate fechaInicial, LocalDate fechaFinal);
    double totalVentasPorProducto(IProducto producto);
}
