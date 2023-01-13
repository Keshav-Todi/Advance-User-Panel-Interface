package Array;
import java.util.*;
class Dots
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,k=0,l=0,a=0;
        char arr[][]=new char[30][30];
        String prr[][]=new String[30][30];
        String qrr[][]=new String[30][30];
        for(i=0;i<20;i++)
        {
            for(j=0;j<20;j++)
            {
                arr[i][j]='.';
            }
        }
        for(i=0;i<20;i++)
        {
            for(j=0;j<20;j++)
            {
                prr[i][j]=" ";
                qrr[i][j]=" ";
            }
        }
        while(true)
        {
            System.out.print("Enter staight or horizontal");
            a=sc.nextInt();
            System.out.print("Enter index");
            k=sc.nextInt();
            l=sc.nextInt();
            if(a==0)
                prr[k][l]="|";
            else
                qrr[k][l]="-";
            System.out.print("  ");
            for(j=0;j<10;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();

            for(i=0;i<10;i++)
            {
                System.out.print(i+" ");
                for(j=0;j<10;j++)
                {
                    if(j<10)
                    { 
                        System.out.print(arr[i][j]+" ");
                        System.out.print(qrr[i][j]+" ");
                    }
                    else
                    {    
                        System.out.print(" "+arr[i][j]+" ");
                        System.out.print(" "+qrr[i][j]+" ");
                    }
                }
                System.out.println();
                for(j=0;j<10;j++)
                {
                    if(j<10)
                        System.out.print("  "+prr[i][j]);
                    else
                        System.out.print(" "+prr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
