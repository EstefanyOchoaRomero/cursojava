
import java.util.Scanner;

public class ArrayMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el tamaño que quiere que de la lista");
        int n = sc.nextInt();
        int array [] = new int [n];

        for (int i = 0; i < n; i++){
            System.out.print("ingrese dato" + (i+1)+": ");
            array[i] = sc.nextInt();

        }
        int mayor;
        mayor = array [0];
        for (int i = 0; i < n; i++) {
            if( mayor < array[i]) {
                mayor= array[i];
            }
        }

        System.out.println("El mayor numero dentro del array es: " + mayor);

        sc.close();
    }

    
}
