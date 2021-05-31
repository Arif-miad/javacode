

package javaapplication;

import java.util.Scanner;



public class MultipeSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,sum=0;
        System.out.print("Enter the value of x :");
        x = input.nextInt();
        for (int i = 2; i < x; i=i*2) {
            System.out.println(i);
            sum=sum+i;
            
        }
        System.out.println("sum = " +sum);
    }
}
