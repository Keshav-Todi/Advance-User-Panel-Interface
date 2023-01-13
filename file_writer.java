import java.util.*;
import java.io.*;
public class file_writer
{

    public static void wriet()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        //old_user ob2=new old_user();
        FileWriter ob=new FileWriter("kk.txt");
        //String s=ob2.args[0];String s1=ob2.args[1];String s2=ob2.args[2];String s3=ob2.args[3];String s4=ob2.args[4];

        //System.out.println(s+ " "+ob2.args[0]);
        //System.out.println(s1+ " "+ob2.args[1]);
        //System.out.println(s2+ " "+ob2.args[2]);
        //System.out.println(s3+ " "+ob2.args[3]);
        //System.out.println(s4+ " "+ob2.args[4]);
        ob.write(c);
        if(ob!=null)
            ob.close();
        //long si=ob2.si;
        //long genderi=ob2.genderi;
        //long agei=ob2.agei;
        //long ci=ob2.ci;
        //long deci=ob2.deci;
        //si=672565086;
        //int abhi=672;
        //int hj=67;
        /*System.out.println("Hey ..."+abhi);
        if(j!=0)
        {
        //for(int i=0;i<5;i++)
        //{   
        System.out.println("kemone ache ");
        //System.out.print(ob2.args[i]+", ");
        System.out.println((int)si);
        System.out.println((int)genderi);
        System.out.println((int)agei);
        System.out.println((int)ci);
        System.out.println((int)deci);
        ob.write((int)si);
        ob.write((int)genderi);
        ob.write((int)agei);
        ob.write((int)ci);
        ob.write((int)deci);
        //}
        }
        else
        {
        System.out.println("pe pe pe ");
        ob.write(abhi);
        ob.write(6666);
        ob.write(777);
        //if(ob!=null)
        //ob.close();
        System.out.println(abhi+" kkkkk");

        //if(ob!=null)
        //  ob.close();
        ob.write(7777);
        //ob.write("rwjtojrhtjjtouijjoejorej");
        if(ob!=null)
        ob.close();
        }
        /*
        FileReader ob1=new FileReader("Sum.txt");
        int k=ob1.read();
        System.out.println("k is "+k);

         */
    }

    public static void bestie() {	
        try {
            old_user ob2=new old_user();
            CalPlay ob3=new CalPlay();
            
            String s=ob2.args[0];String s1=ob2.args[1];String s2=ob2.args[2];String s3=ob2.args[3];String s4=ob2.args[4];
            String p=s+".txt";
            String d=s+"d.txt";
            System.out.println("Details stored in "+p);
            File file = new File(p);
            FileWriter fileWriter = new FileWriter(file);
            for(int i=0;i<6;i++)
            {
                fileWriter.write(ob2.args[i]);
                fileWriter.write("\n");
                System.out.println("\n");
            }
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        bestin();
    }

    public static void besti(String s) 
    {	
        try {
            Alexa ob2=new Alexa();	
            //String s=ob2.s;
            //System.out.println("String s passed in feedback is "+s);
            //System.out.println("I have enterd feedback ");
            old_user ob3=new old_user();
            String p=ob3.args[0];
            p=p+"f.txt";
            //System.out.println("feedback to be stored in "+p);
            File file = new File(p);
            FileWriter fileWriter = new FileWriter(file);
            //for(int i=0;i<5;i++)
            //{
            fileWriter.write(s);
            //System.out.println("Finally s "+s+"stored in "+p);
            System.out.println("\n");
            //}
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
     public static void bestin() 
    {	
        try {
            
            //String s=ob2.s;
            old_user ob3=new old_user();
            String p=ob3.args[0];
            p=p+"c.txt";
            File file = new File(p);
            FileWriter fileWriter = new FileWriter(file);
            //for(int i=0;i<5;i++)
            //{
                CalPlay ob7=new CalPlay();
                ob7.formal();
                ob7.formai();
                String s=ob7.s;
                String d=ob7.d;String m=ob7.m;String y=ob7.y;
               // System.out.println("s is "+s);
              //  System.out.println("d is "+d);
               // System.out.println("m is "+m);
               // System.out.println("y is "+y);
            fileWriter.write(s);
            //System.out.println("s stored in "+p);
            System.out.println("\n");
            //}
            fileWriter.write(" ");
            d=d+"/"+m+"/"+y;
            fileWriter.write(d);
            //System.out.println("all stored ");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
}