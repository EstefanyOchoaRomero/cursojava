
import java.util.Scanner;

public class Sentencias {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero;
        System.out.println("ingresa un numero");

        numero = leer.nextInt();
        if (numero % 2 == 0){
            System.out.println("el numero es par");

        }
        else{
            System.out.println("el numero es impar");
        }
        leer.close();
    }
        
}
        


    
    
    
    
    
    
    
    
    
    
    
    
    
 