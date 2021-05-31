
package javaapplication;

import java.util.Scanner;


public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n,m,i,sum=0;
        System.out.print("\n Enter the number of n: \n");
        System.out.print("Enter the number of m:");
        n = input.nextInt();
        m = input.nextInt();
        for(i=n;i<=m;i++)
        {
            if(i%2==0)
            {
                 sum =sum +i;
                  System.out.println("i = " +i);
            }
           
        }
        System.out.println("sum = " +sum);
    }
}
