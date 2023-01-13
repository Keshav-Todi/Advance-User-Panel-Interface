import java.util.*;
import java.io.*;
class Gt_dt
{
    protected int age=0,c=0,cn_id=0,n=0;
    protected String name="",gaurdian="",dob="",status="",bld_grp="",text="",a[];
    protected boolean flag=false;
    void detail(String s)//throws IOException
    {
        //try
        //{
        //System.out.println("hello ");
        flag=false;
        //FileReader fr = new FileReader("Data.txt");
        //BufferedReader br = new BufferedReader(fr);
        s=s.toUpperCase();

        word_need ob1=new word_need();

        file_output ob=new file_output();
        ob.output("Data",2);
        n=ob.n;
        a=new String[900];
        int i=0;
        for(i=0;i<n;i++)
            a[i]=ob.a[i];
        i=0;
        while(i<n)
        {
            ob1.proper(a[i]);
            //System.out.println("ob1.a[0] IS "+ob1.a[0]+" , s is "+s);
            if(ob1.a[0].equals(s))
            {
                //System.out.println("FOUND");
                name=a[i];
                cn_id=Integer.valueOf(a[++i]);
                age=Integer.valueOf(a[++i]);
                bld_grp=a[++i];
                gaurdian=a[++i];
                status=a[++i];
                c=Integer.valueOf(a[++i]);
                dob=a[++i];
                flag=true;
                break;
            }
            i=i+8;
        }
        //if(flag==false)
          //  System.out.println("No details found");
        //}
        //catch(IOException e)
        //{

        //}
    }
}
