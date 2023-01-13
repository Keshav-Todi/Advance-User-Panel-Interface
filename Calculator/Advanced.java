package Calculator;
import java.util.*;
public class Advanced
{
    public static double advance(double a,char o)
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Welcome to advanced, i can mod ,log ,root ,trigo anything");
        double s=0.0; 
        switch(o)
        {
            case '|':
            s=Math.abs(a);
            break;
            case 'r':
            s=Math.sqrt(a);
            break;
            case 'e':
            s=Math.exp(a);
            break;
            case 'l':
            s=Math.log(a);
            break;
            case 's':
            a=a*3.14/180;
            s=Math.sin(a);
            s=s*10;
            s=Math.round(s);
            s=s/10;
            break;
            case 'c':
            a=a*3.14/180;
            s=Math.cos(a);s=s*10;
            s=Math.round(s);
            s=s/10;
            break;
            case 't':
            a=a*3.14/180;
            s=Math.tan(a);
            s=s*10;
            s=Math.round(s);
            s=s/10;
            break;
            case '!':
            int fact=1; 
            int n=(int)a;
            for(int i=1;i<=n;i++)
                fact=fact*i;
            s=(double)fact;
            break;
            default:
            System.out.println("Wrong choice");

        }
        return s;
    }
}