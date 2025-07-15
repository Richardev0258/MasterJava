public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String alumno = "Ricardo Marín";

        String detalle = curso + " con el alumno " + alumno;
        System.out.println("detalle = " + detalle);

        int numeroA = 5;
        int numeroB = 10;

        System.out.println(detalle + " " + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);
        System.out.println(detalle + numeroA + numeroB);
        
        String detalle2 = curso.concat(alumno);
        System.out.println("detalle2 = " + detalle2);
        
        String detalle3 = curso.concat(" con ".concat(alumno));
        System.out.println("detalle3 = " + detalle3);
    }
}
