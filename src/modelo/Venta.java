package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta implements Serializable
{

  
    private long codigoVenta;
    private LocalDate fecha;
    private String anotaciones;
    private float subTotal;
    private float total;
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

    public float getSubTotal()
    {
        return subTotal;
    }

    public float getTotal()
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
        // Validar que la lista de detalles exista
        if (detallesVenta == null)
        {
            return false;
        }

        // Validar que el detalle no sea nulo
        if (detalle == null || detalle.getProducto() == null)
        {
            return false;
        }

        // Buscar el detalle existente basado en el producto
        DetalleVenta detalleExistente = buscarDetallePorNombre(detalle.getProducto().getNombre());

        if (detalleExistente == null)
        {
            // Si no existe, agregarlo a la lista
            detallesVenta.add(detalle);
        } else
        {
            // Si ya existe, actualizar la cantidad
            int nuevaCantidad = detalleExistente.getCantidadProducto() + detalle.getCantidadProducto();
            detalleExistente.setCantidadProducto(nuevaCantidad);
        }
        calcularSubTotalVenta();
        calcularTotal();

        return true;
    }

    public boolean eliminarDetalle(DetalleVenta detalle)
    {
        if (detallesVenta != null)
        {
            detallesVenta.remove(detalle);
            calcularSubTotalVenta();
            calcularTotal();
            return true;
        }
        return false;
    }

    public DetalleVenta buscarDetallePorNombre(String nombre)
    {
        for (DetalleVenta detalle : detallesVenta)
        {
            if (detalle.getProducto().getNombre().equals(nombre))
            {
                return detalle;
            }
        }
        return null;
    }
    public boolean reducirCantidadPorProducto(Producto producto, int cantidad)
    {
        if (producto == null || cantidad <= 0)
        {
            // Validación de entrada
            return false;
        }

        // Buscar el detalle correspondiente al producto
        DetalleVenta detalle = buscarDetallePorProducto(producto);

        if (detalle != null)
        {
            // Intentar reducir la cantidad
            boolean reducido = detalle.reducirCantidad(cantidad);

            if (detalle.getCantidadProducto() == 0)
            {
                // Si la cantidad del detalle llega a 0, eliminarlo de la lista
                detallesVenta.remove(detalle);
            }
            calcularSubTotalVenta();
            calcularTotal();
            return reducido;
        }

        // Si no se encuentra el producto en la venta
        return false;
    }

    public boolean isValida()
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

    public List<DetalleVenta> getDetallesVenta()
    {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVenta> detallesVenta)
    {
        this.detallesVenta = detallesVenta;
    }

    public float calcularTotal()
    {
        this.total = calcularSubTotalVenta() + calcularImpuestos();
        return (float) total;
    }

    public float calcularImpuestos()
    {
        float porcentajeImpuesto=0.16f;
        return (float) (subTotal * porcentajeImpuesto);
    }

    @Override
    public String toString()
    {
        StringBuilder detalles = new StringBuilder();
        if (detallesVenta != null && !detallesVenta.isEmpty())
        {
            for (DetalleVenta detalle : detallesVenta)
            {
                detalles.append("\n  ").append(detalle.getProducto().getNombre() + " " + detalle.getCantidadProducto());
            }
        } else
        {
            detalles.append("No hay detalles de venta.");
        }

        return "Venta {"
                + "\n  Código de Venta: " + codigoVenta
                + "\n  Fecha: " + (fecha != null ? fecha.toString() : "No especificada")
                + "\n  Anotaciones: " + (anotaciones != null ? anotaciones : "Ninguna")
                + "\n  Subtotal: $" + String.format("%.2f", subTotal)
                + "\n  Descuento: $" + String.format("%.2f", descuento)
                + "\n  Total: $" + String.format("%.2f", total)
                + "\n  Detalles de Venta: " + detalles
                + "\n}";
    }

}
