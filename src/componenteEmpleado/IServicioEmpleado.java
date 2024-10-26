
package componenteEmpleado;

import java.util.List;
import modelo.Empleado;


public interface IServicioEmpleado {
    boolean agregarEmpleado(Empleado empleado);              
    boolean eliminarEmpleado(Long idEmpleado);                
    boolean modificarEmpleado(Empleado empleado);            
    List<Empleado> obtenerListaEmpleados();                   
    Empleado buscarEmpleadoPorId(Long idEmpleado);           
    List<Empleado> buscarEmpleadosPorNombre(String nombre);   
}

