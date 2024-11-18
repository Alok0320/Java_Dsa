import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {

       /* while Loop 

        while(condition) {
            code
        }

        */

        // Print 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int i = 1;

        while(i <= n) {
            System.out.println(i);
            i++; // increment operator , i = i + 1
        }
    }
}