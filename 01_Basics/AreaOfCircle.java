// Program to calculate area of circle

import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pi = sc.nextFloat();
        float rad = sc.nextFloat();
        float area = pi * rad * rad;
        System.out.println(area);
    }
}

// float area = 3.14 * rad * rad; // will consider 3.14 as a double value
// float area = 3.14f * rad * rad; // will consider 3.14f as as float value 