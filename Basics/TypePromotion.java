import java.util.*;

public class TypePromotion {
    public static void main(String args[]) {
       /*
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);
        */

/*
        char a = 'a';
        char b = 'b';
        char c = a - b;  //  will give error because a - b will be treated as integer due to type promotion and integer
        can't be converted into a char, this problem can be eliminated using typecasting 
*/

/*
        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = a + b + c;   //  will ultimately convert a,b,c  all into integer due to type promotion
*/
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;  // a,b,c,d converted into double here
        System.out.println(ans);
    } 
}

// Type promotion happens only and only if there is expression