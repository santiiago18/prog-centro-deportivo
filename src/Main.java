public class Main {
    public static void main(String[] args) {

        CentroDeportivo centroDeportivo = new CentroDeportivo(15);

        Entrenador entrenador1 = new Entrenador(1, "Santiago","Futbol", 3);
        Entrenador entrenador2 = new Entrenador(2, "Daniel","Basketball", 6);
        Entrenador entrenador3 = new Entrenador(3, "Jhonatan","Futbol", 1);

        System.out.println(centroDeportivo.registrarEntrenador(entrenador1));
        System.out.println(centroDeportivo.registrarEntrenador(entrenador2));
        System.out.println(centroDeportivo.registrarEntrenador(entrenador3));


        System.out.println(centroDeportivo.buscarEntrenador (1));
        System.out.println(centroDeportivo.buscarEntrenador (2));
        System.out.println(centroDeportivo.buscarEntrenador (3));

        System.out.println(centroDeportivo.buscarEntrenador (9));

        System.out.println(centroDeportivo.mostrarEntrenadores());



    }
}