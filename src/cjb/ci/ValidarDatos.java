/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cjb.ci;

/**
 *
 * @author HP
 */
public class ValidarDatos
{

    /**
     * Valida el formato de una contraseña.
     *
     * Requisitos: - Al menos 8 caracteres. - Contiene al menos una letra
     * mayúscula. - Contiene al menos una letra minúscula. - Contiene al menos
     * un número. - Contiene al menos un carácter especial (@#$%^&+=).
     *
     * @param password La contraseña a validar.
     * @return true si la contraseña es válida, false en caso contrario.
     */
    public static boolean validarPassword(String password)
    {
        // Expresión regular para la contraseña
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";
        return password != null && password.matches(regex);
    }

    public static void main(String[] args)
    {
        // Ejemplo de uso
        String password1 = "Hola@123";
        String password2 = "123456";
        String password3 = "Hola123";

        System.out.println("¿Contraseña válida? " + validarPassword(password1)); // true
      }
}
