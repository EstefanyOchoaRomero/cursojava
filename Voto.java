
import javax.swing.JOptionPane;

public class Voto{
    public static void main(String[] arg) {
        String a = JOptionPane.showInputDialog("Ingrese la edad");
        int edad = Integer.parseInt(a);

        if (edad>=18) {
            JOptionPane.showMessageDialog(null, "Puede votar");
        
        } else {
            JOptionPane.showMessageDialog(null, "NO puede votar");

        }
            

        }
}

    



        