package Array;
import java.util.*;
class Fraction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,l=0,l1=0,d=0;
        double a1=0,a2=0;
        char c=' ',c1=' ';
        boolean flag=false;
        String s="",s1="",s2="",s3="";
        System.out.println("Enter a no. in fraction");
        s=sc.next();
        l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c=='/')
            {
                //front part
                for(j=0;j<i;j++)
                {
                    c1=s.charAt(j);
                    s1=s1+c1;
                }
                //back part
                for(j=l-1;j>i;j--)
                {
                    c1=s.charAt(j);
                    s2=s2+c1;
                }
                //back reverse part
                 l1=s2.length();
                for(j=l1-1;j>=0;j--)
                {
                    c1=s2.charAt(j);
                    s3=s3+c1;
                }
            }
        }
       a1=Double.valueOf(s1);
       a2=Double.valueOf(s3);
       s2=Double.toString(a1);
       s1="";
       s3="";
       for(i=1;i<=2;i++)
        {
           d=0;
           flag=false;
           l=s2.length();
            for(j=0;j<l;i++)
           {
              c=s2.charAt(j);
              if(c=='.')
              {
                  flag=true;
                  break;
              }
              else
              {
                  d++;
                  if(i==1)
                  s1=s1+c;
                  if(i==2)
                  s3=s3+c;
                }
           } 
           if(flag==true&&i==1)
           {  
             a2=a2*Math.pow(10,d);
             a1=Integer.valueOf(s1);
            }
           if(flag==true&&i==2)
             a1=a1*Math.pow(10,d);
             s2=Double.toString(a2);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       System.out.println("first is "+a1);
       System.out.println("second is "+a2);
        if(d==10000)
       {
        for(i=(int)a2;i>=1;i--)
        {
           if(a1%i==0&&a2%i==0)
           {
               a1=a1/i;
               a2=a2/i;
           }
        }
        System.out.println(" "+a1);
        System.out.println("----");
        System.out.println(" "+a2);
        Fraction ob1=new Fraction();
       }
    }
}