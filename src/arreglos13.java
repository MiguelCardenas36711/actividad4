import java.util.Scanner;

public class arreglos13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[8];

        System.out.println("Digite 8 números enteros:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        System.out.println("Clasificación de los números:");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println("El número " + nums[i] + " es par.");
            } else {
                System.out.println("El número " + nums[i] + " es impar.");
            }
        }

        scanner.close();
    }
}
