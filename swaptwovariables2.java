public class swaptwovariables2  
 {
    public static void main(String[] args) {
    
        int Postal1 = 33211;
        int Postal2 = 33100;
        
        System.out.println("Antes del intercambio: Postal1 = " + Postal1 + ", Postal2 = " + Postal2);
  
        Postal1 = Postal1 + Postal2; 
        Postal2 = Postal1 - Postal2; 
        Postal1 = Postal1 - Postal2;

        System.out.println("Después del intercambio: Postal1 = " + Postal1 + ", Postal2 = " + Postal2);
    }
}
