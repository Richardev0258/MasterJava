public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        System.out.println("inicio = " + inicio);

        for (int i = 0; i < 100000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); //500 = 16 miliseg -> 1000 = 19 miliseg -> 100000 = 9 seg
            //c += a + b + "\n"; //500 = 49 miliseg -> 1000 = 51 miliseg -> 100000 = 3 seg
            sb.append(a).append(b).append("n"); //500 = 12 miliseg -> 1000 = 14 miliseg -> 100000 = 36 miliseg -> 1000000 = 69 miliseg
        }
        long fin = System.currentTimeMillis();
        System.out.println("fin = " + fin);

        long tiempoFinal = (fin - inicio);
        System.out.println("tiempoFinal = " + tiempoFinal);

        //System.out.println("c = " + c);
    }
}
