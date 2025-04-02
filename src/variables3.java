import java.util.Scanner;

public class variables3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double iva = 0.19;

        System.out.println("Digite el valor de la base de compra: ");
        double baseCompra = scanner.nextDouble();

        double baseCompraIva = baseCompra * iva;
        double totalFactura = baseCompra + baseCompraIva;

        System.out.println("Base de compra: $" + baseCompra);
        System.out.println("IVA (19%): $" + baseCompraIva);
        System.out.println("Total a pagar (incluido IVA): $" + totalFactura);

        scanner.close();
    }
}
