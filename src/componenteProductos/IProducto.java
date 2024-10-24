
package componenteProductos;

/**
 *
 * @author HP
 */
public interface IProducto
{
    void agregarCantidadProducto(int cantidad);
    boolean reducirCantidadProducto(int cantidad);
    long getId();                            
    String getNombre();                      
    float getPrecio();                      
    int getCantidad();                       
    void setNombre(String nombre);           
    void setPrecio(float precio);           
    void setCantidad(int cantidad);         
    
}
