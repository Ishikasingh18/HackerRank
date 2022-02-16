import java.io.*;
import java.util.*;

public class Solution {
    
        static Scanner sc = new Scanner(System.in);
        static boolean flag;
       
         static int B = sc.nextInt();
         static int H = sc.nextInt();
         
        static{
            
          try{
              if(B > 0 && H > 0){
                flag = true;  
              }
              else{
                  throw new Exception("Breadth and height must be positive");
              }
          }
          catch(Exception ex){
              System.out.println(ex);
          }
        } 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        if(flag){
            int area = B*H;
            System.out.println(area);
        }
    }
}
