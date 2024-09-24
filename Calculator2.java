
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner (System.in);

        int op,numero1,numero2,resultado;

        System.out.println("Binvenido a la calculadora");
        System.out.println("1 suma");
        System.out.println("2 resta");
        System.out.println("3 multiplicaion");
        System.out.println("4 division");

        op = lector.nextInt();

        switch(op)
        {
            case 1:
            System.out.println("Introduce el primer numero");
            numero1 = lector.nextInt();
            System.out.println("Introduce el segundp numero");
            numero2 = lector.nextInt();

            resultado = numero1+ numero2;

            System.out.println("la suma es: "+ resultado);
            break;

            case 2:
            System.out.println("Introduce el primer numero");
            numero1 = lector.nextInt();
            System.out.println("Introduce el segundp numero");
            numero2 = lector.nextInt();

            resultado = numero1 - numero2;

            System.out.println("la resta es: "+ resultado);
            break;

            case 3:
            System.out.println("Introduce el primer numero");
            numero1 = lector.nextInt();
            System.out.println("Introduce el segundp numero");
            numero2 = lector.nextInt();

            resultado = numero1 * numero2;

            System.out.println("la multiplicación es: "+ resultado);
            break;

            case 4:
            System.out.println("Introduce el primer numero");
            numero1 = lector.nextInt();
            System.out.println("Introduce el segundp numero");
            numero2 = lector.nextInt();

            resultado = numero1 / numero2;

            System.out.println("la division es: "+ resultado);
            break;

            
            default:

            System.out.println("No elegiste ninguna operaciòn");






        }

    }
}
