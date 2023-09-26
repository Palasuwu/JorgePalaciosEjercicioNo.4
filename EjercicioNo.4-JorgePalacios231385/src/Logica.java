//INICIACION DE LISTAS y de Ejemplos 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Logica {
    private List<Porteros> listaPorteros; // Lista para almacenar los porteros 
    protected List<Extremos> listaExtremos; // Lista para almacenar los extremos 

    public Logica() {
        this.listaPorteros = new ArrayList<>();
        this.listaExtremos = new ArrayList<>();
    }

    // Metodo para agregar un portero 
    public void agregarPortero(Porteros portero) {
        listaPorteros.add(portero);
    }

    // Metodo para agregar un extremo 
    public void agregarExtremo(Extremos extremo) {
        listaExtremos.add(extremo);
    }

    // Metodo para mostrar todos los jugadores registrados 
    public void mostrarJugadores() {
        System.out.println("Porteros registrados:");
        for (Porteros portero : listaPorteros) {
            System.out.println(portero.toString());
        }

        System.out.println("Extremos registrados:");
        for (Extremos extremo : listaExtremos) {
            System.out.println(extremo.toString());
        }
    }

    // Metodo para encontrar y mostrar los 3 mejores porteros según su efectividad
    public void mejoresPorteros() {
        Collections.sort(listaPorteros, Comparator.comparingDouble(Porteros::calcularEfectividad).reversed());

        System.out.println("Los 3 mejores porteros:");

        for (int i = 0; i < Math.min(listaPorteros.size(), 3); i++) {
            System.out.println(listaPorteros.get(i).toString());
        }
    }

    // Metodo de extremos con más del 85% de efectividad
    public int extremos85() {
        int contador = 0;

        for (Extremos extremo : listaExtremos) {
            double efectividad = extremo.calcularEfectividad();
            if (efectividad > 85.0) {
                contador++;
            }
        }
        return contador;
    }

    // Metodo para obtener la lista de extremos
    public List<Extremos> getListaExtremos() {
        return listaExtremos;
    }
}
