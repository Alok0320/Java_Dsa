import java.util.*;

public class TypeConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextFloat();  // will not accepted
        // float number = sc.nextInt();  // will be accepted
        // System.out.println(number);

        int a = 25;
        long b = a;
        System.out.println(b);

        /* will not be accepted

        long a = 25;
        int b = a;
        
        */

    }
} 

// conversion happens when -> 1. Type compatible  ,, 2. Destination type > Source type

// It is also known as widening conversion or Implicit conversion