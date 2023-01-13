import java.io.*;
class File_read2
{
    void read()throws IOException
    {
        int s=0;
        FileReader fr=new FileReader("keshav.txt");
        for(int i=1;i<=5;i++)
        {
            s=fr.read();
            System.out.println(i+ " is "+s);
        }
        fr.close();
    }
}
        
            
             
        