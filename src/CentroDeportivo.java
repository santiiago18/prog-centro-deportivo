/**
 * Representa un centro deportivo que gestiona un conjunto limitado de entrenadores
 * mediante un array unidimensional de tamaño fijo.
 *
 * El sistema permite:
 * <ul>
 *     <li>Registrar entrenadores evitando duplicados por identificador.</li>
 *     <li>Buscar entrenadores por su {@code id}.</li>
 *     <li>Eliminar entrenadores del sistema.</li>
 *     <li>Actualizar información relacionada con los entrenadores.</li>
 *     <li>Obtener una representación textual del conjunto almacenado.</li>
 * </ul>
 *
 * La estructura interna utiliza un array estático donde las posiciones libres
 * se representan mediante valores {@code null}. La gestión del espacio disponible
 * se realiza mediante métodos internos que localizan la primera posición libre.
 *
 * Esta clase actúa como contenedor y gestiona la lógica de almacenamiento
 * y acceso a los objetos {@link Entrenador}.
 *
 * @author Alejandro Melero
 * @version 1.0
 */
public class CentroDeportivo {
    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;

    public CentroDeportivo(int cantidad_maxima_entrenadores) {
        // Validación de número positivo
        if (cantidad_maxima_entrenadores <= 0) {
            this.NUM_MAX_ENTRENADORES = 15;
        } else {
            this.NUM_MAX_ENTRENADORES = cantidad_maxima_entrenadores;
        }
        entrenadores = new Entrenador[NUM_MAX_ENTRENADORES];
    }

    /**
     * Busca el primer entrenador encontrado con el id recibido
     * @param id
     * @return
     */
    public Entrenador buscarEntrenador(int id) {
        for (int i = 0; i < NUM_MAX_ENTRENADORES; i++) {
            // CORRECCIÓN: Comprobar que la POSICIÓN no sea null
            if (entrenadores[i] != null && entrenadores[i].getId() == id) {
                return entrenadores[i];
            }
        }
        return null;
    }

    /**
     * Busca la primera posicion libre
     * @return el indice de la primera posicion libre
     */
    private int buscarPrimerHuecoLibre(){
        int posicionLibre = -1;
        boolean seguirBuscando = true;

        for (int i = 0; i < NUM_MAX_ENTRENADORES && seguirBuscando; i++) {
            if(entrenadores[i] == null){
                posicionLibre = i;
                seguirBuscando = false;
            }
        }
        return posicionLibre;
    }

    /**
     * Anade un entrenador a la clase centro deportivo
     * @param entrenador
     * @return si el entrenador se ha anadido correctamente o si ya existia
     */
    public boolean registrarEntrenador(Entrenador entrenador){
        boolean entrenadorAnadido = false;
        int posicion;

        if (buscarEntrenador(entrenador.getId()) == null) {
            posicion = buscarPrimerHuecoLibre();
            if (posicion >= 0) {
                entrenadores[posicion] = entrenador;
                entrenadorAnadido = true;
            }
        }
        return entrenadorAnadido;
    }

    /**
     * Metodo para mostrar entrenadores
     * @return devuelve una cadena de texto con los entrenadores almacenados
     */
    public String mostrarEntrenadores(){
        StringBuilder sb = new StringBuilder("Entrenadores: {");

        for (int i = 0; i < NUM_MAX_ENTRENADORES; i++) {
            if (entrenadores[i] != null) {
                sb.append(entrenadores[i].toString());
            }
        }
        sb.append("\n}");

        return sb.toString();
    }

    public int contarEntrenadores(){
        int contador = 0;
        for (int i = 0; i < NUM_MAX_ENTRENADORES; i++) {
            if (entrenadores[i] != null) {
                contador++;
            }
        }
        return contador;
    }


}