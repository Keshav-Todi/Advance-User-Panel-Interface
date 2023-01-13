package Data_Encryption;
import java.util.*;
public class degenerate
{
    public String dege(String s)
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("");
        //String s=sc.nextLine();
        int i=0,j=0,l=0;
        char c=' ';
        //s="? ?  ? |  | ?  | ?|  | |?  ??  ? ?  |?  | ?  ? |  | |?  | ?",
        String s1="";
        l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c==' ')
            s1=s1+'a';
            else if(c=='|')
            s1=s1+'b';
            else if(c=='?')
            s1=s1+'c';
        }
        //System.out.println(s);
        //System.out.println(s1);
        return (s1);
    }
} 