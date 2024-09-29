
import java.util.Scanner;

public class TablaMulti {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("ingresa un numero");
        
        numero = sc.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(numero + "x" + i + "=" + numero * i);
        }
    }

}