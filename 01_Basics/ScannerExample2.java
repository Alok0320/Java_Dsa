import java.util.*;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Amount :");
        float principal = sc.nextFloat();

        System.out.println("Enter Rate of Interest :");
        float rate =  sc.nextFloat();

        System.out.println("Enter time in years :");
        float time = sc.nextFloat();

        System.out.println("Principal :" + principal );
        System.out.println("Rate :" + rate );
        System.out.println("Time :" + time );

        float simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is :" + simpleInterest);

    }
}

