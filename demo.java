
import Data_Encryption.*;
import java.io.*;
import java.util.*;
public class demo
{
    static int n=0;
    static String a[]=new String[100];
    public static void output(String s,int p)//throws IOException
    {
        bar_num ob=new bar_num();
        text_num ob1=new text_num();
        String name="",s1="",naam="";
        int j=0,l=0;
        char c=' ';
        System.out.println("hey");
        try
        {
            Scanner sc=new Scanner(System.in);
            if(p!=2)
            {
                System.out.println("Name the file you want to read data");
                naam=sc.next()+".txt";
                System.out.println("hehe");
            }
            else    
                naam=s+".txt";
            System.out.println("hey");
            System.out.println("hello");
            FileReader fr=new FileReader(naam);
            BufferedReader fileInput =new BufferedReader(fr);
            
            int i=0;
            if(p!=2)
            System.out.println("\n\n");
            if(p!=2)
            System.out.println("----------------------------------------------------------------");
            
            while((name=fileInput.readLine())!=null)
            {
            i++;
            if(i==2)
            {
            l=name.length();
            for(j=0;j<l;j++)
            {
            c=name.charAt(j);
            if(j!=0)
            s1=s1+c;
            }
            //name=s1;
            }

            /*
            while(true)
            {
            l=name.length();
            c=name.charAt(l-1);
            if(c==' ')
            {
            name=name.substring(0,l-1);
            --l;
            }
            else
            break;
            }
             */
            
            System.out.println("//////////////////////////////////////"+name);

            if(name.equals(""))
            {}
            else
            {
            char c3=name.charAt(0);
            /*
            if(c3!='|'&&c3!=' '&&c3!=' ')
            {
            System.out.println("encryting name "+name);
            name=ob1.tn(name);
            System.out.println("new encryted name "+name);
            }
            */
            }
            String name1=ob.bn(name);
            if(name.equals(""))
            {
            System.out.println("");
            --i;
            }
            else
            {
            if(p!=2)
            System.out.println(name1);
            a[n++]=name1;
            }
            }
            fileInput.close();
              
        }

        catch(FileNotFoundException e)
        {
            System.out.print("Sorry "+naam+" File not found\n\n");
        }
        catch(IOException e1)
        {
            System.out.print("Sorry "+naam+" File not found\n\n");
        }

    }
}