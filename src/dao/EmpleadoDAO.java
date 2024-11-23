package dao;

import componenteEmpleado.IServicioEmpleado;
import conexion.Conexion;
import modelo.Empleado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO implements IServicioEmpleado
{

    @Override
    public void agregarEmpleado(Empleado empleado)
    {
        String sql = "INSERT INTO Empleados (Nombre, Dirección, Telefono, Sueldo) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, empleado.getNombre());
            pstmt.setString(2, empleado.getDireccion());
            pstmt.setString(3, empleado.getTelefono());
            pstmt.setDouble(4, empleado.getSueldo());

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0)
            {
                System.out.println("Empleado agregado con éxito.");
            } else
            {
                System.out.println("No se pudo agregar el empleado.");
            }
        } catch (SQLException e)
        {
            System.err.println("Error al agregar el empleado: " + e.getMessage());
        }
    }

    @Override
    public boolean eliminarEmpleado(long idEmpleado)
    {
        String sql = "DELETE FROM Empleados WHERE IdEmpleado = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setLong(1, idEmpleado);

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e)
        {
            System.err.println("Error al eliminar empleado: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean modificarEmpleado(Empleado empleado)
    {
        String sql = "UPDATE Empleados SET Nombre = ?, [Dirección] = ?, Telefono = ?, Sueldo = ? WHERE IdEmpleado = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, empleado.getNombre());
            pstmt.setString(2, empleado.getDireccion()); // Nota el uso de [Dirección] por la tilde
            pstmt.setString(3, empleado.getTelefono());
            pstmt.setDouble(4, empleado.getSueldo());
            pstmt.setLong(5, empleado.getId());

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e)
        {
            System.err.println("Error al modificar empleado: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Empleado> obtenerListaEmpleados()
    {
        List<Empleado> empleados = new ArrayList<>();
        String sql = "SELECT IdEmpleado, Nombre, Dirección, Telefono, Sueldo FROM Empleados";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery())
        {
            while (rs.next())
            {
                modelo.Empleado empleado = new modelo.Empleado();
                empleado.setId(rs.getLong("IdEmpleado"));
                empleado.setNombre(rs.getString("Nombre"));
                empleado.setDireccion(rs.getString("Dirección"));
                empleado.setTelefono(rs.getString("Telefono"));
                empleado.setSueldo(rs.getDouble("Sueldo"));
                empleados.add(empleado);
            }
        } catch (SQLException e)
        {
            System.err.println("Error al obtener los empleados: " + e.getMessage());
        }

        return empleados;
    }

    @Override
    public Empleado buscarEmpleadoPorId(Long idEmpleado)
    {
        String sql = "SELECT * FROM Empleados WHERE idEmpleado = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setLong(1, idEmpleado);

            try (ResultSet rs = pstmt.executeQuery())
            {
                if (rs.next())
                {
                    return convertirResultSetAEmpleado(rs);
                }
            }
        } catch (SQLException e)
        {
            System.err.println("Error al buscar empleado por ID: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Empleado> buscarEmpleadosPorNombre(String nombre)
    {
        List<Empleado> empleados = new ArrayList<>();
        String sql = "SELECT * FROM Empleados WHERE Nombre LIKE ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, "%" + nombre + "%");

            try (ResultSet rs = pstmt.executeQuery())
            {
                while (rs.next())
                {
                    empleados.add(convertirResultSetAEmpleado(rs));
                }
            }
        } catch (SQLException e)
        {
            System.err.println("Error al buscar empleados por nombre: " + e.getMessage());
        }
        return empleados;
    }

    /**
     * Método privado para convertir un ResultSet a un objeto Empleado.
     *
     * @param rs ResultSet con los datos del empleado.
     * @return Objeto Empleado con los datos del ResultSet.
     * @throws SQLException en caso de error al acceder a los datos.
     */
    private Empleado convertirResultSetAEmpleado(ResultSet rs) throws SQLException
    {
        return new Empleado(
                rs.getLong("idEmpleado"),
                rs.getString("Nombre"),
                rs.getString("Direccion"),
                rs.getString("Telefono"),
                rs.getDouble("Sueldo")
        );
    }

    public boolean existeNombre(String nombre)
    {
        String sql = "SELECT COUNT(*) AS total FROM Empleados WHERE Nombre = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, nombre);

            try (ResultSet rs = pstmt.executeQuery())
            {
                if (rs.next())
                {
                    return rs.getInt("total") > 0;
                }
            }
        } catch (SQLException e)
        {
            System.err.println("Error al verificar el nombre: " + e.getMessage());
        }
        return false;
    }

    public boolean existeNumero(String numero)
    {
        String sql = "SELECT COUNT(*) AS total FROM Empleados WHERE Telefono = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, numero);

            try (ResultSet rs = pstmt.executeQuery())
            {
                if (rs.next())
                {
                    return rs.getInt("total") > 0;
                }
            }
        } catch (SQLException e)
        {
            System.err.println("Error al verificar el número: " + e.getMessage());
        }
        return false;
    }

}
