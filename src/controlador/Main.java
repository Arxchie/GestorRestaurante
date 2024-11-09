/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import componenteProductos.*;
import componenteVenta.*;
import modelo.DetalleVenta;

import modelo.Producto;
import modelo.Venta;

/**
 *
 * @author HP
 */
public class Main
{

    public static void main(String[] args)
    {
        IServicioVentas controlVenta = new controladorVenta();
        IServicioProductos controlProductos = new controladorProducto();
        
        Producto p1 = new Producto("coca", "bebidas", 18, 25, "", 10, "Pieza");
        Producto p2 = new Producto("pizza", "comida Rapida", 0, 25, "", 10, "Pieza");
     
        p1.setCodigo(1L);
        p2.setCodigo(2L);
        
        controlProductos.agregarProducto(p1);
        controlProductos.agregarProducto(p2);
        
        DetalleVenta detalle=new DetalleVenta(controlProductos.buscarProductoPorCodigo(1), 4);
        
        Venta venta=new Venta();
        venta.agregarDetalle(detalle);
        System.out.println(    "Codigo: "+venta.getIdVenta());
        System.out.println(     "Fecha: "+venta.getFecha());
        for (DetalleVenta d:venta.getListaDetalles())
        {
            System.out.println(d.getProducto().getNombre()+" "+d.getCantidadProducto());
        }
        
        System.out.println(     "Subtotal: "+venta.calcularSubTotalVenta());
        System.out.println(   "IVA: "+  venta.calcularImpuestos(0.16F));
        System.out.println(     "Total: "+venta.calcularTotal());
        controlVenta.agregarVenta(venta);
        controlVenta.finalizarVenta(0);
        controlVenta.buscarVentaPorId(0).getIdVenta();
        System.out.println();
        


    }
}
