import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Asignatura {
    protected String nombre;
    protected Map<String, List<Aula>> aulasPorDia;

    protected int credito;
    protected Departamento departamento;
    protected Map<String, List<String>> horarios;

    public Asignatura(String nombre, int credito, Departamento departamento) {
        this.nombre = nombre;
        this.credito = credito;
        this.departamento = departamento;
        this.horarios = new HashMap<>();
        this.aulasPorDia = new HashMap<>();
    }

    public void agregarHorario(String dia, String horario, Aula aula) {
        this.horarios.computeIfAbsent(dia, k -> new ArrayList<>()).add(horario);
        this.aulasPorDia.computeIfAbsent(dia, k -> new ArrayList<>()).add(aula);
    }

    public Map<String, List<Aula>> getAulasPorDia() {
        return aulasPorDia;
    }

    public int getCredito() {
        return credito;
    }

    public String getNombre() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Map<String, List<String>> getHorarios() {
        return horarios;
    }
    // Otros métodos getter y setter

}
