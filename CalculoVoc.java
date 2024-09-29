
import java.util.Scanner;

public class CalculoVoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra;
        int cont = 0;
        char [] vocales = {'a','e','i','o','u'};
        System.out.println("Introduce una palabra");
        palabra = sc.next().toLowerCase();
        for(int i = 0; i< palabra.length(); i++){
            for(char vocal : vocales){
                if (palabra.charAt(i) == vocal) {
                    cont++;
                }
            }
        }
        System.out.println("Hay " + cont + " vocales en la palabra " + palabra);
        sc.close();
    }
}