import java.util.Scanner;

public class Expresionsimple {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float numero1,numero2,numero3,suma,mult;
        
        System.out.println("escribe tres numeros: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        numero3 = entrada.nextFloat();

        suma = numero1 + numero2;
        mult = numero3 * suma;
            
        System.err.println(" la suma es: " + suma);
        System.out.println("la mult es: " + mult);
        entrada.close();


    }
}