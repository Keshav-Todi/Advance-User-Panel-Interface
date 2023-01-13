package Data_Encryption;
import java.util.*;
public class num_text
{
    public String nt(String s)
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,l=0,l1=0,v=0;
        char c=' ',c1=' ';
        String s1="",s2="";
        //System.out.println("Enter number");
        //String s=sc.nextLine();
        //s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(i%2==1)
            continue;
            s1="";
            if(i<(l-2))
            {
                s1=s.substring(i,i+2);
                j=Integer.valueOf(s1);
                c=(char)j;
                s2=s2+c;
            }
            else
            {
                s1=s.substring(i,l);
                j=Integer.valueOf(s1);
                c=(char)j;
                s2=s2+c;
            }
        }
        //System.out.println("text is "+s2);
        return s2;
    }
}