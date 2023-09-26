public class Porteros extends Jugador {
    private int paradasEfectivas;
    private int golesRecibidos;

    //Constructor
    public Porteros(String nombre, String pais, int faltas, int golesdirectos, int totaldelanzamientos,
            int paradasEfectivas, int golesRecibidos) {
        super(nombre, pais, faltas, golesdirectos, totaldelanzamientos);
        this.paradasEfectivas = paradasEfectivas;
        this.golesRecibidos = golesRecibidos;
    }

    // Getters y setters para Portero
    public int getParadasEfectivas() {
        return paradasEfectivas;
    }

    public void setParadasEfectivas(int paradasEfectivas) {
        this.paradasEfectivas = paradasEfectivas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    // Metodo calcularEfectividad en la clase Portero 
    @Override
    public double calcularEfectividad() {
        double efectividad = ((paradasEfectivas - golesRecibidos) * 100.0) / (paradasEfectivas + golesRecibidos);
        efectividad += (golesDirectos * 100.0) / totalLanzamientos;
        return efectividad;
    }

    // Metodo toString en la clase Portero 
    @Override
    public String toString() {
        return super.toString() +
               "Paradas Efectivas: " + paradasEfectivas + "\n" +
               "Goles Recibidos: " + golesRecibidos + "\n";
    }
}
