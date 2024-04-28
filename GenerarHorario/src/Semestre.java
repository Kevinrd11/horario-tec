import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Semestre {
    private int numero;
    private List<Asignatura> asignaturas;

    public Semestre(int numero) {
        this.numero = numero;
        this.asignaturas = new ArrayList<>();
    }

    public void agregarAsignatura(Asignatura asignatura) {
        this.asignaturas.add(asignatura);
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Semestre: ").append(numero).append("\n");
        for (Asignatura asignatura : asignaturas) {
            sb.append(asignatura.toString()).append("\n");
        }
        return sb.toString();
    }


    // Otros métodos getter y setter
}

