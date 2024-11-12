/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteTiket;

import java.time.LocalDate;
import java.util.List;
import modelo.DetalleVenta;

/**
 *
 * @author User
 */
public class Ticket {
    private long codogoVenta;
    private long codigoCliente;
    private String anotaciones;
    private LocalDate fecha;
    private List <DetalleVenta> detalles;
    private double IvaAPagar;
    private double subtotal;
    private double total;

    public Ticket(long codogoVenta, long codigoCliente, String anotaciones, LocalDate fecha, List<DetalleVenta> detalles, double IvaAPagar, double subtotal, double total) {
        this.codogoVenta = codogoVenta;
        this.codigoCliente = codigoCliente;
        this.anotaciones = anotaciones;
        this.fecha = fecha;
        this.detalles = detalles;
        this.IvaAPagar = IvaAPagar;
        this.subtotal = subtotal;
        this.total = total;
    }

    /**
     * @return the codogoVenta
     */
    public long getCodogoVenta() {
        return codogoVenta;
    }

    /**
     * @param codogoVenta the codogoVenta to set
     */
    public void setCodogoVenta(long codogoVenta) {
        this.codogoVenta = codogoVenta;
    }

    /**
     * @return the codigoCliente
     */
    public long getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * @param codigoCliente the codigoCliente to set
     */
    public void setCodigoCliente(long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * @return the anotaciones
     */
    public String getAnotaciones() {
        return anotaciones;
    }

    /**
     * @param anotaciones the anotaciones to set
     */
    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    /**
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the detalles
     */
    public List <DetalleVenta> getDetalles() {
        return detalles;
    }

    /**
     * @param detalles the detalles to set
     */
    public void setDetalles(List <DetalleVenta> detalles) {
        this.detalles = detalles;
    }

    /**
     * @return the IvaAPagar
     */
    public double getIvaAPagar() {
        return IvaAPagar;
    }

    /**
     * @param IvaAPagar the IvaAPagar to set
     */
    public void setIvaAPagar(double IvaAPagar) {
        this.IvaAPagar = IvaAPagar;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
}
