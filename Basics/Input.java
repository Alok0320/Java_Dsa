import java.util.*;  // Package 

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();  // Will not store spaces 
        // System.out.println(input);

        // String name = sc.nextLine();  // -- > will also store Spaces, for paragraph, sentence
        // System.out.println(name);

        // int number = sc.nextInt();  // nextInt is used to print numbers 
        // System.out.println(number);

        float price = sc.nextFloat();  // for decimal values
        System.out.println(price);
    }
}