public class Coordinador extends Usuario {
    public Coordinador(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
    }

    @Override
    public String getTipoUsuario() {
        return "Coordinador";
    }
}