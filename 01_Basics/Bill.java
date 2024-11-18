import java.util.*;

public class Bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        System.out.println("Price of Pencil : " + pencil);

        float pen = sc.nextFloat();
        System.out.println("Price of Pen : " + pen);

        float eraser = sc.nextFloat();
        System.out.println("Price of eraser : " + eraser);

        float total_cost = pencil + pen + eraser;
        System.out.println("Total cost of product is : " + total_cost);

        float bill  = total_cost + total_cost * 18 / 100;
        System.out.println("Total bill : " + bill);


    }


}

