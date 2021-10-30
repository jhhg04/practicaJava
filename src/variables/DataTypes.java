package variables;

public class DataTypes {
    /* ENTEROS */
    static byte uno;
    static short dos;
    static int tres;
    static long cuatro;

    /* FLOTANTE */
    static float cinco;
    static double seis;

    /* BOOLEAN */
    static boolean falso;

    /* CARACTER */
    static char caracter;

    /* OBJETO STRING */
    static String nombre;

    public static void main(String[] args) {
        System.out.println("uno:"+uno);
        System.out.println("dos:"+dos);
        System.out.println("tres:"+tres);
        cuatro=100000L;
        System.out.println("cuatro:"+cuatro);
        cinco=3.1416F;
        System.out.println("cinco:"+cinco);
        seis=3.141617181920D;
        System.out.println("seis:"+seis);
        System.out.println("falso:"+falso);
        System.out.println("caracter:"+caracter);
        System.out.println("nombre:"+nombre);
    }
}
