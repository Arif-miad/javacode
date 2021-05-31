
package javaapplication;

import java.util.Scanner;


public class ScannerJa {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        int n;
        int m;
        int i;
        int sum = 0;
        
           n=input.nextInt();
           System.out.println("Enter the initiai number   :");
           m=input.nextInt();
           System.out.println("Enter the  number final  :");
           
           for ( i = n; i < m; i++) {
            sum = sum + i;
        }
           System.out.println(sum);
           
           
           
    }
         
}
