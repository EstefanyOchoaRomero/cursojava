
import java.util.Scanner;

public class MatriMult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1,f1,c2,f2;
        
        System.out.println("introduce el numero de columnas de la primera matriz");
        c1 = sc.nextInt();
        System.out.println("introduce el numero de filas de la primera matriz");
        f1 = sc.nextInt();
        System.out.println("introduce el numero de columnas de la segunda matriz");
        c2 = sc.nextInt();
        System.out.println("introduce el numero de filas de la segunda matriz");
        f2 = sc.nextInt();
        if (c1 == f2) {
            int [] [] m1 = new int[c1][f1];
            int [] [] m2 = new int[c2][f2];
            int [] [] mr = new int[f1][c2];

            System.out.println("rellena la primera matriz");

            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.println("introduce valor de: " + i + " " + j);
                    m1[i][j] = sc.nextInt();
                }
            }
            
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(m1[i][j] + " " );
                }
                    System.out.println();
            }

            System.out.println("rellena la segunda matriz");

            for (int i = 0; i < f2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.println("introduce valor de: " + i + " " + j);
                    m2[i][j] = sc.nextInt();
                }
            }
            
            for (int i = 0; i < f2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(m2[i][j] + " " );
                }
                    System.out.println();
            }

            System.out.println("Resultado Multplicación");
            

            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int h = 0; h < c1; h++) {
                        mr[i][j] += m1[i][h] * m2[h][j];


                    }
                }
                    
            }

            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(mr[i][j] + " " );
                }
                    System.out.println();
            }




        }else{
            System.out.println("La operación no se puede realizar");
        }
    sc.close();

    }
    
}
