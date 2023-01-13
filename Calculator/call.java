package Calculator;
import java.util.*;
class call
{
    String bich(String s)
    {
        Scanner sc=new Scanner(System.in);
        int i=0,l=0,k=0;
        double d=0,d1=0.0,d2=0.0;
        char c,c1=' ';
        String s1="";
        Basics ob=new Basics();
        Advanced ob1=new Advanced();
        //while(true)
        //{
            s1="";
            c1=' ';
            d=0.0;d1=0.0;d2=0.0;
            k=0;i=0;
            System.out.println("Enter task ");
            //s=sc.nextLine();
            System.out.println("s is "+s);
            //if(s.equals("done"))
                //break;
            l=s.length();
            System.out.println("l is "+l);
            c=s.charAt(0);

            if(c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5'&&c!='6'&&c!='7'&&c!='8'&&c!='9'&&c!='0')
            {
                i=0;
                while(c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5'&&c!='6'&&c!='7'&&c!='8'&&c!='9'&&c!='0')
                {
                    s1=s1+c;
                    c=s.charAt(++i);
                }
                c=s1.charAt(0);
                s1=s.substring(i,l);
                i=Integer.valueOf(s1);
                d=(double)i;
                d=ob1.advance(d,c);
            }
            else
            {
                
                System.out.println("starmark not found , first c is "+c);
                for(i=0;i<l;i++)
                {   
                    
                    System.out.println("i is "+i+" till  l "+l);
                    c=s.charAt(i);
                    System.out.println("c is "+c);
                    if(c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5'&&c!='6'&&c!='7'&&c!='8'&&c!='9'&&c!='0')
                    {
                        c1=c;
                        System.out.println("no. not there , c1 is "+c);
                        k=Integer.valueOf(s1);
                        d1=(double)k;
                        System.out.println("d1 is "+d1);
                        s1="";
                    }
                    System.out.println("s1 before "+s1);
                    if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
                    s1=s1+c;
                    System.out.println("s1 after "+s1);
                    System.out.println("i is "+i+" till  l "+l);
                    
                }
                System.out.println("Bye Bye i have left ");
                k=Integer.valueOf(s1);
                d2=(double)k;
                System.out.println("d2 is "+d2);
                System.out.println("sending call to basics with d1 "+d1 +" d2 "+d2+" c "+c1);
                d=ob.basic(d1,d2,c1);
            }
            System.out.println(d);
           
            String s5=Double.toString(d);
            return s5;
        //}
    }
}
 