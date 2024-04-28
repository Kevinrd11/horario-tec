import java.util.List;
import java.util.ArrayList;
public class Programa {
    private List<Semestre> semestres;

    public Programa() {
        this.semestres = new ArrayList<>();
    }

    public void agregarSemestre(Semestre semestre) {
        this.semestres.add(semestre);
    }
    public List<Semestre> getSemestres() {
        return semestres;
    }

    // Getters y setters
}
