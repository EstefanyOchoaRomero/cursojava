import java.util.Scanner;

public class InvertArray {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el tamaño que quiere que de la lista");
        int n = sc.nextInt();
        int array [] = new int [n];
        int arrayinvert [] = new int [n];

        for (int i = 0; i < n; i++){
            System.out.print("ingrese dato" + (i+1)+": ");
            array[i] = sc.nextInt();

        }
        for (int i = n; i > 0; i--) {
            arrayinvert[n-i] = array[i-1];
            System.out.print(arrayinvert[n-i] + " ");
        }

        sc.close();
    }
    
}
