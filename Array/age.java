package Array;
import java.util.*;
public class age
{
    public static String a="";
    public static String g="";
    public static void guesse()
    {
        Scanner sc=new Scanner("System.in");
        //Error ob=new Error();
        int i=0,n1=0;
        long j=0;
        String n="";
        System.out.println("Lets start to guess your number and age");
        System.out.println("Make sure you have a calculator\n ");
        System.out.println("Follow me as I say , I will ask you simple Questions ");
        for(i=1;i<=9;i++)
        System.out.print(i+" ");
        System.out.println();
        System.out.println("Choose a number between 1 to 9\n ");
        for(j=999999999;j>=0;j--)
        {
        }
        System.out.println("Now multiply the number with 2\n");
        for(j=999999999;j>=0;j--)
        {
        }
        System.out.println("Now add 5 to the result\n ");
        for(j=999999999;j>=0;j--)
        {
        }
        System.out.println("Now multiply it with 50\n ");
        for(j=999999999;j>=0;j--)
        {
        }
        System.out.println("Now If you already had your birthday this year add 1879 or else add 1878\n");
        for(j=999999999;j>=0;j--)
        {
        }
        System.out.println("Now subtract the result from your birth year\n");
        for(j=999999999;j>=0;j--)
        {
        }
        System.out.println("Enter the result");
        n=erorr();
        n1=Integer.valueOf(n);
        n1=n1-111;
        n=Integer.toString(n1);
        g=n.substring(0,1);
        a=n.substring(1,3);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Your guess number is "+g+"\n");
        System.out.println("Your age is "+a);
    }
    public static String erorr()
        {
            int i=0,k=0;
        String s="";
            Scanner sc=new Scanner(System.in);
            //Word ob =new Word();

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
            //if(k==0)
            return s;
        }
}

        
        
        
        
        
        