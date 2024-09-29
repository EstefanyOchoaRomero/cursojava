import java.util.ArrayList;
import java.util.Scanner;

public class ListaDinamica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int suma = 0;
        int numero;
        Boolean pedir = true;
        while (pedir) {
            System.out.println("Introduce un numero. introduce 0 para terminar");
            numero = sc.nextInt();
            if(numero == 0){
                pedir = false;
            }else{
                numeros.add(numero);
                suma+=numero;
            }
        }
        System.out.println("Lista de numeros: " + numeros);
        System.out.println("La suma  es: " + suma);

        sc.close();

    }
}
