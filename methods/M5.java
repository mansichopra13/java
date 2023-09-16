package methods;
import java.util.Scanner;

public class M5 
{
    public static void myFactorial(int n)
    {
        if(n<0)
        {
            System.out.println("invalid");
            return;
        }
        
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        
        myFactorial(n);
    }
}