import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nota (0.0 - 5.0): ");
        double nota = sc.nextDouble();

        char letra;
        String descripcion;

        if (nota >= 4.6) {
            letra = 'A';
            descripcion = "Excelente";
        } else if (nota >= 4.0) {
            letra = 'B';
            descripcion = "Sobresaliente";
        } else if (nota >= 3.5) {
            letra = 'C';
            descripcion = "Aceptable";
        } else if (nota >= 3.0) {
            letra = 'D';
            descripcion = "Aprobado mínimo";
        } else {
            letra = 'F';
            descripcion = "Reprobado";
        }

        System.out.printf("Nota: %.2f%n", nota);
        System.out.println("Letra: " + letra);
        System.out.println("Descripción: " + descripcion);

        sc.close();
    }
}