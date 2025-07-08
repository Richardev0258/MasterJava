import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la factura.");
        String descripcionFactura = scanner.nextLine();
        String numProd;
        float imp = 0.19f;
        double precio = 0;

        for (int i = 1; i <= 2; i++) {

            if (i == 2) {
                numProd = "Segundo";
            }else{
                numProd = "Primer";
            }
            System.out.println("Ingrese el valor del "  + numProd + " producto");
            try {
                precio = precio + scanner.nextDouble();
            }catch (Exception e){
                System.out.println("Ingrese unicamente valores numericos en el valor de los productos.");
                main(args);
                System.exit(0);
            }
        }
        double valImp = precio * imp;
        double valTot = precio - valImp;
        System.out.println("Factura " + descripcionFactura
        + "\n" + " tiene un total bruto de: " + precio
        + "\n" + " con un impuesto de: " + valImp
        + "\n" + " y el monto después de impuestos es de: " + valTot);
    }
}
