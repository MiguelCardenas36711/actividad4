import java.util.Scanner;

public class condicionales6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite un numero de hasta 5 digitos: ");
        int num = scanner.nextInt();

        while (num > 99999 || num < 0) {
            System.out.println("El numero digitado supera los 5 digitos o es inferior a 0, porfavor digite un numero diferente");
            num = scanner.nextInt();
        }

        while (num >= 10) {
            num /= 10;
        }

        System.out.println("La primera cifra es: " + num);

        scanner.close();
    }
}
