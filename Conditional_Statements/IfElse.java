import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        
        /* Syntax

        if (condtion) {

        }
        else {

        } */

        // Example 

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("adult : Vote, Drive");
        }
        else {
            System.out.println("Not Adult");
        }

        // Largest among two numbers 

        int num1 = sc.nextInt();
        System.out.println("First Number = " + num1);
        int num2 = sc.nextInt();

        if (num1 > num2) { 
            System.out.println("Firsr number is greater than second number");
        }
        else {
            System.out.println("Second number is greater than first number");
        }
    }
}