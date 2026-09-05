import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese peso en kg: ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese estatura en centimetros: ");
        double estatura = sc.nextDouble();

        double imc = peso / (estatura / 100 * estatura / 100);
        String categoria;

        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc <= 24.9) {
            categoria = "Peso normal";
        } else if (imc <= 29.9) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }

        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Categoría: " + categoria);

        sc.close();
    }
}