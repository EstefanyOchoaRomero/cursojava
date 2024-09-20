
public class  Xorbitabit {
    public static void main(String[] args) {
    
        int Postal1 = 33211;
        int Postal2 = 33100;
        
        // Mostrar valores antes del intercambio
        System.out.println("Antes del intercambio: Postal1 = " + Postal1 + ", Postal2 = " + Postal2);
  
        // Intercambiar usando operaciones XOR (bit a bit)
        Postal1 = Postal1 ^ Postal2; // Postal1 ahora contiene ambos valores
        Postal2 = Postal1 ^ Postal2; // Postal2 ahora contiene el valor original de Postal1
        Postal1 = Postal1 ^ Postal2; // Postal1 ahora contiene el valor original de Postal2

        // Mostrar valores después del intercambio
        System.out.println("Después del intercambio: Postal1 = " + Postal1 + ", Postal2 = " + Postal2);
    }
}
