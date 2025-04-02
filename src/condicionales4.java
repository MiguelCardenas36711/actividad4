import java.util.Scanner;

public class condicionales4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite un numero del 1 al 7: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("dia correspondiente: Lunes");
                break;
            case 2:
                System.out.println("dia correspondiente: Martes");
                break;
            case 3:
                System.out.println("dia correspondiente: Miercoles");
                break;
            case 4:
                System.out.println("dia correspondiente: Jueves");
                break;
            case 5:
                System.out.println("dia correspondiente: Viernes");
                break;
            case 6:
                System.out.println("dia correspondiente: Sabado");
                break;
            case 7:
                System.out.println("dia correspondiente: Domingo");
                break;
            default:
                System.out.println("Numero no valido");
                break;
        }

        scanner.close();
    }
}
