// Program for checking enetred year is leap or not 
// leap year = year should be divisible by 4, 100, 400

import java.util.*;

public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        if ((year%4 == 0)) {
            {
                if(year%100 == 0) {
                    if(year%400 == 0) {
                        System.out.println("Entered year is a leap year");
                    }
                }
                else {
                        System.out.println("Entered year is a leap year");
                    }
            }
        }
        else {
            System.out.println("Entered year is not a leap year");
        }
    }
}