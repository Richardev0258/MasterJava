public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Ricardo";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Ricardo\") = " + nombre.equals("Ricardo"));
        System.out.println("nombre.equals(\"ricardo\") = " + nombre.equals("ricardo"));
        System.out.println("nombre.equalsIgnoreCase(\"RICARDO\") = " + nombre.equalsIgnoreCase("RICARDO"));
        System.out.println("nombre.compareTo(\"Ricardo\") = " + nombre.compareTo("Ricardo"));
        System.out.println("nombre.compareTo(\"Richard\") = " + nombre.compareTo("Richard"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        
        System.out.println("nombre.substring(4) = " + nombre.substring(4));
        System.out.println("nombre.substring(2, nombre.length()) = " + nombre.substring(2, nombre.length()));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        
        String trabalenguas = "Trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"x\") = " + trabalenguas.indexOf("x"));
        System.out.println("trabalenguas.contains(\"tr\") = " + trabalenguas.contains("tr"));
        System.out.println("trabalenguas.startsWith(\"Lenguas\") = " + trabalenguas.startsWith("Lenguas"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());
    }
}
