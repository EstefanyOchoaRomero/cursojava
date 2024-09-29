import java.util.Scanner;

public class BucleWh {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int i = 1;
        float n, suma = 0;

        System.out.println("ingresa un numero");
        n = sc.nextFloat();
        
            while(i<= n){
            suma += i;
            i ++;
        }

        System.out.println("la suma es: " + suma);

    }
}












