import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.time.LocalDate;

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

public class Solution {
    
    public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
       
       //String month = sc.next();
       int mm = sc.nextInt();
       
       //String day = sc.next();
       int dd = sc.nextInt();
       
       //String year = sc.next();
       int yy = sc.nextInt();
       sc.close();
       
       LocalDate dt = LocalDate.of(yy, mm , dd);
       System.out.print(dt.getDayOfWeek());
       
       
    }
}
