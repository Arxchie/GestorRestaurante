package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta
{

    private LocalDate fecha;
    private long codigoVenta;
    private String anotaciones;
    private double subTotal;
    private double total;
    private List<DetalleVenta> detallesVenta;
    private double descuento;

    public Venta()
    {
        this.fecha = LocalDate.now();
        this.detallesVenta = new ArrayList<>();
        this.subTotal = 0;
        this.total = 0;
        this.descuento = 0;
        this.anotaciones = "";
    }

    public double getDescuento()
    {
        return descuento;
    }

    public void setDescuento(double descuento)
    {
        this.descuento = descuento;
    }
    
    public List<DetalleVenta> getListaDetalles()
    {
        return detallesVenta;
    }

//    public void setListaDetalles(List<DetalleVenta> detalles)
//    {
//        this.detallesVenta = detalles;
//    }

    public LocalDate getFecha()
    {
        return fecha;
    }

    public void setFecha(LocalDate fecha)
    {
        this.fecha = fecha;
    }

    public long getCodigoVenta()
    {
        return codigoVenta;
    }

    public String getAnotaciones()
    {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones)
    {
        this.anotaciones = anotaciones;
    }

    public double getSubTotal()
    {
        return subTotal;
    }

    public double getTotal()
    {
        return total;
    }

    public long getIdVenta()
    {
        return codigoVenta;
    }

    public DetalleVenta buscarDetallePorProducto(Producto producto)
    {
        for (DetalleVenta detalle : detallesVenta)
        {
            if (detalle.getProducto().equals(producto))
            {
                return detalle;
            }
        }
        return null;
    }

    public boolean agregarDetalle(DetalleVenta detalle)
    {
        if (detallesVenta != null)
        {
            detallesVenta.add(detalle);
            return true;
        }
        return false;
    }

    public boolean eliminarDetalle(DetalleVenta detalle)
    {
        if (detallesVenta != null)
        {
            detallesVenta.remove(detalle);
            return true;
        }
        return false;
    }

    public boolean validarVenta()
    {
        return !detallesVenta.isEmpty();
    }

    public float calcularSubTotalVenta()
    {
        float sub = 0;
        for (DetalleVenta detalle : detallesVenta)
        {
            sub += detalle.getSubTotal();
        }
        this.subTotal = sub;
        return sub;
    }

    public float calcularTotal()
    {
        this.total = calcularSubTotalVenta() + calcularImpuestos(0.16f);
        return (float) total;
    }

    public float calcularImpuestos(float porcentajeImpuesto)
    {
        return (float) (subTotal * porcentajeImpuesto);
    }
}
