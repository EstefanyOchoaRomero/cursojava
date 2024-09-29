import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BorrarDupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cadenas = new ArrayList<>();
        String cadena;
        Boolean pedir = true;
        while (pedir) {
            System.out.println("Introduce un texto. Escrine salir para terminar");
            cadena = sc.nextLine();
            if (cadena.equalsIgnoreCase("salir")) {
                pedir = false;
            }
            cadenas.add(cadena);
        }
        HashSet<String> conjuntoSinDuplicados = new HashSet<>(cadenas);
        cadenas.clear();
        cadenas.addAll(conjuntoSinDuplicados);
        System.out.println("Lista sin duplicados: " + cadenas);
        sc.close();

    }
}
