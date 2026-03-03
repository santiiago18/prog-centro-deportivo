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

}
