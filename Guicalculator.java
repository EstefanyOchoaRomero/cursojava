import javax.swing.JOptionPane;

public class Guicalculator {

    public static void main(String[] args) {

        int number1,number2,suma,resta,mult,divi;

        number1 =  Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        number2 =  Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero: "));

        
        suma = number1 + number2;
        resta = number1 - number2;
        mult = number1 * number2;
        divi = number1 / number2;



    JOptionPane.showMessageDialog(null, "el resultado de la suma es: " + suma);
    JOptionPane.showMessageDialog(null, "el resultado de la  resta es: " + resta);
    JOptionPane.showMessageDialog(null, "el resultado de la multiplicación es: " + mult);
    JOptionPane.showMessageDialog(null, "el resultado de la division es: " + divi);
        

    }
}
