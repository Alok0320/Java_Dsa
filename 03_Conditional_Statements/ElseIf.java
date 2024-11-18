import java.util.*;

public class ElseIf {
    public static void main(String[] args) {
        /* Syntax

        if(condition_1) {
        
        }
        else if (condtion_2) {
        
        }
        else {
        
        }

        */

       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();

       if (age > 18) {
        System.out.println("Adult");
       }
       else if (age >= 13 && age < 18) {
        System.out.println("Teenager");
       }
       else {
        System.out.println("Kids");
       }
    }
}