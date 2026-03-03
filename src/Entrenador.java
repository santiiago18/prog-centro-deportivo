public class Entrenador {
    private int id;
    private String nombre;
    private String especialidad;
    private int aniosExperiencia;

    public Entrenador(int id, String nombre, String especialidad,  int aniosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Id: " + id + "\n");
        sb.append("Nombre: " + nombre + "\n");
        sb.append("Especialidad: " + especialidad + "\n");
        sb.append("AniosExperiencia: " + aniosExperiencia + "\n");
        return sb.toString();
    }



}
