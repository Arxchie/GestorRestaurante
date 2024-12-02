/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion;
import java.util.ArrayList;
import java.sql.*;
import modelo.Venta;
import java.util.List;
import modelo.CorteDeCaja;

/**
 *
 * @author chemo
 */
public class CorteDAO
{

    public boolean agregarDetallesCorte(long idCorteDeCaja, List<Long> idsVentas)
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

    public long insertarCorteDeCaja(long idEmpleado, Date fecha, double total, double dineroEnCaja)
    {
        String sql = "INSERT INTO CorteDeCaja (idEmpleado, fechaCorte, totalDeIngresos, dineroEnCaja) VALUES (?, ?, ?, ?)";
        String sqlIdCorte = "SELECT @@IDENTITY AS id"; 

        try (Connection conn = Conexion.conectar(); PreparedStatement pstm = conn.prepareStatement(sql); PreparedStatement pstmId = conn.prepareStatement(sqlIdCorte))
        {
            pstm.setLong(1, idEmpleado);
            pstm.setDate(2, new java.sql.Date(fecha.getTime()));
            pstm.setDouble(3, total);
            pstm.setDouble(4, dineroEnCaja);
            pstm.executeUpdate();

            ResultSet rs = pstmId.executeQuery();
            if (rs.next())
            {
                return rs.getLong("id");
            }
            return -1; 
        } catch (SQLException e)
        {
            e.printStackTrace();
            return -1;
        }
    }

    public long agregarCorteDeCaja(CorteDeCaja corteDeCaja)
    {
        String sqlCorte = "INSERT INTO CorteDeCaja (idEmpleado, fechaCorte, totalDeIngresos, dineroEnCaja) VALUES (?, ?, ?, ?)";
        String sqlIdCorte = "SELECT @@IDENTITY AS id"; 
        try (Connection conn = Conexion.conectar(); PreparedStatement pstmCorte = conn.prepareStatement(sqlCorte); PreparedStatement pstmIdCorte = conn.prepareStatement(sqlIdCorte))
        {

            pstmCorte.setLong(1, corteDeCaja.getIdEmpleado());
            pstmCorte.setDate(2, new java.sql.Date(corteDeCaja.getFechaCorte().getTime()));
            pstmCorte.setDouble(3, corteDeCaja.getTotalDeIngresos());
            pstmCorte.setDouble(4, corteDeCaja.getDineroEnCaja());
            pstmCorte.executeUpdate();

            ResultSet rs = pstmIdCorte.executeQuery();
            if (rs.next())
            {
                return rs.getLong("id"); 
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("Error al agregar el corte de caja: " + e.getMessage());
        }
        return -1; 
    }

}
