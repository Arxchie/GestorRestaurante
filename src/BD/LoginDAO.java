/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Login;

/**
 *
 * @author HP
 */
public class LoginDAO
{
   public static void main(String[] args)
   {
        guardarUsuarioEnBD("Admin", "1234");
        System.out.println(verificarContraseñaBD("Admin", "1234"));
        System.out.println(cambiarContrasenia("Admin", "1111"));
        System.out.println(cargarUsuarioPorNombre("Admin"));
        
        
   }
    
    public static void guardarUsuarioEnBD(String nombreUsuario, String contrasenia)
    {
        if (!existeUsuario(nombreUsuario))
        {
            String sql = "INSERT INTO Usuario (nombreUsuario, contrasenia) VALUES (?, ?)";
            try (Connection connection = Conexion.conectar(); PreparedStatement pstmt = connection.prepareStatement(sql))
            {
                pstmt.setString(1, nombreUsuario);
                pstmt.setString(2, contrasenia);
                pstmt.executeUpdate();
                System.out.println("Contraseña guardada correctamente.");
            } catch (SQLException e)
            {
                System.err.println("Error al guardar la contraseña: " + e.getMessage());
            }
        }else
        {
            System.out.println("Ya existe ese usuario");
        }
        
    }

    public static boolean verificarContraseñaBD(String nombreUsuario, String contrasenia)
    {
        String sql = "SELECT contrasenia FROM Usuario WHERE nombreusuario = ?";
        try (Connection connection = Conexion.conectar(); PreparedStatement pstmt = connection.prepareStatement(sql))
        {
            pstmt.setString(1, nombreUsuario);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next())
            {
                String hashGuardado = rs.getString("contrasenia");
                return hashGuardado.equals(contrasenia);
            }
        } catch (SQLException e)
        {
            System.err.println("Error al verificar la contraseña: " + e.getMessage());
        }
        return false;
    }

    public static boolean existeUsuario(String nombreUsuario)
    {
        String sql = "SELECT COUNT(*) FROM Usuario WHERE nombreusuario = ?";
        try (Connection connection = Conexion.conectar(); PreparedStatement pstmt = connection.prepareStatement(sql))
        {

            pstmt.setString(1, nombreUsuario);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next())
            {
                // Si el recuento es mayor que 0, hay una contraseña establecida
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e)
        {
            System.err.println("Error al verificar si la contraseña está establecida: " + e.getMessage());
        }
        return false; // Retorna false si no se encuentra una contraseña
    }

    public static Login cargarUsuarioPorNombre(String nombreUsuario)
    {
        String sql = "SELECT contrasenia FROM Usuario WHERE nombreusuario = ?";
        Login usuario = null;

        try (Connection connection = Conexion.conectar(); PreparedStatement pstmt = connection.prepareStatement(sql))
        {

            pstmt.setString(1, nombreUsuario);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next())
            {

                String contraseniaHash = rs.getString("contrasenia");
                usuario = new Login(contraseniaHash);

            }
        } catch (SQLException e)
        {
            System.err.println("Error al cargar el usuario: " + e.getMessage());
        }
        return usuario;
    }

    public static boolean cambiarContrasenia(String nombreUsuario, String nuevaContrasenia)
    {
        String sql = "UPDATE Usuario SET contrasenia = ? WHERE nombreusuario = ?";
        try (Connection connection = Conexion.conectar(); PreparedStatement pstmt = connection.prepareStatement(sql))
        {
  
            pstmt.setString(1, nuevaContrasenia);
            pstmt.setString(2, nombreUsuario);

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0; // Retorna true si se actualizó al menos una fila
        } catch (SQLException e)
        {
            System.err.println("Error al cambiar la contraseña: " + e.getMessage());
        }
        return false;
    }

}
