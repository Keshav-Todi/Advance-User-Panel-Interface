package Calculator;
import java.util.*;
public class Factorial
{
    public static int fact(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to factorial, i can factorize anything");
        int fact=1; 
        for(int i=1;i<=n;i++)
        fact=fact*i;
        return fact;
    }
}

        