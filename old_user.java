import Array.*;
import java.util.*;
import java.io.*;
public class old_user
{
    static String olds="";
    static char cx=' ';
    static String s="";
    static String args[]=new String[10];
    static long si,genderi,agei,ci,deci;
    static int k2=0;
    public static int gass()
    {
        Scanner sc=new Scanner(System.in);
        file_input on1=new file_input();
        Octal_Decimal ob=new Octal_Decimal();
        delete ob6=new delete();
        Encoder ob1=new Encoder();
        new_user ob4=new new_user();
        Word ob2 =new Word();
        Error ob5=new Error();
        Gender ob3=new  Gender();
        age ob9=new age();
        //File_Handler ob10=new File_Handler();
        String omt="",encrypt="",enc="",dec="",s1="",gender="",age="",lucky="";
        String a[]=new String[7];
        int i=0,amt=0,j=0,otm=0,m=4,z=0,y=0,x=0,l=0,count=0,in =0,anailark=0,deci=0;
        char c=' ';
        boolean flag=false,crong=true;
        a[0]="HDFC BANK";a[1]="AXIS BANK";a[2]="ICIC BANK";
        a[3]="STATE BANK OF INDIA";a[4]="PUNJAB BANK";a[5]="WORLD BANK";
        a[6]="SWISS BANK";
        System.out.println("Hi user , Welcome to ATM");
        System.out.println("\nPlease Enter you name");
        s=sc.next();
        gender=ob3.gend(s);
        age=ob9.a;
        lucky=ob9.g;
        //String s7=ob4.naam;
        //System.out.println("Hello "+s7);
        /*if(s7.equals(s))
        {
        m=-1;
        crong=true;
        anailark=1;
        amt=ob4.amt;
        dec=Integer.toString(amt);
        encrypt=s7;
        olds=ob4.s;
        flag=true;
        }*/

        while(m>0)
        {
            z=0;y=0;x=0;crong=false;
            while(z!=1||y!=1||x!=1)
            {
                System.out.println("Enter your password");
                olds=sc.next();l=olds.length();
                y=ob5.eroor(olds,'-',olds);
                if(y==1)
                { i=olds.indexOf('-',1);}
                else
                {crong=false;break;}
                s1=olds.substring(i+1,olds.length());
                x=ob5.eroor(s1,'-',olds);
                if(x==1)
                { j=olds.lastIndexOf('-');}
                else
                {crong=false;break;}
                enc=olds.substring(i+1,j);
                omt=olds.substring(j+1,l);
                if(olds.charAt(0)!='#')
                {crong=false;break;}
                for(in=0;in<7;in++)
                {
                    if(a[in].charAt(0)!=olds.charAt(1))
                    {crong=false;}
                    else
                    {crong=true;break;}
                }
                z=ob5.erooor(omt,olds);
                if(z==1)
                {otm=Integer.valueOf(omt);}
                else
                {crong=false;break;}
            }
            if(crong==false)
            {
                if(olds.equals("5"))
                {
                    System.out.println("Entering name again approved , input new name");
                    s=sc.next();
                    continue;
                }
                System.out.println("Wrong Password "+(--m)+" chances left");
                continue;
            }
            if(anailark==0)
            {
                dec=ob.Decimal(otm);
                //System.out.println("encrypt name "+enc);
                //System.out.println("octal number "+otm);
                encrypt=ob1.enco(s);
                //System.out.println("your recent encryption "+encrypt);
                z=0;
                y=0;
                x=0;
                if(enc.equals(encrypt))
                {
                    flag=true;
                    break;
                }

                else
                    System.out.println("Wrong Password "+(--m)+" chances left");
            }
        }
        if(flag==false)
            ob2.blast();
        else
        {
            cx=olds.charAt(1);
            System.out.println("\nUser identified ,permission granted ");
            System.out.println("Hello , "+s);
            System.out.println("\n  Customer Details-");
            System.out.println("--------------------------------------------------------------------------\n\n");
            System.out.println("Name          :\t"+s);
            System.out.println("Gender :\t"+gender);
            System.out.println("Age :\t"+age);
            for(in=0;in<7;in++)
            {
                if(a[in].charAt(0)==olds.charAt(1))
                {
                    System.out.println("Branch bank   :\t"+a[in]);
                    break;
                }
            }            
            System.out.println("Amount stored :\t"+dec);
            //System.out.println("Anailark :\t"+anailark);
            k2=5;
            deci=Integer.valueOf(dec);
            args[0]=s;args[2]=gender;args[3]=age;args[4]=a[in];args[5]=dec;args[1]=lucky;
            int m1=1;
            String ss=s;
            //System.out.print("Executed on : ");
            ob6.del(s);
            on1.input(s,ss,m1);
            m1=2;
            s="Name - "+s;
            on1.input(s,ss,m1);
            gender="Gender - "+gender;
            on1.input(gender,ss,m1);
            if(age.equals(""))
            {}
            else
            {
                age="Age - "+age;
                on1.input(age,ss,m1);
            }
            a[in]="Bank - "+a[in];
            on1.input(a[in],ss,m1);
            dec="Amount - "+dec;
            on1.input(dec,ss,m1);
            if(lucky.equals(""))
            {}
            else
            {
                lucky="lucky_number - "+lucky;
                on1.input(lucky,ss,m1);
            }
            //si=ob6.easi(s);
            //genderi=ob6.easi(gender);
            //agei=ob6.easi(age);
            //ci=ob6.easi(""+olds.charAt(1));
            //deci=ob6.easi(dec);
            //ob10.help();
        }

        return(deci);
    }
}