package Calculator;
import java.util.*;
public class Calculator
{
public static double kiki(String s)
{
Scanner sc=new Scanner(System.in);
int i=0,j=0,r=0,z=0,n=0,y=0,l=0,l1=0,d=0;
double a1=0.0,a2=0.0;
double k=0;
String s1="",s2="",s3="",s4="";
char c1=' ',c=' ',c3=' ';
boolean flag=false;
//System.out.println("String given to me "+s); 
//System.out.println("Enter operation");
//String s=sc.nextLine();
if(s.equals(""))
flag=true;
s=s+"+0";
l=s.length();
if(flag==false)
{
for(y=1;y<=3;y++)
for(i=0;i<l;i++)

{
    d=1;
    //main part
    c1=s.charAt(i);
    if((c1=='^')&&(y==2))
    {
        s1="";
        s2="";
        s3="";
        z=1;
        for(j=i-1;j>=0;j--)

       {
        //2 main part
        if(j!=0)
        c3=s.charAt(j-1); 
        c=s.charAt(j);
        if((c=='1')||(c=='2')||(c=='3')||(c=='4')||(c=='5')||(c=='6')||(c=='7')||(c=='8')||(c=='9')||(c=='.')||(c=='0'))
        {
          s1=s1+c;
        }
        else if((c=='-')&&(((c3=='+')||(c3=='/')||(c3=='*')||(c3=='-'))&&(d==1)))
        {
            s1=s1+c;
            d++;
        }
        else
        {
            break;
        }
       }
       
        for(n=i+1;n<l;n++)

       {
        c3=s.charAt(n-1);
         c=s.charAt(n);
        if((c=='1')||(c=='2')||(c=='3')||(c=='4')||(c=='5')||(c=='6')||(c=='7')||(c=='8')||(c=='9')||(c=='.')||(c=='0'))
        {
            s2=s2+c;
        }
        else
        {
            break;
        }
       }
       //operation to be done here
        l1=s1.length();

       for(r=l1-1;r>=0;r--)
       {
         c=s1.charAt(r);
         s3=s3+c;
       }
       a1=Double.valueOf(s3);
       a2=Double.valueOf(s2);
       if(c1=='^')
       k=Math.pow(a1,a2);
       if(c1=='^')
       k=Math.pow(a1,a2);
       //System.out.println("Hey");   
       s4=Double.toString(k);
       s=s.substring(0,j+1)+s4+s.substring(n,l);//new equation is formed
       l=s.length();
       if(s!=s4)
       i=0;
    }
    if(((c1=='/')||(c1=='*'))&&(y==2))
    {
        s1="";
        s2="";
        s3="";
        z=1;
        for(j=i-1;j>=0;j--)

       {
        //2 main part
        if(j!=0)
        c3=s.charAt(j-1); 
        c=s.charAt(j);
        if((c=='1')||(c=='2')||(c=='3')||(c=='4')||(c=='5')||(c=='6')||(c=='7')||(c=='8')||(c=='9')||(c=='.')||(c=='0'))
        {
          s1=s1+c;
        }
        else if((c=='-')&&(((c3=='+')||(c3=='/')||(c3=='*')||(c3=='-'))&&(d==1)))
        {
            s1=s1+c;
            d++;
        }
        else
        {
            break;
        }
       }
       
        for(n=i+1;n<l;n++)

       {
        c3=s.charAt(n-1);
         c=s.charAt(n);
        if((c=='1')||(c=='2')||(c=='3')||(c=='4')||(c=='5')||(c=='6')||(c=='7')||(c=='8')||(c=='9')||(c=='.')||(c=='0'))
        {
            s2=s2+c;
        }
        else
        {
            break;
        }
       }
       //operation to be done here
        l1=s1.length();

       for(r=l1-1;r>=0;r--)
       {
         c=s1.charAt(r);
         s3=s3+c;
       }
       a1=Double.valueOf(s3);
       a2=Double.valueOf(s2);
       if(c1=='/')
       k=a1/a2;
       if(c1=='*')
       k=a1*a2;
       //System.out.println("Hey");   
       s4=Double.toString(k);
       s=s.substring(0,j+1)+s4+s.substring(n,l);//new equation is formed
       l=s.length();
       if(s!=s4)
       i=0;
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=
    if(((c1=='+')||(c1=='-'))&&y==3)
    {
       s1="";
       s2="";
       s3="";
        z=2;
        for(j=i-1;j>=0;j--)

       {
        //2 main part
        if(j!=0)
        c3=s.charAt(j-1); 
        c=s.charAt(j);
        if((c=='1')||(c=='2')||(c=='3')||(c=='4')||(c=='5')||(c=='6')||(c=='7')||(c=='8')||(c=='9')||(c=='.')||(c=='0'))
        {
          s1=s1+c;
        }
        else if((c=='-')&&(((c3=='+')||(c3=='/')||(c3=='*')||(c3=='-'))&&(d==1)))
        {
            s1=s1+c;
            d++;
        }
        else
        {
            break;
        }
       }
       
        for(n=i+1;n<l;n++)

       {
         //2 main part
        c3=s.charAt(n-1); 
        c=s.charAt(n);
        if((c=='1')||(c=='2')||(c=='3')||(c=='4')||(c=='5')||(c=='6')||(c=='7')||(c=='8')||(c=='9')||(c=='.')||(c=='0'))
        {
          s2=s2+c;
          
        }
        else
        {
           break;
 
        }
       
       }
       ///////////////////////////////////////////////////////////////////////////
       l1=s1.length();

       for(r=l1-1;r>=0;r--)
       {
         c=s1.charAt(r);
         s3=s3+c;
       }
       a1=Double.valueOf(s3);
       a2=Double.valueOf(s2);
       if(c1=='+')
       k=a1+a2;
       if(c1=='-')
       k=a1-a2;
       //System.out.println("Hey");  
       s4=Double.toString(k);
       s=s.substring(0,j+1)+s4+s.substring(n,l);//new equation is formed
       l=s.length();
       if(s!=s4)
       i=0;

    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
}
}
else
k=0.0;
//System.out.println("Returnin k"+k); 
return(k);
      
}
}