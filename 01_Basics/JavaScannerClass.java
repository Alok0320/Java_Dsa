// Taking input in java 
import java.util.Scanner;

public class JavaScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking interger as input

        System.out.println("Enter lucky number:");
        int num1 = sc.nextInt();

        System.out.println("Lucky number is :" + num1);

        // Taking String as input

        System.out.println("Enter your name :");
        String name = sc.next();  // next() method only reads a single word, like if you give input as Virat Kohli,  then it will read only Virat, for eliminating this limitation, we have nextLine()


        System.out.println("Name is " + name);


        
        System.out.println("Enter your full name :");
        String fullname = sc.nextLine();

        System.out.println("Full name is " + fullname);



    }
}