import java.util.Scanner;

public class BucleWh2{
    public static void main(String[] args) {
    
    int numAleatorio;
    numAleatorio = (int) (Math.random()*100+1);
    int num=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("El juego consiste en averiguar un número secreto entre 1 y 100.");

    while (num!= numAleatorio){
        
        System.out.print("Ingresa un número: ");
        num=sc.nextInt();
        if (num < numAleatorio) {
            System.out.println("ohh fallaste, intenta con un numero mayor");
        }
        else if (num > numAleatorio) {

            System.out.println("ohh fallaste, intenta con un numero menor");
        }
        else if(num==numAleatorio){
            System.out.print("Bien!!Has ganado!!");
        }
        else{
            System.out.print("Ohhh!!Vuelve a intentarlo\n");

            }
            
        }
        
    sc.close();
    }
}
    