import java.util.Scanner;

public class condicionales5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite el tercer numero: ");
        int num3 = scanner.nextInt();

        System.out.println("Orden original: " + num1 + ", " + num2 + ", " + num3);

        int menor, medio, mayor;
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }

        System.out.println("Orden organizado (menor a mayor): " + menor + ", " + medio + ", " + mayor);

        scanner.close();
    }
}
