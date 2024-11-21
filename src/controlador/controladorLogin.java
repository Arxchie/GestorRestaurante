/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import componenteLogin.IServicioLogin;
import dao.LoginDAO;
import interfaces.VtnContraseña;
import interfaces.VtnLogin;
import interfaces.VtnRegistra_Contra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Login;

/**
 *
 * @author HP
 */
public class controladorLogin
{

    public static final VtnLogin vtnLogin = new VtnLogin();
    public static final VtnRegistra_Contra vtnRegistra = new VtnRegistra_Contra();
    public static final VtnContraseña vtnContra = new VtnContraseña();
    public static Login login;
  
    public static void iniciarLogin()
    {
        vtnLogin.setVisible(true); 
    }

    public static void main(String[] args)
    {
       
        controladorLogin.iniciarLogin();
    }

}
