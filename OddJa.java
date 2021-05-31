
package javaapplication;


public class OddJa {
    public static void main(String[] args) {
        int  i, sum=0;
        for ( i = 1; i < 100; i++) {
            if(i%2!=0)
            {
               
               
                System.out.println(" i = "+i);
               
            }
            
             sum = sum+i;
        }
        System.out.println("sum = "+sum);
    }
}
