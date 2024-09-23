
import java.util.Scanner;

public class Userintro {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("ingrese un nombre: " );
    String name = scanner.nextLine();
    System.out.println("ingrese una edad: ");
    int  edad = scanner.nextInt();
    
    System.out.println("ingrese una altura: ");
    float  altura = scanner.nextFloat();

    System.out.println( "Nombre: " + name + " edad: " + edad + " altura: " + altura);

    }
}