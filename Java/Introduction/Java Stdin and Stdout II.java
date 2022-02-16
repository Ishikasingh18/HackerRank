import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
       Scanner sc = new Scanner(System.in);
       
        int x = sc.nextInt();
        double y = sc.nextDouble(); 
        sc.nextLine();
        String z = sc.nextLine();
        sc.close();
        
        System.out.println("String: " + z);
        
        System.out.println("Double: " + y);
        System.out.println("Int: " + x);
        
        
        
    }
}
