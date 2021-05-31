
package javaapplication;

import java.util.Scanner;



public class SeriJava {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner input = new Scanner(System.in);
       n = input.nextInt();
       sum = sum+n*n+1;
        System.out.println("sum = " +sum);
        
    }
}
