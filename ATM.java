import java.util.*;
public class ATM
{
    public static int atun()
    {
        Scanner sc=new Scanner(System.in);
        new_user ob=new new_user();
        old_user ob2=new old_user();
        String newe="";
        int k=0,d=0;
        System.out.println("Enter new user or old");
        String s=sc.next();
        if(s.equals("new"))
        {
            newe=ob.pass(0);
            System.out.println("Password is"+newe);  
            return 0;
        }
        else
        {
            k=ob2.gass(); d++;
            return 1;
        }
        /*
        System.out.println("I am printing ");
        if(d==0)
       {
            String s1=ob.s;
            System.out.println("Hello "+s1);
        }
        */
    }
}