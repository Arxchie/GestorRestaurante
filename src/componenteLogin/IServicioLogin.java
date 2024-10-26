
package componenteLogin;

/**
 *
 * @author HP
 */
public interface IServicioLogin
{
    boolean registrarContrasenia(String contrasenia);
    boolean cambiarContrasenia(String contraseniaAntigua,String contraseniaNueva);
    boolean validarContrasenia(String contrasenia);
    boolean iniciarSesion(String usuario, String contrasenia);
    void cerrarSesion();
    
    
}
