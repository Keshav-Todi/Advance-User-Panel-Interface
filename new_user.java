import java.util.*;
public class new_user
{
    static String s="";
    static String naam="";
    static int amt=0;
    public static String pass(int z)
    {
        Scanner sc=new Scanner(System.in);
        Octal ob=new Octal();
        Encoder ob1=new Encoder();
        transactions ob3=new transactions();
        old_user ob4=new old_user();
        Error ob9=new Error();
        String news="",omt="",encrypt="";
        String a[]=new String[7];
        int i=0;
        char c=' ';
        a[0]="HDFC";a[1]="AXIS";a[2]="ICIC";a[3]="STATE BANK OF INDIA";a[4]="PUNJAB";a[5]="WORLD BANK";a[6]="SWISS BANK";
        if(z==0)
        {
            System.out.println("Hi new user , Welcome to ATM");
            System.out.println("\nPlease Enter you name");
            naam =sc.next();
            for(i=0;i<7;i++)
                System.out.print(a[i]+",");
            System.out.println("Please Enter your Branch");
            news=sc.next();
            c=news.charAt(0);

            System.out.println("Please Enter your amount to deposit");
            amt=ob9.eror();
            System.out.println("Thanks your account is created ");
        }
        else
        {
            s=ob4.s;
            c=ob4.cx;
            amt=ob3.p;
            System.out.println("amount is "+amt);
        }
        omt=ob.Oct(amt);
        
        encrypt=ob1.enco(naam);
        
        //System.out.println("c is- "+c);
        //System.out.println("encrypt is- "+encrypt);
        //System.out.println("octal num is- "+omt);
        s='#'+""+c+""+'-'+encrypt+'-'+omt;
        //System.out.println("Password is- "+s);
        return(s);
    }
}