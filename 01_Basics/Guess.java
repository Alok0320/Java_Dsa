import java.util.*;

public class Guess {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        float result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
    }
}