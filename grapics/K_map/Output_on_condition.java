package K_map;
import java.util.*;
class Output_on_condition
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Decimal ob=new Decimal();
        String s="";
        int A,B,C,D,sum,dec,i;
        int a[]={0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
        int b[]={0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1};
        int c[]={0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1};
        int d[]={0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
        int x[]={0,1,1,1,0,1,1,1,1,1,1,1,0,0,0,0};
        System.out.println("Has excellent academic record");
        s=sc.next();
        if(s.equals("True"))
            A=1;
        else
            A=0;
        System.out.println("Financially sound");
        s=sc.next();
        if(s.equals("True"))
            B=1;
        else
            B=0;
        System.out.println("Belongs to backward class");
        s=sc.next();
        if(s.equals("True"))
            C=1;
        else
            C=0;
        System.out.println("Is physically impaired");
        s=sc.next();
        if(s.equals("True"))
            D=1;
        else
            D=0;
        sum=A*1000+B*100+C*10+D;
        dec=ob.Dec(sum);
        i=x[dec];
        if(i==1)
            System.out.println("Scholarship Granted");
        else
            System.out.println("Scholarship not Granted");        
    }
}
