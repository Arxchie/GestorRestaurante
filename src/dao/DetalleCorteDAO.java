/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
import java.util.List;
import java.sql.*;

/**
 *
 * @author chemo
 */
public class DetalleCorteDAO
{

    public boolean agregarDetalleCorte(long idCorteDeCaja, List<Long> idsVentas)
    {
        String sql = "INSERT INTO DetalleCorte (IdVenta, IdCorteDeCaja) VALUES (?, ?)";

        try (Connection conn = Conexion.conectar(); PreparedStatement pstm = conn.prepareStatement(sql))
        {
            for (Long idVenta : idsVentas)
            {
                pstm.setLong(1, idVenta);
                pstm.setLong(2, idCorteDeCaja);
                pstm.addBatch();
            }

            pstm.executeBatch();
            return true;
        } catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("Error al agregar detalles del corte: " + e.getMessage());
            return false;
        }
    }
}
