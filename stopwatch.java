//package Graphics;
import java.util.*;
import Data_Encryption.*;

public class stopwatch
{
    /*
    public static void watch()
    {
        int i=0,n=0,k=2;
        long j=0;
        i=80;
        k=i/60;
        for(i=80;i>=1;i--)
        {
            n=i;
            for(j=1;j<=678888880;j++)
            {
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            while(n>=60)
            {
                n=n-60;
            }
            if(i%60==0)
            {
                if(n>=10)
                    System.out.println("                                                                                        "+k+":"+n);
                else
                    System.out.println("                                                                                        "+k+":"+"0"+n);
                --k;
            }
            else if(i>60)
            {    
                if(n>=10)
                    System.out.println("                                                                                        "+k+":"+n);
                else
                    System.out.println("                                                                                        "+k+":"+"0"+n);
            }
            else if(i<60)
             {
                 if(i>=10)
                 System.out.println("                                                                                        "+k+":"+i);
                else
                System.out.println("                                                                                        "+k+":"+"0"+i);
            }
            System.out.println("\n\n\n\n\n\n\n\n\n");
        }
    }
    */
    public void wath()
    {
        Scanner sc=new Scanner(System.in);
        stop_grap ob=new stop_grap();
        System.out.println("Enter no. of minutes");
        int k=sc.nextInt();
        System.out.println("Enter no. of seconds");
        int i=sc.nextInt();
        int s=k*60+i;
        ob.watchi(s); 
    }
}
