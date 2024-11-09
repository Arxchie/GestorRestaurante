
package componenteLogin;

import modelo.Login;

/**
 *
 * @author HP
 */
public interface IServicioLogin
{
    boolean establecerContrasenia(String contrasenia);
    boolean cambiarContrasenia(String contraseniaAntigua,String contraseniaNueva);
    boolean validarContrasenia(String contrasenia);
    boolean iniciarSesion(String usuario, String contrasenia);
    boolean isSesionIniciada();
    void cerrarSesion();
    Login cargarLogin();
    
    
}
