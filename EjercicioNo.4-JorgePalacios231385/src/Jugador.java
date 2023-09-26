public class Jugador {
    protected String nombre;
    protected String pais;
    protected int faltas;
    protected int golesDirectos;
    protected int totalLanzamientos;

    //Constructor
    public Jugador(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos) {
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.golesDirectos = golesDirectos;
        this.totalLanzamientos = totalLanzamientos;
    }

    // Getters y setters para Jugador
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getGolesDirectos() {
        return golesDirectos;
    }

    public void setGolesDirectos(int golesDirectos) {
        this.golesDirectos = golesDirectos;
    }

    public int getTotalLanzamientos() {
        return totalLanzamientos;
    }

    public void setTotalLanzamientos(int totalLanzamientos) {
        this.totalLanzamientos = totalLanzamientos;
    }

    // Metodo calcularEfectividad en la clase Jugador 
    public double calcularEfectividad() {
        // Implementacion de la efectividad para jugadores 
        return 0.0;
    }

    //Metodo toString en la clase Jugador
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "País: " + pais + "\n" +
               "Faltas: " + faltas + "\n" +
               "Goles Directos: " + golesDirectos + "\n" +
               "Total de Lanzamientos: " + totalLanzamientos + "\n";
    }
}