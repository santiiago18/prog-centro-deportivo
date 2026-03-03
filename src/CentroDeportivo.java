public class CentroDeportivo {

    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;

    public CentroDeportivo(int cantidad_maxima_de_entrenadores) {

        NUM_MAX_ENTRENADORES = cantidad_maxima_de_entrenadores;
        entrenadores = new Entrenador[NUM_MAX_ENTRENADORES];

    }

}
