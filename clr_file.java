import Data_Encryption.*;
import java.io.*;
import java.util.*;
public class clr_file
{
    public void empty(String naam)
    {
        try
        {
            naam=naam+".txt";
            FileWriter fw=new FileWriter(naam);
            BufferedWriter bw =new BufferedWriter(fw);
            PrintWriter pk=new PrintWriter(bw);
            pk.print("");
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