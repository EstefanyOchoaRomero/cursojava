
import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        char caracter;

        System.out.println("introduce el tamaño que quieres para la piramide");
        numero = sc.nextInt();

        System.out.println("introduce el caracter quieres para la piramide");
        caracter = sc.next().charAt(0);

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(caracter);
                
            }
            System.out.println();
        }


    }
}
