import java.util.*;
import java.io.*;
class Store
{

    void Stor()//throws IOException
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int age=0,c=0,cn_id=0;
            String name="",gaurdian="",dob="",status="",bld_grp="";
            cn_id=(int)(Math.random()*10000);
            file_input obb=new file_input();
            Details ob=new Details(cn_id);
            ob.input();
            name=ob.name;
            age=ob.age;
            status=ob.status;
            c=ob.c;
            bld_grp=ob.bld_grp;
            gaurdian=ob.gaurdian;
            dob=ob.dob;
            FileWriter fw = new FileWriter("Data.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw =new PrintWriter(bw);
            System.out.println("Name is "+name);
            obb.input(name,"Data",5);//pw.println(name);
            obb.input(Integer.toString(cn_id),"Data",5);//pw.println(cn_id);
            obb.input(Integer.toString(age),"Data",5);//pw.println(age);
            obb.input(bld_grp,"Data",5);//pw.println(bld_grp);
            obb.input(gaurdian,"Data",5);//pw.println(gaurdian);
            obb.input(status,"Data",5);//pw.println(status);
            obb.input(Integer.toString(c),"Data",5);//pw.println(c);
            obb.input(dob,"Data",5);//pw.println(dob);
            pw.close();
            bw.close();
            fw.close();
        }
        catch(IOException e)
        {

        }
    }

    public static void main(String args[])
    {
        Store ob=new Store();
        ob.Stor();
    }
}