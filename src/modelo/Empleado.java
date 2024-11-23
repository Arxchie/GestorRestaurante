package modelo;

/**
 *
 * @author HP
 */
public class Empleado
{
    private long id;
    private String nombre;
    private String direccion;
    private String telefono;
    private double sueldo;

    public Empleado()
    {
    }

    public Empleado(long id,String nombre, String direccion, String telefono, double sueldo)
    {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }
    public Empleado(String nombre, String direccion, String telefono, double sueldo)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    /**
     * @return the id
     */
    public long getId()
    {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion()
    {
        return direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono()
    {
        return telefono;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo()
    {
        return sueldo;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo)
    {
        this.sueldo = sueldo;
    }
    
}
