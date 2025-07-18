public class PrimitivoCaracteres {
    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;

        System.out.println("caracter: " + caracter);
        System.out.println("decimal: " + decimal);
        System.out.println("decimal = caracter: " + (caracter == decimal));
    }
}
