import java.util.*;
public class EnigmaTest
{
    // instance variables - replace the example below with your own
    private int x;
	public static void main(String[] args) {
		{
	        // initialise instance variables
			Scanner user_input = new Scanner( System.in );
			System.out.println("Enter you message: ");
	        String s = user_input.nextLine();
			Enigma seLock = new Enigma(s);
	        seLock.encrypt();
	        seLock.decrypt();
	        System.out.println("The encryption is " + seLock.getEncryptedString());
	        System.out.println("The decryption is " + seLock.getDecryptedString());
	    }
	}
}