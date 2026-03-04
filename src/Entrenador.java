public class Entrenador {

    //Atributos de la clase
    private int id;
    private String nombre;
    private String especialidad;
    private int aniosExperiencia;


    /**
     * Metodo constructor
     * @param id identificador del entrenador
     * @param nombre nombre del entrenador
     * @param especialidad especialidad del anetrenador
     * @param aniosExperiencia años de experiencia del entrenador
     */

    public Entrenador(int id, String nombre, String especialidad,  int aniosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }


    /**
     * Devuelve el id del entrenador
     * @return id de entrenador
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del entrenador
     * @return nombre de entrenador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la especialidad del entrenador
     * @return especialidad del entrenador
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Devuelve los años de experiencia del entrenador
     * @return años de experiencia del entrenador
     */
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }


    /**
     * Devuelve el texto del entrenador con todos sus atributos
     * @return cadena de texto con la información del entrenador
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Id: " + id + "\n");
        sb.append("Nombre: " + nombre + "\n");
        sb.append("Especialidad: " + especialidad + "\n");
        sb.append("Años de experiencia: " + aniosExperiencia + "\n");
        return sb.toString();
    }



}
