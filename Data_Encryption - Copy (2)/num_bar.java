package Data_Encryption;
import java.util.*;
public class num_bar
{
    public String s1="";
    public String nb(String s)
    {
        bar_num ob=new bar_num();
        degenerate ob1=new degenerate();
        Scanner sc=new Scanner(System.in);
        //String s=sc.nextLine();
        //String s="758925708094";
        int i=0,m=0,l=0;
        char c=' ',c1=' ';
        
        String a[]={"||","?|","|?","??","| |","? |","| ?","? ?","| |?","| ?|"};
        l=s.length();
                //System.out.println("?");
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c=='0')
                s1=s1+a[0];
            else if(c=='1')
                s1=s1+a[1];
            else if(c=='2')
                s1=s1+a[2];
            else if(c=='3')
                s1=s1+a[3];
            else if(c=='4')
                s1=s1+a[4];
            else if(c=='5')
                s1=s1+a[5];
            else if(c=='6')
                s1=s1+a[6];
            else if(c=='7')
                s1=s1+a[7];
            else if(c=='8')
                s1=s1+a[8];
            else if(c=='9')
                s1=s1+a[9];
            s1=s1+"  ";
        }
        //System.out.println("s1 is "+s1);
        String s5=ob1.dege(s1);
        //System.out.println("\n\nDegenerated code [only for mobile scanning purposes ]\n\n"+s5);
        return s1;
        //ob.bn(s1);
    }
}

