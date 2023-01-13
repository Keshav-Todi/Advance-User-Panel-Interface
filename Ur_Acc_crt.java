import java.util.*;
import java.io.*;
class Ur_Acc_crt
{

    void create()//throws IOException
    {
        //try
        //{
            Scanner sc=new Scanner(System.in);
            String n="",p="";
            file_input obb=new file_input();
            System.out.println("Enter name");
            n=sc.nextLine();
            System.out.println("Enter password");
            p=sc.nextLine();
            /*FileWriter fw = new FileWriter("logkey.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw =new PrintWriter(bw);*/
            obb.input(n,"logkey",5);//pw.println(n);
            obb.input(p,"logkey",5);//pw.println(p);
            //pw.close();
            //bw.close();
            //fw.close();
        //}
        /*catch(IOException e)
        {
        }*/
    }

    public static void main(String args[])
    {
        Ur_Acc_crt ob=new Ur_Acc_crt();
        ob.create();
    }
}