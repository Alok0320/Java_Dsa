
// Arithmatic Operators

import java.util.*;

public class Arithmatic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Binary Arithmatic Operator - Minimum two operands needed
        // + , - , * , / , %


        int A = 10;
        int B = 5;

        System.out.println("add = " + (A+B));
        System.out.println("subtract = " + (A-B));
        System.out.println("multiply = " + (A*B));
        System.out.println("divide(quotient) = " + (A/B));
        System.out.println("modulo(remainder) = " + (A%B));


        // Unary Operator - Needed single operand

        // Pre Increment - 1. Value change 2. Value use

        int c = 10;
        int d = ++c;

        System.out.println(c);
        System.out.println(d);


        // Post Increment - 1. Value use 2. Value change

        int e = 10;
        int f = e++;

        System.out.println(e);
        System.out.println(f);
        
        // Pre Decrement - 1. Value change 2. Value use

        int i = 10;
        int j = --i;

        System.out.println(i);
        System.out.println(j);


        // Post Decrement - 1. Value use 2. Value change

        int k = 10;
        int l = k--;

        System.out.println(k);
        System.out.println(l);
    }
}

// "reached end of file when parsing" error occurs when you are missing a curly brace in your program