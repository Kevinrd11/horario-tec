public class AuPractica extends Aula{

    private String equipoTecnico;
    private Aula aula;


    public AuPractica(String nombre, int numAula, int capacidad, String disponibilidad, String equipoTecnico, String ubicacion) {
        super(nombre, numAula, capacidad, disponibilidad, ubicacion);
        this.equipoTecnico = equipoTecnico;
    }
    @Override
    public String toString() {
        return "Aula Práctica: " + super.toString() + ", Equipo Técnico: " + equipoTecnico + ", Ubicación: " + ubicacion;
    }


}
