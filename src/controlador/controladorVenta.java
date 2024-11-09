package controlador;

import componenteVenta.IServicioVentas;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Balancediario;
import modelo.Venta;

public class controladorVenta implements IServicioVentas {
    
    private Balancediario balance;
    private List<Venta> ventasFinalizadas;
    private List<Venta> ventasActivas;
    
    public controladorVenta() {
        this.balance = new Balancediario();
        this.ventasFinalizadas = new ArrayList<>();
        this.ventasActivas = new ArrayList<>();
    }

    @Override
    public void finalizarVenta(long idVenta) {
        Venta venta = buscarVentaPorId(idVenta);
        if (venta != null && ventasActivas.contains(venta)) {
            ventasActivas.remove(venta);
            ventasFinalizadas.add(venta);
            balance.agregarIngreso(venta.calcularTotal());
            System.out.println("Venta finalizada: " + idVenta);
        } else {
            System.out.println("Venta no encontrada o ya finalizada.");
        }
    }

    @Override
    public void agregarVenta(Venta venta) {
        ventasActivas.add(venta);
        System.out.println("Venta agregada: " + venta.getIdVenta());
    }

    @Override
    public Venta buscarVentaPorId(long idVenta) {
        for (Venta venta : ventasActivas) {
            if (venta.getIdVenta() == idVenta) {
                return venta;
            }
        }
        for (Venta venta : ventasFinalizadas) {
            if (venta.getIdVenta() == idVenta) {
                return venta;
            }
        }
        return null;
    }

    @Override
    public List<Venta> obtenerListaVentas() {
        List<Venta> todasLasVentas = new ArrayList<>(ventasActivas);
        todasLasVentas.addAll(ventasFinalizadas);
        return todasLasVentas;
    }

    @Override
    public boolean eliminarVenta(long idVenta) {
        Venta venta = buscarVentaPorId(idVenta);
        if (venta != null) {
            ventasActivas.remove(venta);
            ventasFinalizadas.remove(venta);
            System.out.println("Venta eliminada: " + idVenta);
            return true;
        }
        System.out.println("Venta no encontrada.");
        return false;
    }

    @Override
    public double calcularIngresosTotales() {
        double totalIngresos = 0;
        for (Venta venta : ventasFinalizadas) {
            totalIngresos += venta.calcularTotal();
        }
        return totalIngresos;
    }

    @Override
    public List<Venta> buscarVentasPorFecha(LocalDate fecha) {
        List<Venta> ventasEnFecha = new ArrayList<>();
        for (Venta venta : ventasFinalizadas) {
            if (venta.getFecha().equals(fecha)) {
                ventasEnFecha.add(venta);
            }
        }
        return ventasEnFecha;
    }

    @Override
    public List<Venta> buscarVentasPorRangoDeFecha(LocalDate fechaInicial, LocalDate fechaFinal) {
        List<Venta> ventasEnRango = new ArrayList<>();
        for (Venta venta : ventasFinalizadas) {
            if ((venta.getFecha().isEqual(fechaInicial) || venta.getFecha().isAfter(fechaInicial)) &&
                (venta.getFecha().isEqual(fechaFinal) || venta.getFecha().isBefore(fechaFinal))) {
                ventasEnRango.add(venta);
            }
        }
        return ventasEnRango;
    }

    @Override
    public void actualizarVenta(Venta venta) {
        Venta ventaExistente = buscarVentaPorId(venta.getIdVenta());
        if (ventaExistente != null && ventasActivas.contains(ventaExistente)) {
            ventasActivas.remove(ventaExistente);
            ventasActivas.add(venta);
            System.out.println("Venta actualizada: " + venta.getIdVenta());
        } else {
            System.out.println("Venta no encontrada o no activa.");
        }
    }
}
