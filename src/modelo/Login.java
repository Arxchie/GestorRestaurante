package modelo;

/**
 *
 * @author HP
 */
public class Login 
{

    private String contrasenia;
    private boolean sesionIniciada = false;

    public Login()
    {
    }

    public Login(String contrasenia)
    {
        this.contrasenia = contrasenia;
    }

    public boolean registrarContrasenia(String contrasenia)
    {
        // Verifica si no hay una contraseña registrada previamente
        if (this.getContrasenia() == null)
        {
            this.contrasenia = contrasenia;
            return true;  // Contraseña registrada con éxito
        }
        return false;  // Ya existe una contraseña registrada
    }


    private boolean validarContrasenia(String contrasenia)
    {
        // Valida si la contraseña proporcionada coincide con la registrada
        return this.getContrasenia() != null && this.getContrasenia().equals(contrasenia);
    }

    public boolean iniciarSesion(String contrasenia)
    {
        // Verifica si la contraseña es válida para iniciar sesión
        if (validarContrasenia(contrasenia))
        {
            sesionIniciada = true;
            return true;  // Sesión iniciada exitosamente
        }
        return false;  // La contraseña no es válida
    }

    public void cerrarSesion()
    {
        // Cierra la sesión si está iniciada
        if (sesionIniciada)
        {
            sesionIniciada = false;
        }
    }
    public boolean cambiarContrasenia(String contraseniaAntigua, String contraseniaNueva)
    {
        // Verifica si la contraseña antigua es correcta antes de cambiarla
        if (this.getContrasenia() != null && this.getContrasenia().equals(contraseniaAntigua) && sesionIniciada)
        {
            this.contrasenia = contraseniaNueva;
            return true;  // Cambio de contraseña exitoso
        }
        return false;  // Contraseña antigua incorrecta o no registrada
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia()
    {
        return contrasenia;
    }

    public boolean isSesionIniciada()
    {
        return sesionIniciada;
    }

    public static void main(String[] args)
    {
        Login login = dao.LoginDAO.cargarUsuarioPorNombre("Admin");
        System.out.println(login.iniciarSesion("4321"));
    }

}
