package componenteEmpleado;

import java.util.List;
import modelo.Empleado;

public interface IServicioEmpleado
{

    void agregarEmpleado(Empleado empleado);

    boolean eliminarEmpleado(long idEmpleado);

    boolean modificarEmpleado(Empleado empleado);

    List<Empleado> obtenerListaEmpleados();

    Empleado buscarEmpleadoPorId(Long idEmpleado);

    List<Empleado> buscarEmpleadosPorNombre(String nombre);
    
    boolean existeNombre(String nombre);
    
    boolean existeNumero(String numero);
}
    