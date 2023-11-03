import java.util.Scanner;

public class Empleado {
    // Atributos de la clase
    private String nombre;
    private int numeroEmpleado;

    // Método para leer los datos del empleado desde el teclado
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el nombre del empleado: ");
        this.nombre = scanner.nextLine();
        System.out.print("Introduzca el número de empleado: ");
        this.numeroEmpleado = scanner.nextInt();
        // Se asume que después de esta llamada no se leerán más datos de 'scanner'
        // por lo que no se cierra el 'scanner' para evitar cerrar 'System.in'
    }

    // Método para visualizar los datos del empleado en pantalla
    public void verDatos() {
        System.out.println("Nombre del Empleado: " + nombre);
        System.out.println("Número de Empleado: " + numeroEmpleado);
    }

    // Getters y setters podrían ser agregados aquí si fuera necesario

    // Método principal para probar la clase
    public static void ejercicio2(String[] args) {
        Empleado empleado = new Empleado();
        empleado.leerDatos(); // El usuario introduce los datos
        empleado.verDatos(); // Se muestran los datos introducidos
    }
}
