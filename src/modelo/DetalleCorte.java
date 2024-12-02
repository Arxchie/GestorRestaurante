/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author chemo
 */
public class DetalleCorte
{

    private long idDetalle; // Corresponde a la clave primaria "IdDetalle" (Autonumeración).
    private long idVenta;   // Corresponde al "IdVenta", la clave foránea que referencia una venta.
    private long idCorteDeCaja; // Corresponde al "IdCorteDeCaja", la clave foránea que referencia un corte de caja.

    // Constructor vacío
    public DetalleCorte()
    {
    }

    // Constructor con parámetros
    public DetalleCorte(long idDetalle, long idVenta, long idCorteDeCaja)
    {
        this.idDetalle = idDetalle;
        this.idVenta = idVenta;
        this.idCorteDeCaja = idCorteDeCaja;
    }

    // Getters y Setters
    public long getIdDetalle()
    {
        return idDetalle;
    }

    public void setIdDetalle(long idDetalle)
    {
        this.idDetalle = idDetalle;
    }

    public long getIdVenta()
    {
        return idVenta;
    }

    public void setIdVenta(long idVenta)
    {
        this.idVenta = idVenta;
    }

    public long getIdCorteDeCaja()
    {
        return idCorteDeCaja;
    }

    public void setIdCorteDeCaja(long idCorteDeCaja)
    {
        this.idCorteDeCaja = idCorteDeCaja;
    }

    @Override
    public String toString()
    {
        return "DetalleCorte{"
                + "idDetalle=" + idDetalle
                + ", idVenta=" + idVenta
                + ", idCorteDeCaja=" + idCorteDeCaja
                + '}';
    }
}
