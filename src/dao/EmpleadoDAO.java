package dao;

import componenteEmpleado.IServicioEmpleado;
import conexion.Conexion;
import modelo.Empleado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO implements IServicioEmpleado {

    @Override
    public boolean agregarEmpleado(Empleado empleado) {
        String sql = "INSERT INTO Empleados (Nombre, Direccion, Telefono, Sueldo) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, empleado.getNombre());
            pstmt.setString(2, empleado.getDireccion());
            pstmt.setString(3, empleado.getTelefono());
            pstmt.setDouble(4, empleado.getSueldo());

            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al agregar empleado: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminarEmpleado(Long idEmpleado) {
        String sql = "DELETE FROM Empleados WHERE idEmpleado = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setLong(1, idEmpleado);

            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al eliminar empleado: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean modificarEmpleado(Empleado empleado) {
        String sql = "UPDATE Empleados SET Nombre = ?, Direccion = ?, Telefono = ?, Sueldo = ? WHERE idEmpleado = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, empleado.getNombre());
            pstmt.setString(2, empleado.getDireccion());
            pstmt.setString(3, empleado.getTelefono());
            pstmt.setDouble(4, empleado.getSueldo());
            pstmt.setLong(5, empleado.getId());

            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al modificar empleado: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Empleado> obtenerListaEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        String sql = "SELECT * FROM Empleados";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                empleados.add(convertirResultSetAEmpleado(rs));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener lista de empleados: " + e.getMessage());
        }
        return empleados;
    }

    @Override
    public Empleado buscarEmpleadoPorId(Long idEmpleado) {
        String sql = "SELECT * FROM Empleados WHERE idEmpleado = ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setLong(1, idEmpleado);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return convertirResultSetAEmpleado(rs);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar empleado por ID: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Empleado> buscarEmpleadosPorNombre(String nombre) {
        List<Empleado> empleados = new ArrayList<>();
        String sql = "SELECT * FROM Empleados WHERE Nombre LIKE ?";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + nombre + "%");

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    empleados.add(convertirResultSetAEmpleado(rs));
                }
            }
        } catch (SQLException e) {
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
    private Empleado convertirResultSetAEmpleado(ResultSet rs) throws SQLException {
        return new Empleado(
                rs.getLong("idEmpleado"),
                rs.getString("Nombre"),
                rs.getString("Direccion"),
                rs.getString("Telefono"),
                rs.getDouble("Sueldo")
        );
    }
}
