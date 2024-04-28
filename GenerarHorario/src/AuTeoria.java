public class AuTeoria extends  Aula{

    private String equipoMultimedia;
    private String aireAcondicionado;
    private Aula aula;


    public AuTeoria(String nombre, int numAula, int capacidad, String disponibilidad, String equipoMultimedia, String aireAcondicionado, String ubicacion) {
        super(nombre, numAula, capacidad, disponibilidad, ubicacion);
        this.equipoMultimedia = equipoMultimedia;
        this.aireAcondicionado = aireAcondicionado;
    }
    @Override
    public String toString() {
        return "Aula Teoria: " + super.toString() + ", Equipo Multimedia: " + equipoMultimedia + ", Aire Acondicionado: " + aireAcondicionado + ", Ubicación: " + ubicacion;
    }
}
