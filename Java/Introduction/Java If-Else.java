import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        if(n % 2 == 0)       //even
        {
            if( n >= 2  && n <= 5){
                 System.out.println("Not Weird"); 
            }
            else if( n >= 6 && n <= 20){
                System.out.println("Weird"); 
            }
            else if(n >= 20){
                System.out.println("Not Weird"); 
            }
            
        }
            else        //odd
            {
                System.out.println("Weird"); 
            }
    }
}
