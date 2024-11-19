import java.util.*;
public class ForLoop {
    public static void main(String[] args) {
        /*
          for(init-statement; condition ; final-expression) { all the expressions are optional

          }
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Printing numbers from 1 to 10
        for(int num = 0; num <= n; num++) {
          System.out.println(num);

        }

        // Printing numbers from 10 to 1
        for(int i = 10; i >= 1; i--) {
          System.out.println(i);
        }
        
        /*
          for(int num = n; num >=1; num -= 2) { // num -= 2, num = num -2
          System.out.println(num);
          }
         */
         
    }
}
