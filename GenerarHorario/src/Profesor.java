import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Profesor extends Usuario {
    private String nombreUsuario;
    private String cedula;
    private Map<String, String> horario;
    private Departamento departamento;

    public Profesor(String nombreUsuario, String contraseña, String cedula, Departamento departamento) {
        super(nombreUsuario, contraseña);
        this.cedula = cedula;
        this.departamento = departamento;
        this.horario = new HashMap<>();
    }

    public void agregarHorario(String dia, String horario) {
        this.horario.put(dia, horario);
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    public String getCedula() {
        return cedula;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Map<String, String> getHorario() {
        return horario;
    }

    @Override
    public String getTipoUsuario() {
        return "Profesor";
    }



    @Override
    public String toString() {
        return "Profesor: " + nombreUsuario + ", Cédula: " + cedula + ", Horario: " + horario + ", Departamento: " + departamento.getNombre();
    }
}
