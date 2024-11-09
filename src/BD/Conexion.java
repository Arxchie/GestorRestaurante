package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    public static void main(String[] args)
    {

    }
}
// Clase para manejar la lógica relacionada con el usuario

