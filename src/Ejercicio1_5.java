import java.util.Scanner;

public class Ejercicio1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nota 1: ");
        double promedio1 = sc.nextDouble();

        System.out.print("Ingrese nota 2: ");
        double promedio2 = sc.nextDouble();

        System.out.print("Ingrese nota final: ");
        double promedioFinal = sc.nextDouble();

        double definitiva = (promedio1 * 0.30) + (promedio2 * 0.30) + (promedioFinal * 0.40);

        String estado = (definitiva >= 3.0) ? "Aprobado" : "Reprobado";

        System.out.printf("Definitiva: %.2f%n", definitiva);
        System.out.println("Estado: " + estado);

        sc.close();
    }
}