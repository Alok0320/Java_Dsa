import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Income : ");
        float income = sc.nextFloat();

        if (income < 500000) {
            System.out.println("Applies tax is 0");
            System.out.println("Income after tax deduction is " + income);
        }
        else if (income >= 500000 && income < 1000000) {

            float tax = (income * 20) / 100; // income*0.2
            System.out.println("Applied tax is : " + tax);
        }
        else {
            float tax = (income * 30) / 100;
            System.out.println("Applied tax is : " + tax);

        }
    }
}