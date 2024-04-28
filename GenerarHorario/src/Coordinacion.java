import java.util.Map;
import java.util.List;
/*
public class Coordinacion {

    public static void generarHorarios(List<Profesor> profesores) {
        for (Profesor profesor : profesores) {
            Horario horario = new Horario();
            System.out.println("Horario para el profesor " + profesor.getNombre() + ":");
            Map<String, List<Asignatura>> disponibilidad = profesor.getDisponibilidad();
            for (Map.Entry<String, List<Asignatura>> entry : disponibilidad.entrySet()) {
                for (Asignatura asignatura : entry.getValue()) {
                    horario.agregarClase(entry.getKey(), asignatura.getNombre());
                }
            }
            horario.imprimirHorario();
            System.out.println();
        }
    }
}


 */