import java.util.*;
public class CalPlay
{
    String s="",s1="";
    String d=" ",m=" ",y=" ";
    int h1=0,i1=0,n1=0;
    void formal()
    {
        Date d=new Date();
        s=d.toString(); 
        //System.out.println(""+s);
    }
    void formai()
    {
        Calendar c=Calendar.getInstance();
        int d1=c.get(Calendar.DATE);
        int m1=c.get(Calendar.MONTH)+1;
        int y1=c.get(Calendar.YEAR);
        h1=c.get(Calendar.HOUR);
        i1=c.get(Calendar.MINUTE);
        n1=c.get(Calendar.SECOND);
        d=Integer.toString(d1);
        y=Integer.toString(y1);
        m=Integer.toString(m1);
        s1=d+"/"+m+"/"+y;
        //System.out.println("");
       
        //System.out.println("Executed on :-"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
        //System.out.println(y+","+m+","+d);
    }
}
        
