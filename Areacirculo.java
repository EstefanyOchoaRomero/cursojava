import java.util.Scanner;

public class Areacirculo {

    public static void main(String[] args) {

        Scanner areacirculo = new Scanner(System.in);

        double area, radio;
        System.out.println("ingrese el radio");

        radio = areacirculo.nextDouble();
        area = Math.PI + Math.pow(radio, 2);

        System.out.println("el area del circulo es: " + area);


        areacirculo.close();


    }
}