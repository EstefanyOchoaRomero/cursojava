
import java.util.Scanner;

public  class PositivoNegativo {
    public static void  main (String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int numero;
        System.out.println("ingresa un numero");
        numero = sc.nextInt();
        
        if (numero > 0 && numero % 2 == 0) {
            System.out.println("Este numero es positivo y par");

        }else if (numero < 0 || numero % 3 == 0) {
            System.out.println("Este numero es negativo o divisible por 3 " );
        }
        else{
            System.out.println("Este numero no cumple las condiciones anteriores: ");
        
        }

sc.close();


}


}
