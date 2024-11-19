import java.util.*;

public class ReadCharacterScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character :");
        char ch = sc.next().charAt(0); // Char at used for reading a character at a specific index position 
        
        System.out.println("Character is :" + ch);
    }
    
}
