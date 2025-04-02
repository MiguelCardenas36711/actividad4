public class variables1 {
    public static void main(String[] args) {
        int numA = 89;
        int numB = 323;

        System.out.println("Numero A: " + numA + " ; Numero B: " + numB);

        System.out.println("La suma entre ambos numeros es: " + (numA + numB));
        System.out.println("La resta entre ambos numeros es: " + (numA - numB));
        System.out.println("La multiplicacion entre ambos numeros es: " + (numA * numB));

        if (numB != 0) {
            System.out.println("La division entre ambos numeros es: " + ((double) numA / numB));
        } else {
            System.out.println("No se puede dividir entre cero");
        }
    }
}