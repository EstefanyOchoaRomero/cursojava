import java.util.Scanner;

public class TransMatri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1,f1;
        
        System.out.println("introduce el numero de columnas de la matriz");
        c1 = sc.nextInt();
        System.out.println("introduce el numero de filas de la matriz");
        f1 = sc.nextInt();
        int [] [] m1 = new int[c1][f1];
        int [] [] mt = new int[f1][c1];

        System.out.println("rellena la matriz");

        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("introduce valor de: " + i + " " + j);
                m1[j][i] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(m1[j][i] + " " );
            }
                System.out.println();
        }
        System.out.println("Matriz Transpuesta");
        

        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                    mt[i][j] = m1[j][i] ;
            }
                
        }

        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < f1; j++) {
                System.out.print(mt[j][i] + " " );
            }
                System.out.println();
        }

        sc.close();
    }
}