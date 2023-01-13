package Data_Encryption;
import java.util.*;
class egenerate
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        bar_num ob5=new bar_num();
        System.out.println("");
        String s=sc.nextLine();
        int i=0,j=0,l=0;
        char c=' ';
        //s="? ?  ? |  | ?  | ?|  | |?  ??  ? ?  |?  | ?  ? |  | |?  | ?",
        String s1="";
        l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c=='a')
            s1=s1+' ';
            else if(c=='b')
            s1=s1+'|';
            else if(c=='c')
            s1=s1+'?';
        }
        System.out.println(s);
        System.out.println(s1);
    }
} 