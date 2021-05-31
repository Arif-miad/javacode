
package javaapplication;


public class ConTiun {
    public static void main(String[] args)
    {
        int x;
        for(x=1;x<=100;x++)
        {
            if(x==10)
            {
                continue;
            }
            if(x==15){
                continue;
            }
            if(x==19)
            {
                break;
            }
            System.out.println(x);
        }
    }
}
