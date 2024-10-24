/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package componenteProductos;

import java.util.List;

/**
 *
 * @author HP
 */
public interface IServicioProductos
{
    void agregarProducto(IProducto producto);          
    void eliminarProducto(long idProducto);            
    void modificarProducto(IProducto producto);        
    IProducto buscarProductoPorId(long idProducto);    
    List<IProducto> getListaProductos();                 
    IProducto buscarProductoPorNombre(String nombre);  
    void actualizarStock(int nuevaCantidad); 
    boolean productoExiste(long idProducto);        
}
