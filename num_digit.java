import java.util.*;
//import Array.*;
public class num_digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //-|
        int i=0,j=0,k=0,k1=0;
        char ch=' ';
        char c[][]=new char[7][4];

        for(i=0;i<7;i++)
            for(j=0;j<4;j++)
                c[i][j]=' ';
        System.out.println("Enter digit");
        String s=sc.nextLine();
        int l=s.length();
        int a[]=new int[l];
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            a[i]=Integer.valueOf(ch+"");
        }
        //a[0]=n;a[1]=n1;
        digtal_digit ob=new digtal_digit();
        for(i=0;i<7;i++)
        {
            for(k=0;k<l;k++)
            {
                //System.out.println("passing value "+a[k]);
                ob.digi(a[k]);
                //System.out.println("receiving value "+a[k]);
                for(k1=0;k1<7;k1++)
                {
                    for(j=0;j<4;j++)
                        c[k1][j]=ob.c[k1][j];
                }

                for(j=0;j<4;j++)
                {    
                   
                        System.out.print(c[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}