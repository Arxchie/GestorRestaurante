/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteVenta;

/**
 *
 * @author HP
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Venta;


public class GestorBotones {

    // Guardar botones en un archivo
    public void guardarBotones(List<JButton> botones, String archivo) throws IOException {
        List<BotonMesa> datosBotones = new ArrayList<>();
        for (JButton boton : botones) {
            // Extraer la información necesaria del botón
            String texto = boton.getText();
            Rectangle bounds = boton.getBounds();
            Venta venta = (Venta) boton.getClientProperty("venta"); // Asume que el botón tiene este atributo

            // Crear un objeto serializable con los datos del botón
            datosBotones.add(new BotonMesa(
                    texto,
                    bounds.x,
                    bounds.y,
                    bounds.width,
                    bounds.height,
                    venta
            ));
        }

        // Guardar la lista de datos en un archivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(datosBotones);
        }
    }

    // Cargar botones desde un archivo
    public List<JButton> cargarBotones(String archivo, JPanel panel, ActionListener listener) throws IOException, ClassNotFoundException {
        List<JButton> botones = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            List<BotonMesa> datosBotones = (List<BotonMesa>) ois.readObject();

            // Recrear los botones desde los datos cargados
            for (BotonMesa datos : datosBotones) {
                JButton boton = new JButton(datos.getTexto());
                boton.setBounds(datos.getX(), datos.getY(), datos.getWidth(), datos.getHeight());
                boton.putClientProperty("venta", datos.getIdVenta());
                boton.addActionListener(listener); // Asocia el listener necesario para manejar los clics
                botones.add(boton);
                panel.add(boton); // Agregar al panel
            }
        }

        return botones;
    }
}

