package Data_Encryption;
import java.util.*;
public class text_num
{
    public String s3="";
    public String tn(String s)
    {
        num_bar ob=new num_bar();
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,l=0,l1=0,v=0;
        char c=' ',c1=' ';
        String s1="",s2="";
        System.out.println("I received "+s);
        //s=sc.nextLine();s="",
        try
        {
        s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l;i++)
        {
            //System.out.println("i is "+i+" l is "+l);
            c=s.charAt(i);
            //System.out.println("char is "+c);
            
            j=(int)c;
            s1=Integer.toString(j);
            l1=s1.length();
            //System.out.println("j is "+j);
            //System.out.println("old v is "+v);
            s2=s2+s1;
            //System.out.println("new v is "+v);
        } 
        //System.out.println("num is "+s2);
        s3=ob.nb(s2);
        System.out.println("finaly bar is "+s3);
        
    }
    catch(NullPointerException e)
    {
        //System.out.println("Null or Invalid");
    }
    return s3;
    }
}