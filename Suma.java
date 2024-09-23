

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);
        int a,b,c;
        System.out.println("ingresa dos numero: ");
        a = calculator.nextInt();
        b = calculator.nextInt();
        c = a + b;
        System.out.println("El resultado de la suma es: " + c);
        calculator.close();
        




    }
}