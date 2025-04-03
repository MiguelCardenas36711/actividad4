public class arreglos11 {
    public static void main(String[] args) {
        char[] caracteres = new char[10];

        caracteres[0] = 'h';
        caracteres[1] = 'j';
        caracteres[2] = 'k';
        caracteres[3] = 'l';
        caracteres[4] = 'z';
        caracteres[5] = 'x';
        caracteres[6] = 'c';
        caracteres[7] = 'v';
        caracteres[8] = 'b';
        caracteres[9] = 'n';

        System.out.println("Contenido del arreglo:");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Posición " + i + ": " + caracteres[i]);
        }
    }
}
