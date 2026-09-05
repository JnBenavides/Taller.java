import java.util.Scanner;

public class Ejercicio1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();

        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        double areaRectangulo = base * altura;
        double perimetroRectangulo = 2 * (base + altura);

        double areaCirculo = Math.PI * radio * radio;
        double circunferencia = 2 * Math.PI * radio;

        System.out.println("\n--- RECTÁNGULO ---");
        System.out.printf("Área: %.2f%n", areaRectangulo);
        System.out.printf("Perímetro: %.2f%n", perimetroRectangulo);

        System.out.println("\n--- CÍRCULO ---");
        System.out.printf("Área: %.2f%n", areaCirculo);
        System.out.printf("Circunferencia: %.2f%n", circunferencia);

        sc.close();
    }
}