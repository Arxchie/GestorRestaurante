/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chemo
 */
public class Conexion
{
    // Ruta al archivo de base de datos Access
    private static final String PATH = "src/BD/Proyecto.accdb";
    // URL de conexión con el protocolo UCanAccess
    private static final String URL = "jdbc:ucanaccess://" + PATH;

    /**
     * Método para establecer una conexión a la base de datos.
     *
     * @return objeto Connection si la conexión es exitosa, o null si falla.
     */
    public static Connection conectar()
    {
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection(URL);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e)
        {
            System.err.println("Error en la conexión: " + e.getMessage());
        }
        return connection;
    }
}
