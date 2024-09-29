import java.util.Scanner;

public class Sentencias2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long anio;
        System.out.println("ingresa el año");
        anio = sc.nextLong();
        boolean resultado = esBisiesto(anio);

        if (resultado) {
            System.out.println("El año es bisiesto");

        }
        else {
            System.out.println("El año no es bisiesto");
        
        }

    }
}



public static boolean esBisiesto(long anio) {
    if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
        return true;
    } else {
        return false;
    }
}
