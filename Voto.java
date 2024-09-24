
import javax.swing.JOptionPane;

public class Voto{
    public static void main(String[] arg) {
        String a = JOptionPane.showInputDialog("ingrese la esdad");
        int edad = Integer.parseInt(a);

        if (edad>=18) {
            JOptionPane.showMessageDialog(null, "la persona es mayor de edad");
        
        } else {
            JOptionPane.showMessageDialog(null, "la persona es menor de edad");

        }
            

        }
}

    



        