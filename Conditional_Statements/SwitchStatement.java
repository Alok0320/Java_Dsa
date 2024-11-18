// Switch Statement

import java.util.*;
public class SwitchStatement {
    public static void main(String args[]) {

        /*  Switch Statement Syntax

        switch(variable) {
            case 1 :

            case 2 :

            case 3 :

            default :
        }

        */

       int number = 2;
       // char ch = 'a';
       switch(number) {
        case 1 : System.out.println("Samosa");
                    break;
        case 2 : System.out.println("Burger");
                    break;
        case 3 : System.out.println("Mango Shake");
                    break;
        // case a : System.out.println("Vada Paw");
        //             break;
        default : System.out.println("we Wake Up");
       }

       // break : If we do not use break then all the cases will be printed onwards after matching any specific case
    }
}