import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosConsole {
    public static void main(String[] args) {
        /*int numeroDecimal = 500;*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        //String numeroStr = scanner.nextLine(); Se reemplaza por la lectura directa del entero. line 14
        /*String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");*/
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();
        } catch (Exception e){ /*Se pueden usar personalizadas (InputMismatchException) o genericas.*/
            System.out.println("¡Error! debe ingresar un número entero.");
            /*JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero.");*/
            main(args);
            System.exit(0);
        };

        String textoBin = "número binario de ";
        String textoOct = "número octal de ";
        String textoHex = "número hexadecimal de ";

        String numeroBin = Integer.toBinaryString(numeroDecimal);
        String numeroOct = Integer.toOctalString(numeroDecimal);
        String numeroHex = Integer.toHexString(numeroDecimal);

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensaje = textoBin + numeroDecimal + " = " + numeroBin;
        mensaje += "\n" + textoOct + numeroDecimal + " = " + numeroOct;
        mensaje += "\n" + textoHex + numeroDecimal + " = " + numeroHex;

        System.out.println(mensaje);

        /*JOptionPane.showMessageDialog(null, mensaje);*/

    }
}
