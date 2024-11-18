// Program to print week days using switch cases.

import java.util.*;

public class Problem3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Week Number : ");
        int week_number = sc.nextInt();

        switch(week_number) {
            case 1 : System.out.println("Day is Monday");
            break;
            case 2 : System.out.println("Day is Tuesday");
            break;
            case 3 : System.out.println("Day is wednesday");
            break;
            case 4 : System.out.println("Day is Thursday");
            break;
            case 5 : System.out.println("Day is Friday");
            break;
            case 6 : System.out.println("Day is Saturday");
            break;
            case 7 : System.out.println("Day is Sunday");
            break;
            default : System.out.println("No week day found");
        }
    }
}