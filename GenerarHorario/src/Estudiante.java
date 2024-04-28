
public class Estudiante extends Usuario {
    public Estudiante(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
    }

    @Override
    public String getTipoUsuario() {
        return "Estudiante";
    }
}