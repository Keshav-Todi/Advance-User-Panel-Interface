package Data_Encryption;

//package Data_Encryption;
import java.io.*;
class sampbar 
{
    public String sb(String s)//throws IOException
    {
        //file_input ob=new file_input();
        try
        {
            FileReader fr=new FileReader("Samplebar.txt");
            BufferedReader fileInput =new BufferedReader(fr);
            String name=fileInput.readLine();
            char c=name.charAt(0);
            //System.out.println(c);
            fileInput.close();
            int i=0,j=0,l=0;
            char c1=' ';
            String s1="";
            l=s.length();
            for(i=0;i<l;i++)
            {
                c1=s.charAt(i);
                //if(c1=='?')
                if(c1!='|'&&c1!=' ')
                    s1=s1+'?';
                else
                    s1=s1+c1;
            }

            //System.out.println("question coonversion is "+s1);
            //ob.input(s1,"storany",4);
            return s1;
        }
        catch(FileNotFoundException e)
        {
            System.out.print("Sorry  File not found\n\n");
            return "";
        }
        catch(IOException e1)
        {
            System.out.print("Sorry  File not found\n\n");
            return "";
        }
    }
}