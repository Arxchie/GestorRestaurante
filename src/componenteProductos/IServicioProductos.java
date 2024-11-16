/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package componenteProductos;

import java.util.List;
import modelo.Producto;

/**
 *
 * @author HP
 */
public interface IServicioProductos
{
    boolean agregarProducto(Producto producto);          
    void eliminarProducto(long codigoProducto);            
    void modificarProducto(Producto producto);        
    Producto buscarProductoPorCodigo(long codigoProducto);    
    List<Producto> getListaProductos();                 
    Producto buscarProductoPorNombre(String nombre);  
    void actualizarStock(long idProducto,int nuevaCantidad); 
    boolean productoExiste(long idProducto);        
}
