public class Enigma {
    // instance variables - replace the example below with your own
    private String rawString="";
    private String newString="";
    private String newString2="";

    /**
     * Constructor for objects of class SimpleEncryption
     */
    public Enigma(String inputString)
    {
        // initialise instance variables
        rawString = inputString;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void encrypt()
    {
        int counter = 0; //start with char 0
        while (counter < rawString.length())
        {
            newString += (char)((int)rawString.charAt(counter)+3);
            counter++;
        }
        
    }
    
    public String getEncryptedString()
    {
        return newString;
    }
    
    public void decrypt()
    {
        int counter = 0; //start with char 0
        while (counter < rawString.length())
        {
            newString2 += (char)((int)newString.charAt(counter)-3);
            counter++;
        }
        
    }
    
    public String getDecryptedString()
    {
        return newString2;
    }
}