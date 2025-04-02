import java.util.Scanner;

public class ciclos9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0, negativos = 0;

        System.out.println("Digite 10 numeros enteros: ");

        for (int i = 1; i <= 10; i++) {
            int num = scanner.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }
        }

        System.out.println("Numeros positivos: " + positivos);
        System.out.println("Numeros negativos: " + negativos);

        scanner.close();
    }
}
