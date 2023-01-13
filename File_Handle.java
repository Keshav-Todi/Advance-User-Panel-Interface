import java.util.*;
import java.io.*;
public class File_Handle
{
    /*
    public static void selp()throws IOException
    {
    Scanner sc=new Scanner(System.in);
    FileReader ob1=new FileReader("test1.txt");
    int a=ob1.read();
    System.out.println(a);
    if(ob1!=null)
    ob1.close();
    }
     */

    void datan() {
        word_need ob=new word_need();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of user of whom's content you want to see");
        String s1=sc.next();
        String p=s1+"f.txt";
        String c=s1+"c.txt";
        s1=s1+".txt";
        System.out.println("Enter 1 to see contents of file");
        System.out.println("Enter 2 to see latest feedback\n\n\n\n\n\n");
        int a=sc.nextInt();
        int d=0;
        //System.out.println("a is "+a);
        if(a==1)
        {
            File file = new File(c);d++;
            //System.out.println("I have enterd date "+a);
            try {
                FileReader fileReader = new FileReader(file);
                StringBuffer stringBuffer = new StringBuffer();
                int numCharsRead;
                char[] charArray = new char[1024];
                while ((numCharsRead = fileReader.read(charArray)) > 0)
                {
                    stringBuffer.append(charArray, 0, numCharsRead);
                }
                fileReader.close();
                //System.out.println("Contents of file:");
                String s=stringBuffer.toString();
                //System.out.println("work over s is  "+s);
                //System.out.println(s);
                String b[]=new String[100];
                ob.proper(s);
                int k=ob.k;
                 //System.out.println("words stored in array  "+k);
                for(int i=0;i<k;i++)
                b[i]=ob.a[i];
                System.out.print("\nExecuted on- ");
                System.out.print("      ");
                for(int i=0;i<k;i++)
                {
                    if(i!=6)
                    System.out.print(b[i]+" ");
                    else
                    System.out.print("\n                   "+b[i] );
                }
                //ob.spaces(s);
            } 
            catch (FileNotFoundException e) 
            {
                System.out.println("\n\nSorry date not found");

            }
            catch (IOException e1) 
            {
                e1.printStackTrace();

            }
        }
        if(a==1)
        {
            File file = new File(s1);d++;
            try {
                FileReader fileReader = new FileReader(file);
                StringBuffer stringBuffer = new StringBuffer();
                int numCharsRead;
                char[] charArray = new char[1024];
                while ((numCharsRead = fileReader.read(charArray)) > 0) 
                {
                    stringBuffer.append(charArray, 0, numCharsRead);
                }
                fileReader.close();
                System.out.println("\n\n\nContents of file:");
                String s=stringBuffer.toString();
                //System.out.println(s);
                ob.spaces(s);
                System.out.println("\n\n");
                a=2;
            } 
            catch (FileNotFoundException e) 
            {
                System.out.println("Sorry file not found");

            }
            catch (IOException e1) 
            {
                e1.printStackTrace();

            }
            
        }
        //System.out.println("a is "+a);
        if(a==2)
        {
            File file = new File(p);d++;
            //System.out.println("I have enterd feedback "+a);
            try {
                FileReader fileReader = new FileReader(file);
                StringBuffer stringBuffer = new StringBuffer();
                int numCharsRead;
                char[] charArray = new char[1024];
                while ((numCharsRead = fileReader.read(charArray)) > 0)
                {
                    stringBuffer.append(charArray, 0, numCharsRead);
                }
                fileReader.close();
                //System.out.println("Contents of file:");
                String s=stringBuffer.toString();
                //System.out.println(s);
                //System.out.println("work over s is  "+s);
                String b[]=new String[100];
                ob.proper(s);
                int k=ob.k;
                 //System.out.println("words stored in array  "+k);
                for(int i=0;i<k;i++)
                b[i]=ob.a[i];
                System.out.println("\n\nFeedback  - \n");
                System.out.print("      ");
                for(int i=0;i<k;i++)
                System.out.print(b[i]+" ");
                //ob.spaces(s);
            } 
            catch (FileNotFoundException e) 
            {
                System.out.println("\n\nSorry feedback not found");

            }
            catch (IOException e1) 
            {
                e1.printStackTrace();

            }
             //catch (FileNotFoundException e)
            
            //{
                

            //}
        }
        if(d!=0)
        {

        }
        else
            System.out.println("Invalid choice");
    }
}
