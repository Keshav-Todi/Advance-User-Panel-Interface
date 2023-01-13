package Calculator;
import java.util.*;
public class Basics
{
    public static double basic(double a,double b,char o)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to basics, i can add ,sub ,mul ,div,pow anything");
        System.out.println("I have received a "+a+" b "+b+" o "+o);
        double s=0.0; 
        switch(o)
        {
            case '+':
            System.out.println("I am adding a "+a+" b " +b+" sum is "+(a+b));
            s=a+b;
            System.out.println("s is "+s);
            break;
            case '-':
            s=a-b;
            break;
            case '*':
            s=a*b;
            break;
            case '/':
            s=a/b;
            break;
            case '^':
            s=Math.pow(a,b);
            break;
        }
        // System.out.println("returning s as "+s);
        return s;
    }
}

