// Program to check if a person is ill or not 

import java.util.*;

public class Problem2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp >= 100) {
            System.out.println("Person is ill.");
        }
        else {
            System.out.println("Person is not ill.");
        }
    }
}