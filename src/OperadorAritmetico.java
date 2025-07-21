import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        System.out.println(" i + j = " +  (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i-j) = " + (i-j));

        int multi = i * j;
        System.out.println("multiplicación = " + multi);

        int div = i / j;
        System.out.println("división = " + div);
        float div2 = (float) i / (float) j;
        System.out.println("división 2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);
        
        resto = 8 % 5;
        System.out.println("resto = " + resto);
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if (numero % 2 ==0){
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar= " + numero);
        }
    }
}
