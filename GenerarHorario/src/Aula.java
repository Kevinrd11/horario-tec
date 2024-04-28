import java.util.ArrayList;
import java.util.List;

public class Aula {
    protected String nombre;
    protected int numAula;
    protected int capacidad;
    protected String disponibilidad;
    protected String ubicacion; // Nuevo atributo de ubicación

    private static List<Aula> aulas = new ArrayList<>();
    public Aula(String nombre, int numAula, int capacidad, String disponibilidad, String ubicacion) {
        this.nombre = nombre;
        this.numAula = numAula;
        this.capacidad = capacidad;
        this.disponibilidad = disponibilidad;
        this.ubicacion = ubicacion;
        aulas.add(this);

    }



    // Método estático para obtener la lista de aulas
    public static List<Aula> getAulas() {
        return aulas;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Número: " + numAula + ", Capacidad: " + capacidad + ", Disponibilidad: " + disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumAula() {
        return numAula;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
// Métodos getter y setter para ubicacion
}
