package modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author chemo
 */
public class CorteDeCaja
{

    private long idCorteDeCaja;
    private long idEmpleado;
    private Date fechaCorte;
    private double totalDeIngresos;
    private double dineroEnCaja;
    private List<Long> idsVentas;

    public CorteDeCaja()
    {
    }

    public CorteDeCaja(long idEmpleado, Date fechaCorte, double totalDeIngresos, double dineroEnCaja, List<Long> idsVentas)
    {
        this.idEmpleado = idEmpleado;
        this.fechaCorte = fechaCorte;
        this.totalDeIngresos = totalDeIngresos;
        this.dineroEnCaja = dineroEnCaja;
        this.idsVentas = idsVentas;
    }

//    public CorteDeCaja(long idEmpleado, Date fechaCorte, double totalDeIngresos, double dineroEnCaja)
//    {
//        this.idEmpleado = idEmpleado;
//        this.fechaCorte = fechaCorte;
//        this.totalDeIngresos = totalDeIngresos;
//        this.dineroEnCaja = dineroEnCaja;
//    }
    public List<Long> getIdsVentas()
    {
        return idsVentas;
    }

    public void setIdsVentas(List<Long> idsVentas)
    {
        this.idsVentas = idsVentas;
    }

    /**
     * @return the idCorteDeCaja
     */
    public long getIdCorteDeCaja()
    {
        return idCorteDeCaja;
    }

    /**
     * @param idCorteDeCaja the idCorteDeCaja to set
     */
    public void setIdCorteDeCaja(long idCorteDeCaja)
    {
        this.idCorteDeCaja = idCorteDeCaja;
    }

    /**
     * @return the idEmpleado
     */
    public long getIdEmpleado()
    {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(long idEmpleado)
    {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the fechaCorte
     */
    public Date getFechaCorte()
    {
        return fechaCorte;
    }

    /**
     * @param fechaCorte the fechaCorte to set
     */
    public void setFechaCorte(Date fechaCorte)
    {
        this.fechaCorte = fechaCorte;
    }

    /**
     * @return the totalDeIngresos
     */
    public double getTotalDeIngresos()
    {
        return totalDeIngresos;
    }

    /**
     * @param totalDeIngresos the totalDeIngresos to set
     */
    public void setTotalDeIngresos(double totalDeIngresos)
    {
        this.totalDeIngresos = totalDeIngresos;
    }

    /**
     * @return the dineroEnCaja
     */
    public double getDineroEnCaja()
    {
        return dineroEnCaja;
    }

    /**
     * @param dineroEnCaja the dineroEnCaja to set
     */
    public void setDineroEnCaja(double dineroEnCaja)
    {
        this.dineroEnCaja = dineroEnCaja;
    }

}
