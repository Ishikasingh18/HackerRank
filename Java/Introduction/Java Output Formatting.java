import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
    
        Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            
            for (int i = 1; i<=3; i++) {
                
                String str = sc.next();
                int n = sc.nextInt();
                 System.out.printf("%-15s", str);
                System.out.printf("%03d%n", n );
               
            }
            System.out.println("================================");
    }
}
