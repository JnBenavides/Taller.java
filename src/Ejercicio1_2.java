import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa las horas trabajadas: ");
        double horas = sc.nextDouble();

        System.out.print("Ingresa el valor de la hora: ");
        double valorHora = sc.nextDouble();

        double salarioBruto = horas * valorHora;
        double descuentoSS = salarioBruto * 0.08;
        double retencion = salarioBruto * 0.05;
        double salarioNeto = salarioBruto - descuentoSS - retencion;

        System.out.println();
        System.out.printf("Empleado:           %s%n", nombre);
        System.out.printf("Horas trabajadas:   %.0f%n", horas);
        System.out.printf("Salario bruto:      $ %.2f%n", salarioBruto);
        System.out.printf("Descuento SS (8%%):  $ %.2f%n", descuentoSS);
        System.out.printf("Retención (5%%):     $ %.2f%n", retencion);
        System.out.printf("Salario neto:       $ %.2f%n", salarioNeto);

        sc.close();
    }
}