import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class Horario {
    private Map<String, ArrayList<Object>> horarioSemanal;  // Asegúrate de que el mapa está bien definido

    public Horario() {
        this.horarioSemanal = new HashMap<>(); // Asegúrate de inicializar correctamente el HashMap
        // Inicializar con días de la semana
        horarioSemanal.put("Lunes", new ArrayList<>());
        horarioSemanal.put("Martes", new ArrayList<>());
        horarioSemanal.put("Miércoles", new ArrayList<>());
        horarioSemanal.put("Jueves", new ArrayList<>());
        horarioSemanal.put("Viernes", new ArrayList<>());
    }

    public void agregarClase(String dia, String asignatura) {
        if (horarioSemanal.containsKey(dia)) {
            horarioSemanal.get(dia).add(asignatura);  // Añade asignaturas al día específico
        } else {
            System.out.println("El día '" + dia + "' no es válido o no está definido en el horario.");
        }
    }

    public void imprimirHorario() {
        for (Map.Entry<String, ArrayList<Object>> entry : horarioSemanal.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List<Object> clases = entry.getValue();
            if (clases.isEmpty()) {
                sb.append("No hay clases");
            } else {
                for (int i = 0; i < clases.size(); i++) {
                    sb.append(clases.get(i));
                    if (i < clases.size() - 1) {
                        sb.append(", ");
                    }
                }
            }
            System.out.println(entry.getKey() + ": " + sb.toString());
        }
    }
}