
import java.util.Scanner;

public class FactoFor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;

        long factorial = 1;

        System.out.println("ingrese un numero");

        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++){

            factorial = factorial* i;

        }

        System.out.println("el factorial de este numero es: " + factorial);
    }

}
