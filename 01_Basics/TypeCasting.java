import java.util.*;

public class TypeCasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = 25.12f;
        int b = (int) a; // Type Casting ( lost .12)
        System.out.println(b);

char ch = 'a';
int number =  ch;  // Will print ASCII Code
System.out.println(number);
    }
}

// Type Compatibility is not necessary.00
// Also Known as narrowing conversion or  Explicit conversion
