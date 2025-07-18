import java.util.Scanner;

public class ProgramaManejoDeNombres_Examen {
    public static void main(String[] args) {
        String nameConvert = "";
        int maxNumNom = 3;
        String[] nombres = new String[maxNumNom];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        try{
            for (int i = 0; i < maxNumNom; i++){
                nombres[i] = scanner.nextLine();

            }
            for (int j = 0; j < nombres.length; j++){
                nameConvert = nameConvert.concat(nombres[j].substring(1, 2).toUpperCase().concat(".").concat(nombres[j].substring(nombres[j].length()-2)));
                if (j < nombres.length-1){
                    nameConvert = nameConvert.concat("_");
                }
            }
            System.out.println(nameConvert);
        }catch (Exception e){
            System.out.println("Error General.");
            main(args);
            System.exit(0);
        }
    }
}
