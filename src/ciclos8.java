import java.util.Scanner;

public class ciclos8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0, cantidad = 0, num = 0;

        do {
            System.out.println("Digite un numeros positivos (para finalizar digite un numero negativo): ");
            num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            suma += num;
            cantidad++;
        } while (num > 0);

        if (cantidad > 0) {
            double promedio = (double) suma / cantidad;
            System.out.printf("El promedio de los numeros es: %.2f", promedio);
        } else {
            System.out.println("No se digitaron numeros positivos.");
        }

        scanner.close();
    }
}
