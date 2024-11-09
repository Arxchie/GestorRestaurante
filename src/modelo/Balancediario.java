/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import componenteBalanceDiario.IServicioBalanceDiario;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Balancediario implements IServicioBalanceDiario
{

    private long id;
    private double ingresos;
    private double egresos;
    private LocalDate fecha;

    public Balancediario()
    {
        this.ingresos = 0;
        this.egresos = 0;
        this.fecha = LocalDate.now();
    }


    public long getId()
    {
        return id;
    }

    public double getIngresos()
    {
        return ingresos;
    }

    public void setIngresos(double ingresos)
    {
        this.ingresos = ingresos;
    }

    public double getEgresos()
    {
        return egresos;
    }

    public void setEgresos(double egresos)
    {
        this.egresos = egresos;
    }

    public LocalDate getFecha()
    {
        return fecha;
    }

    public void setFecha(LocalDate fecha)
    {
        this.fecha = fecha;
    }
    @Override
    public void agregarIngreso(double cantidad)
    {
        setIngresos(getIngresos() + cantidad);
    }

    @Override
    public void agregarEgreso(double cantidad)
    {
        setEgresos(getEgresos() + cantidad);

    }

    @Override
    public double calcularBalance()
    {
        return getIngresos() - getEgresos();
    }

    @Override
    public boolean esBalancePositivo()
    {
        return getIngresos() > getEgresos();

    }
}
