
import Data_Encryption.*;
import java.io.*;
import java.util.*;
public class file_output2
{
    static int n=0;
    static String a[]=new String[900];
    public void output(String s,int p)//throws IOException
    {
        n=0;
        bar_num ob=new bar_num();
        text_num ob1=new text_num();
        samplebar obb=new samplebar();
        String name="",s1="",naam="";
        int j=0,l=0;
        char c=' ';

        try
        {
            Scanner sc=new Scanner(System.in);
            if(p!=2 && p!=151)
            {
                System.out.println("Name the file you want to read data");
                naam=sc.nextLine()+".txt";
            }
            else    
                naam=s+".txt";
            FileReader fr=new FileReader(naam);
            BufferedReader fileInput =new BufferedReader(fr);
            int i=0;
            /*
            if(p!=2)
            System.out.println("\n\n");
            if(p!=2)
            System.out.println("----------------------------------------------------------------");
             */
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
                //System.out.println("//////////////////////////////////////"+name);

                if(name.equals(""))
                {}
                else
                {
                    char c3=name.charAt(0);

                    if(c3!='|'&&c3!='?'&&c3!=' ')
                    {
                        //System.out.println("encryting name "+name);
                        //name=ob1.tn(name);
                        //System.out.println("new encryted name "+name);
                    }
                }
                //System.out.println("name substring till 2 ");
                name=obb.sb(name);
                //System.out.println("name substring till 3 ");
                if(name.length()>5)
                    if((name.substring(0,4)).equals("?? ?"))
                    {
                        //System.out.println("Yes equal");
                        name=name.substring(1,name.length());
                    }
                // System.out.println("name substring till 3.5 ");
                String name1=ob.bn(name);
                // System.out.println("name substring till 4 ");
                if(name.equals(""))
                {
                    //System.out.println("");
                    --i;
                }
                else
                {
                    if(p!=2)
                    {    
                        //System.out.println(name1);
                        //System.out.print("");
                    }   
                    a[n++]=name1;
                }
            }
            fileInput.close();
            fr.close();
            if(p==151)
                for(i=0;i<n;i++)
                    System.out.println(i+" - "+a[i]);

            //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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

    public static void nikal()
    {
        file_output2 ob=new file_output2();
        ob.output("",3);
        System.out.println("\n----------------------------------------------------------------\n");
        int n1=0,i=0;
        String a1[]=new String[300];
        n1=ob.n;
        System.out.println("Storage of array "+n1);
        for(i=0;i<n1;i++)
        {
            a1[i]=ob.a[i];
            System.out.println(i+" - "+a1[i]);
        }
    }
}