public class ciclos7 {
    public static void main(String[] args) {
        int num = 0;

        System.out.println("Multiplos de 8 (0-100): ");

        while (num <= 100) {
            if (num % 8 == 0) {
                System.out.println(num);
            }

            num++;
        }
    }
}
