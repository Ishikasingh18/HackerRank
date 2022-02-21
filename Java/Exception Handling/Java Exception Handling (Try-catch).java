import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        try{
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x/y;
        System.out.println(z);
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
        }
        catch(InputMismatchException ex){
            System.out.println(ex.getClass().getName());
        }
        finally{
            sc.close();
        }
        
        
        
        
    }
}
