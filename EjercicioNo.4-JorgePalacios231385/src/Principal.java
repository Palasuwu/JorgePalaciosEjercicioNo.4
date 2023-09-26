//JORGE PALACIOS - 231385
// EJERCICIO NO.4 Modelacion con herencia 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Logica logica = new Logica(); 

        // jugadores de ejemplo
        Porteros portero1 = new Porteros("Diego Sánchez", "España", 10, 0, 50, 40, 10);
        Porteros portero2 = new Porteros("Alessio Rossi", "Italia", 5, 0, 45, 38, 7);

        Extremos extremo1 = new Extremos("Carla Rodríguez", "Argentina", 8, 12, 60, 45, 20);
        Extremos extremo2 = new Extremos("James Smith", "Estados Unidos", 7, 15, 55, 38, 18);
        Extremos extremo3 = new Extremos("Maria López", "Guatemala", 12, 10, 50, 42, 22);
        Extremos extremo4 = new Extremos("Luca Bianchi", "Italia", 9, 14, 58, 48, 21);

        logica.agregarPortero(portero1);
        logica.agregarPortero(portero2);
        logica.agregarExtremo(extremo1);
        logica.agregarExtremo(extremo2);
        logica.agregarExtremo(extremo3);
        logica.agregarExtremo(extremo4);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú Principal");
            System.out.println("\nElige qué datos quieres observar");
            System.out.println("1. Mostrar Jugadores");
            System.out.println("2. Los 3 mejores porteros en función de su efectividad.");
            System.out.println("3. Mostrar Extremos con más del 85% de efectividad");
            System.out.println("4. Agregar Jugador");
            System.out.println("5. Salir");
            System.out.print("Ingrese su elección: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    logica.mostrarJugadores();
                    break;
                case 2:
                    logica.mejoresPorteros();
                    break;
                case 3:
                    List<Extremos> extremosCon85MasEfectividad = new ArrayList<>();
                    for (Extremos extremo : logica.getListaExtremos()) {
                        if (extremo.calcularEfectividad() > 85.0) {
                            extremosCon85MasEfectividad.add(extremo);
                        }
                    }

                    System.out.println("Extremos con más del 85% de efectividad:");
                    for (Extremos extremo : extremosCon85MasEfectividad) {
                        System.out.println(extremo.toString());
                    }
                    break;
                case 4:
                    
                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }
}
