import java.util.*;
import java.io.*;
public class Error
{
    static int c=4;
    public static void infinty(int i)
    {
        //int i=0,k=0;

        Scanner sc=new Scanner(System.in);
        Word ob =new Word();

        //k=0;
        try
        {
            //System.out.println("hi");
            i=sc.nextInt();
            //System.out.println("taken new value "+i );
        }

        catch(InputMismatchException e)
        {
            System.out.println(e.getMessage()+" is not a valid no.");
            //k++;
        }
        /*
        if(k==0)
            return i;
        else
        { 
            System.out.println("enter again");
            --c;
            System.out.println(c+" chances left" );
            if(c==0)
                ob.blast();
            return(eror());
        }
        */
    }
    public static int eror()
    {
        int i=0,k=0;

        Scanner sc=new Scanner(System.in);
        Word ob =new Word();

        k=0;
        try
        {
            //System.out.println("hi");
            i=sc.nextInt();
            //System.out.println("taken new value "+i );
        }

        catch(InputMismatchException e)
        {
            System.out.println(e.getMessage()+" is not a valid no.");
            k++;
        }
        if(k==0)
            return i;
        else
        { 
            System.out.println("enter again");
            --c;
            System.out.println(c+" chances left" );
            if(c==0)
                ob.blast();
            return(eror());
        }

    }

    public static char error()
    {
        int k=0;
        char c=' ';
        Scanner sc=new Scanner(System.in);

        k=0;
        try
        {
            c=sc.next().charAt(0);
        }

        catch(InputMismatchException e)
        {
            System.out.println(e.getMessage()+" is not a valid no.");
            k++;
        }
        if(k==0)
            return c;
        else
        {
            System.out.println("enter again");
            return(error());
        }
    }

    public static int erooor(String s,String f)
    {
        int k=0,i=0;
        old_user ob7=new old_user();
        Scanner sc=new Scanner(System.in);

        k=0;
        try
        {
            i=Integer.valueOf(s);
        }

        catch(NumberFormatException e)
        {
            System.out.println(f+" is not a valid password");
            k++;
        }
        if(k==0)
            return 1;
        else
        {
            System.out.println("enter again");
            return 0;
        }
    }

    public static int eroor(String s,char c,String f)
    {

        int k=0,i=0;
        try
        {
            i=s.indexOf(c,0);
        }

        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(f+" is not a valid password");
            k++;
        }
        if(i>0)
            return 1;
        else
        {
            System.out.println("enter again");
            return 0;
        }
        

    }
    public static String erorr()
        {
            int i=0,k=0;
        String s="";
            Scanner sc=new Scanner(System.in);
            Word ob =new Word();

            k=0;
            try
            {
                System.out.print("");
                s=sc.nextLine();
                //System.out.println("taken new value "+s);
            }

            catch(InputMismatchException e)
            {
                System.out.println(e.getMessage()+" is not a valid no.");
                k++;
            }
        if(k==0)
            return s;
        else
        { 
            System.out.println("enter again");
            --c;
            System.out.println(c+" chances left" );
            if(c==0)
                ob.blast();
            return(erorr());
        }
    }
}

//StringIndexOutOfBoundsException