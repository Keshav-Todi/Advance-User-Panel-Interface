package Calculator;
import java.util.*;
public class simplify
{
    public double simple(String s)
    {
        double fina=0.0;
        try
        {
            Scanner sc=new Scanner(System.in);
            call ob=new call();
            Calculator ob1=new Calculator();
            int i=0,l=0,k=1,d=0,index=0,mod=0,z=1;
            
            char c=' ';
            //double
            String so="",s3="",s4="";
            System.out.println("Enter equation");
            //s=sc.nextLine();
            l=s.length();
            //while(true)
            //{
            for(i=0;i<l;i++)
            {
                if(z==0)
                {i=0;++z;}
                System.out.println("i is "+i+" l is "+l);
                c=s.charAt(i);
                System.out.println("c is "+c);
                d=0;k=0;
                while(c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5'&&c!='6'&&c!='7'&&c!='8'&&c!='9'&&c!='0'&&c!='.'&&c!='+'&&c!='-'&&c!='*'&&c!='/'&&c!='^')
                {
                    if(d==0)
                    {
                        index=i;
                        d++;
                    }
                    System.out.println("No no. , no + - * / , it is "+c);
                    if(mod==1)
                    {
                        so=so+'-';
                        mod=0;
                    }
                    else
                        so=so+c;
                    System.out.println("so is "+so);

                    c=s.charAt(++i);
                    if(c=='-')
                    {
                        mod=1;
                        c='|';
                    }
                    System.out.println("now c is "+c);
                    while(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0'||c=='.')
                    {
                        System.out.println(" no. in operation confirmed , it is "+c);
                        so=so+c;
                        System.out.println("so is "+so);
                        if(i!=(l-1))
                        {
                            c=s.charAt(++i);
                            System.out.println("now c is "+c);
                        }
                        else
                            c='+';
                        System.out.println("i am at end of ' no. inside operation ' "+c);
                        k++;
                    }
                    System.out.println("i am at end of 'No no. , no + - * / ' "+c);
                }
                if(k!=0)
                    System.out.println("final so is "+so);
                if(k!=0)
                    so=ob.bich(so);
                if(k!=0)
                {
                    s3=s.substring(0,index);   
                    c=s.charAt(i);
                    if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0'||c=='.')
                        s4=s.substring(i+1,l);
                    else
                        s4=s.substring(i,l);
                    System.out.println("Backward part is "+s3);
                    System.out.println("Forward part is "+s4); 
                    s=s3+so+s4;
                    System.out.println("s is "+s);
                    l=s.length();
                    so="";
                    z=0;
                }
            }
            //}

            System.out.println("\n\nSimple form is "+s);
            fina=ob1.kiki(s);
            if(fina!=0.0)
            {   
                //System.out.println("fina is "+fina);
                double kina=fina;
                fina=fina*100;
                fina=Math.round(fina);
                fina=fina/100;
                if(fina==0.0)
                fina=kina;
                System.out.println("Ans is "+fina);
            }
            else
            fina=Double.valueOf(s);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e.getMessage()+" is a invlid");

        }
        catch(StringIndexOutOfBoundsException e1)
        {
            System.out.println(e1.getMessage()+" is a invlid");

        }
        
                return fina;
    }
}
 