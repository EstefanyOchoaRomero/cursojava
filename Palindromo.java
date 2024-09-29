
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una palara :");
        String palabra = sc.next();
        Boolean palindromo = true;

        for (int i = 0, j = palabra.length() - 1; i < j; i++, j--) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                palindromo = false;
            }
        }
        if(palindromo){
            System.out.println("La palabra : " + palabra + " es un palindromo");
        }else{
            System.out.println("La palabra : " + palabra + " no es un palindromo");
        }
        sc.close();
    }
}
