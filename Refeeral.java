import  Array.*;
import java.util.*;
public class Refeeral
{
    int i=3;
    public void ref()
    {
        Scanner sc=new Scanner(System.in);
        file_output ob=new file_output();
        ob.output("referral",2);
        String b=ob.a[0];
        System.out.println("b is "+b);
        String c="guest";
        name ob6=new name();
        //String b=ob6.S;
        Word ob7=new Word();
        if(i!=-1)
        {
            System.out.println("Please ,Enter your referral-admin or guest");
            
            String a=sc.nextLine();
             System.out.println("user entered "+a);
            if(a.equals(b))
            {
                System.out.println("User identified ,Hello Keshav ");
            }
            else if(a.equals(c))
            {
                System.out.println("guest identified ,permission granted ");
            }
            else
            {
                System.out.println("Not identified ,permission not granted , you have "+i+" more chances");
                i--;
                ref();
            }
        }
        else
        ob7.blast();
    }
}
