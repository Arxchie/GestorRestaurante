/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteVenta;

import java.io.Serializable;
import modelo.Venta;

/**
 *
 * @author HP
 */

// Clase auxiliar para guardar los datos de un botón
class BotonMesa implements Serializable {
    private String texto; // Texto del botón
    private int x, y, width, height; // Posición y tamaño del botón
    private Venta venta; // ID o referencia a la venta asociada

    public BotonMesa(String texto, int x, int y, int width, int height, Venta venta) {
        this.texto = texto;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.venta = venta;
    }

    // Getters
    public String getTexto() {
        return texto;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Venta getIdVenta() {
        return venta;
    }
}