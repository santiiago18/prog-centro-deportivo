public class CentroDeportivo {

    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;

    public CentroDeportivo(int cantidad_maxima_de_entrenadores) {

        NUM_MAX_ENTRENADORES = cantidad_maxima_de_entrenadores;
        entrenadores = new Entrenador[NUM_MAX_ENTRENADORES];
    }


    /**
     * Busca el primer entrenador que encuentre
     * @param id identificador del entrenador
     * @return devueve el id del entrenador si lo encuentra, null si no lo encuentra
     */
    public Entrenador buscarEntrenador(int id){
        boolean seguirBuscando = true;
        Entrenador entrenador = null;

        for (int i = 0; i < NUM_MAX_ENTRENADORES && seguirBuscando; i++) {
            if (entrenadores[i].getId() == id) {
                seguirBuscando = false;
                entrenador = entrenadores[i];
            }
        }
        return entrenador;
    }

    /**
     * Busca el primer hueco libre
     * @return el indice del primer hueco libre si existe, y -1 si no existe
     */
    private int buscarPrimerHuecoLibre(){
        int primerHuecoLibre = -1;
        boolean seguirBuscando = true;

        for (int i = 0; i < NUM_MAX_ENTRENADORES && seguirBuscando; i++) {
            if (entrenadores[i] == null) {
                primerHuecoLibre = i;
                seguirBuscando = false;
            }
        }
        return primerHuecoLibre;
    }


    /**
     * Se busca si el entrenador ya es existente, si no existe se registra el entrenador
     * @param entrenador El objeto del socio que se registra
     * @return true si el registro fue exitoso. Y false si el socio ya existe o no hay espacio
     */
    public boolean registrarEntrenador(Entrenador entrenador){
        boolean entrenadorRegistrado = false;
        boolean entrenadorExistente = false;
        int hueco = buscarPrimerHuecoLibre();

        for (int i = 0; i < entrenadores.length; i++) {
            if (entrenadores[i] != null && entrenadores[i].getId() == entrenador.getId()) {
                entrenadorExistente = true;
            }
            if (!entrenadorExistente) {
                entrenadores[i] = entrenador;
                entrenadorRegistrado = true;
            }
        }
        return entrenadorRegistrado;
    }






}
