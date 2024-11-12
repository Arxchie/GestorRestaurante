package componenteTiket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.DetalleVenta;
import modelo.Producto;

public class TicketGenerator {

    public static void generarTiket(Ticket ticket) {
        if (ticket != null) {

            System.out.println("codigo: "+ticket.getCodogoVenta());
            System.out.println(detalles(ticket.getDetalles()));
        }
    }
    
    private static String detalles(List<DetalleVenta> detalles){
        String s="cantidad \t producto\n";
        for (DetalleVenta d:detalles) {
            s+=d.getCantidadProducto()+"\t\t"+d.getProducto().getNombre()+"\n";
        }
        return s;
    }
    public static void main(String[] args) {
        Producto p1=new Producto("coca", "bebidas", 10, 20, "", 20, "Pieza");
        Producto p2=new Producto("Hamburguesa", "comida", 30, 60, "", 20, "Pieza");
        DetalleVenta d1=new DetalleVenta(p1, 10);
        DetalleVenta d2=new DetalleVenta(p2, 10);
  
        Ticket miTiket=new Ticket(123L, 321L, "", LocalDate.now(), new ArrayList<>(), 12.0, 20, 32);
        miTiket.getDetalles().add(d1);
        miTiket.getDetalles().add(d2);
        generarTiket(miTiket);
    }
    }

