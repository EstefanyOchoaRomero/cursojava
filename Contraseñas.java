
import java.security.SecureRandom;
public class Contraseñas {


    public static void main(String[] args) {
        
        int numero_characteres = 8;
        password(numero_characteres);
        
    }
    public static void password(int numero_caracteres) {
        String characters = "ABCDFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmñnopqrstuvxyz0123456789!#€¬/@%?¿";

        SecureRandom random = new SecureRandom ();

        char[] password = new char[numero_caracteres];
        for (int i = 0; i < password.length; i++){
            password[i] = characters.charAt(random.nextInt(characters.length()));
        }
        System.out.println(password);
        

        }
        
}


        
    

