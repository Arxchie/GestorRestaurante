/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteVenta;

import java.util.List;
import modelo.Venta;

/**
 *
 * @author HP
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorVentaMesas implements Serializable {
    private List<Venta> ventasPorMesa;

    public GestorVentaMesas() {
        this.ventasPorMesa = new ArrayList<>();
    }

    // Agregar una venta al gestor
    public void agregarVenta(Venta venta) {
        ventasPorMesa.add(venta);
    }

    // Eliminar una venta del gestor
    public void eliminarVenta(Venta venta) {
        ventasPorMesa.remove(venta);
    }

    // Obtener todas las ventas
    public List<Venta> getVentas() {
        return ventasPorMesa;
    }


    // Guardar las ventas en un archivo
    public void guardarVentas(String archivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(ventasPorMesa);
        }
    }

    // Cargar las ventas desde un archivo
    public void cargarVentas(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            this.ventasPorMesa = (List<Venta>) ois.readObject();
        }
    }
}

