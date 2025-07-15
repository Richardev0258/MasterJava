import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        /*int numeroDecimal = 500;*/

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero.");
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

        System.out.println(textoBin + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        System.out.println("numeroBinario = " + numeroBin);

        System.out.println(textoOct + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        System.out.println("numeroOctal = " + numeroOct);

        System.out.println(textoHex + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = textoBin + numeroDecimal + " = " + numeroBin;
        mensaje += "\n" + textoOct + numeroDecimal + " = " + numeroOct;
        mensaje += "\n" + textoHex + numeroDecimal + " = " + numeroHex;

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
