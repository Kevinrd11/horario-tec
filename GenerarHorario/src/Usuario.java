public abstract class Usuario {
    protected String nombreUsuario;
    protected String contraseña;

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public abstract String getTipoUsuario();

    public boolean verificarContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }
}