/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dao;


import static dao.LoginDAO.cambiarContrasenia;
import static dao.LoginDAO.cargarUsuarioPorNombre;
import static dao.LoginDAO.guardarUsuarioEnBD;
import static dao.LoginDAO.verificarContraseñaBD;
import modelo.Producto;

/**
 *
 * @author chemo
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        guardarUsuarioEnBD("Admin", "1234");
//        System.out.println(verificarContraseñaBD("Admin", "1234"));
//        System.out.println(cambiarContrasenia("Admin", "1111"));
//        System.out.println(cargarUsuarioPorNombre("Admin"));
        Producto nuevo = new Producto("Chilaquilez", "Plato Fuerte", 15.0f, 15.0f, "Chilaquiles Verdes", 1, "KG");
        
        ProductoDAO.agregarProducto(nuevo);
    }
    
}
