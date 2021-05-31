
package javaapplication;

import java.util.Scanner;


public class NewSei {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner input = new Scanner(System.in);
        n= input.nextInt();
        for (int i = 2; i < n; i=i+2) {
            System.out.println("i = " +i);
            sum=sum+i;
            
                    
        }
        System.out.println("sum = " +sum);
    }
}
