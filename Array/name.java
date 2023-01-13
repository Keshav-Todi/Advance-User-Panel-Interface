package Array;
import java.util.*;
public class name
{
    public String S="8445";
    public static void naam()
    {
        Scanner sc = new Scanner(System.in);
        
        int k=65,i=0,j=0,y=0;
        char a[][]=new char[10][10];
        int b[]=new int[10];
        char c[][]=new char[10][10];
        char d[]=new char[10];
        for(i=0;i<6;i++)
        {
            for(j=0;j<5;j++)
            {
                a[i][j]=(char)k;

                if(i==5)
                {
                    a[i][j]=(char)k;
                    break;
                }
                k++;
            }
        }
        System.out.println("Enter number of letters");
        y=sc.nextInt();
        for(k=1;k<=y;k++)
        {
            for(i=0;i<6;i++)
            {
                for(j=0;j<6;j++)
                {
                    if(i==5&&j==0)
                    System.out.print(a[i][j]+" || ");
                    else if(i<5)
                    System.out.print(a[i][j]+" || ");
                }
                System.out.println(a[i][j]+" || ");
            }
            System.out.println("Enter row of "+k+" letter");
            b[k-1]=sc.nextInt();
        }
        for(i=0;i<k-1;i++)
        b[i]=--b[i];
        
        for(i=0;i<y;i++)
        {
            for(j=0;j<6;j++)
            {
                System.out.print(a[b[i]][j]);
                c[i][j]=a[j][b[i]];
            }
        }
        System.out.println("now printing");
        for(i=0;i<6;i++)
        {
            for(j=0;j<6;j++)
            {
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
        System.out.println("Now enter final things/n/n");
        for(k=1;k<=y;k++)
        {
            for(i=0;i<6;i++)
            {
                for(j=0;j<6;j++)
                {
                    System.out.print(c[i][j]+" || ");
                }
                System.out.println(c[i][j]+" || ");
            }
            System.out.println("Enter row of "+k+" letter");
            b[k-1]=sc.nextInt();
        }
           for(i=0;i<k-1;i++)
            b[i]=--b[i];
            
            for(i=0;i<y;i++)
            {
                d[i]=c[i][b[i]];
            }

           for(i=0;i<y;i++)
            System.out.print(d[i]);
            
        }
        
    }