import java.util.*;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print all the values between 1 to 50 ex ept for the multiple of 3.

        

        for(int num = 1; num <= 50; num++) {
            if(num % 3 == 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}

// Label : we can give names to any of specific loop , i.e myloop : for()
