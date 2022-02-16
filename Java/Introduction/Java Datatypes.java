import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        
        for(int i=0;i< x;i++)
        {
            try
            {
                long num = sc.nextLong();
                System.out.println(num +" can be fitted in: ");
                
                if(num >=- 128 && num <= 127)
                {
                    System.out.println("* byte");
                }
               
                 if(num >= Short.MIN_VALUE && num <= Short.MAX_VALUE)
                 {
                     System.out.println("* short");
                     }
                if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
                {
                    System.out.println("* int");
                    }
                if(num >= Long.MIN_VALUE && num <= Long.MAX_VALUE)
                {
                    System.out.println("* long");
                    }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
