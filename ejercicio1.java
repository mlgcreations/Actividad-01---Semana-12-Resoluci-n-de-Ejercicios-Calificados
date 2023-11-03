public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor por defecto
    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Constructor con valores específicos
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Método para visualizar la hora
    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    // Método para sumar dos objetos Hora
    public static Hora sumar(Hora h1, Hora h2) {
        Hora resultado = new Hora();
        resultado.segundos = (h1.segundos + h2.segundos) % 60;
        int minutosAdicionales = (h1.segundos + h2.segundos) / 60;
        resultado.minutos = (h1.minutos + h2.minutos + minutosAdicionales) % 60;
        int horasAdicionales = (h1.minutos + h2.minutos + minutosAdicionales) / 60;
        resultado.horas = (h1.horas + h2.horas + horasAdicionales) % 24;
        
        // Ajuste para días adicionales, si fuera necesario, podría agregarse otro campo o manejarlo de alguna manera.
        
        return resultado;
    }

    // Método main para probar la clase
    public static void ejercicio1(String[] args) {
        Hora h1 = new Hora(11, 59, 59);
        Hora h2 = new Hora(0, 0, 1);
        Hora h3;

        h1.mostrarHora();
        h2.mostrarHora();
        
        h3 = Hora.sumar(h1, h2);
        h3.mostrarHora(); // Debería mostrar 12:00:00
    }
}
