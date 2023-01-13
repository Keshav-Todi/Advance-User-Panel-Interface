import  Calculator.*;
import java.util.*;
 class calculate
{
    public static void arith()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to calculations, i can calculate anything");
        System.out.println("Enter no.");
        int k=sc.nextInt();
        System.out.println("TRAANSFERRING CONTROL TO FUNCTION");
        Factorial ob=new Factorial();
        int f=ob.fact(k);
        f=f+1; 
        System.out.println("new no. is "+f);
        
    }
}
 