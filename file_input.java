import Data_Encryption.*;
import java.io.*;
import java.util.*;
public class file_input
{
    //int i=1;
    public void input(String s,String naam, int i)
    {
        try
        {
            CalPlay ob4=new CalPlay(); 
            delete ob5=new delete();  
            String name="",s2="",s3="",s4="",s5="",s6="",s7="";
            text_num ob=new text_num();
            num_bar ob1=new num_bar();
            Scanner sc=new Scanner(System.in);
            //System.out.println("Name the file you want to store data");
            //String naam=sc.nextLine();
            naam=naam+".txt";
            FileWriter fw=new FileWriter(naam,true);
            BufferedWriter bw =new BufferedWriter(fw);
            PrintWriter pk=new PrintWriter(bw);
            //for(int i=1;i<=5;i++)
            //{
            System.out.println(" input recived to store "+s+" in "+naam+" i is "+i);
            //name=sc.nextLine();
            if(i<=1)
            {
                ob5.del(naam);
                s3="Executed on";
                System.out.println(" Enterd if to print date time wgara");
                ob4.formal();
                s3=ob4.s;
                s2=ob.tn(s3);
                pk.println(s2);
                ob4.formai();
                s4=ob4.d;s5=ob4.m;s6=ob4.y;
                s7=s4+"/"+s5+"/"+s6;
                s2=ob.tn(s7);
                System.out.println(" just printing date time wgara");
                pk.println(s2);
                System.out.println("printed "+s2+" which stores "+s7);
                //s2=ob.tn(s5);
                //pk.println(s2);
                //s2=ob.tn(s6);
                //pk.println(s2);
                pk.println("\n");
                pk.println("\n");
                ++i;
            }
            else
            {
                name=s;
                //System.out.println("name is "+name);
                s2=name;
                s2=ob.tn(name);
                //=ob.s3; 
                System.out.println("s2 is "+s2);
                pk.println(s2);
            }
            pk.close();
            bw.close();
            fw.close();
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}