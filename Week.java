import java.util.Scanner;

public class Week {
    public static void main(String[] arg) {
        
        int dia;
        Scanner semana = new Scanner(System.in);
        
        System.out.println("ingresr un numero entre 1 y 7");
        dia = semana.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.err.println("Sabado");
                break;
            case 7:
                System.err.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido");



        }

        }




    }


