
package componenteBalanceDiario;

/**
 *
 * @author HP
 */
import java.time.LocalDate;

public interface IServicioBalanceDiario {
    void agregarIngreso(double cantidad);
    void agregarEgreso(double cantidad);
    double calcularBalance();
    double getIngresos();
    double getEgresos();
    LocalDate getFechaBalance();
    void setFechaBalance(LocalDate fecha); 
    boolean esBalancePositivo(); 
}
