import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {
        String username = "rmarin";
        String password = "12345";
        String username2 = "asaiz";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Usuario");
        String u  = scanner.next();

        System.out.println("Ingrese el Password");
        String p = scanner.next();

        boolean esAutenticado = false;

        if (username.equals(u) && password.equals(p) || username2.equals(u) && password2.equals(p)){
            esAutenticado = true;
        } else {
            System.out.println("Username o Password incorrectos!");
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else{
            System.out.println("Lo siento, requiere autenticación.");
        }
    }
}
