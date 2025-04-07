import java.util.Scanner;

public class arreglos12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Digite 10 números:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        System.out.println("Números en orden inverso:");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }

        scanner.close();
    }
}
