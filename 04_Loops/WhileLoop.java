import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        /*  while(condition) {
        code
        } */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;

        while(num <= n) {
            System.out.println(num);
            num++;
        }


    }
    
}
