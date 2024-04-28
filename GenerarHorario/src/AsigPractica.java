import java.util.*;
import java.util.stream.Collectors;

public class AsigPractica extends Asignatura {
    private String sistem;
    private Map<String, List<String>> horarios;
    private Map<String, List<Aula>> aulasPorDia;

    // Inicializar los mapas antes del constructor
    {
        horarios = new HashMap<>();
        aulasPorDia = new HashMap<>();
    }

    public AsigPractica(String nombre, int credito, String sistem, Departamento departamento) {
        super(nombre, credito, departamento);
        this.sistem = sistem;
    }

    // Método para agregar horarios sin asignar aulas
    public void agregarHorario(String dia, String horario) {
        horarios.computeIfAbsent(dia, k -> new ArrayList<>()).add(horario);
    }

    // Método para asignar aulas a los horarios
    public void asignarAula(String dia, String horario, Aula aula) {
        List<Aula> aulasDia = aulasPorDia.computeIfAbsent(dia, k -> new ArrayList<>());
        int index = horarios.get(dia).indexOf(horario);
        while (aulasDia.size() <= index) {
            aulasDia.add(null); // Agregar null para representar la ausencia de una aula asignada
        }
        aulasDia.set(index, aula);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asignatura Práctica: ").append(nombre).append(", Departamento: ").append(departamento.getNombre()).append("\n");
        /*sb.append("Horarios:\n");
        for (Map.Entry<String, List<String>> entry : horarios.entrySet()) {
            String dia = entry.getKey();
            List<String> horariosDia = entry.getValue();
            List<Aula> aulasDia = aulasPorDia.get(dia);
            for (int i = 0; i < horariosDia.size(); i++) {
                String horario = horariosDia.get(i);
                Aula aula = aulasDia != null ? aulasDia.get(i) : null;
                sb.append(String.format("%-10s %-15s Aula: %s\n", dia, horario, aula != null ? aula.toString() : "No asignada"));
            }
        }

         */
        return sb.toString();
    }



}
