import java.util.Scanner;

public class ciclos10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite un numero entero: ");
        int num = scanner.nextInt();

        System.out.println("Piramide numerica: ");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1 ; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        scanner.close();
    }
}
