import java.util.Scanner;

public class variables2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pesoColombiano = 3895;

        System.out.println("Digite la cantidad de pesos colombianos: ");
        double cantidad = scanner.nextDouble();

        double dolares = cantidad / pesoColombiano;

        System.out.printf("La cantidad digitada equivale en dolares a: $ %.2f", dolares);

        scanner.close();

    }
}
