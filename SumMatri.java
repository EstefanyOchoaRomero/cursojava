import java.util.Scanner;

public class SumMatri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1,f1;
        
        System.out.println("introduce el numero de columnas de las matrices");
        c1 = sc.nextInt();
        System.out.println("introduce el numero de filas de las matrices");
        f1 = sc.nextInt();
        int [] [] m1 = new int[c1][f1];
        int [] [] m2 = new int[c1][f1];
        int [] [] mr = new int[c1][f1];

        System.out.println("rellena la primera matriz");

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

        System.out.println("rellena la segunda matriz");

        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("introduce valor de: " + i + " " + j);
                m2[j][i] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(m2[j][i] + " " );
            }
                System.out.println();
        }

        System.out.println("Resultado de la suma");
        

        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                    mr[j][i] = m1[j][i] + m2[j][i];
            }
                
        }

        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(mr[j][i] + " " );
            }
                System.out.println();
        }

        sc.close();

    }
    
}

    

