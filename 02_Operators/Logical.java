// Logical Operators

import java.util.*;

public class Logical {
    public static void main(String args[]) {

        // Logical AND -- &&

        System.out.println( (3>2) && (5>0) );
        System.out.println( (3>2) && (5>8) );
        System.out.println( (3>5) && (5>0) );
        System.out.println( (3>5) && (5>8) );

        
        // Logical OR -- ||
        
        System.out.println( (3>2) || (5>0) );
        System.out.println( (3>2) || (5>8) );
        System.out.println( (3>5) || (5>0) );
        System.out.println( (3>5) || (5>8) );

        
        // Logical NOT -- ! -- Opposes the value
        
        System.out.println( !(3>2) );
        System.out.println( !(2>3) );
    

    }
}