import java.util.*;
public class digtal_digit
{
    static char c[][]=new char[7][4];
    public static void digi(int n)
    {
        Scanner sc=new Scanner(System.in);
        //-|
        int i=0,j=0;
        //System.out.println("I have received n as "+n);
        for(i=0;i<7;i++)
            for(j=0;j<4;j++)
                c[i][j]=' ';
        //System.out.println("Enter digit");
        //int n=sc.nextInt();
        if(n==0)
        {
            c[0][1]='-';
            c[0][2]='-';
            c[1][0]='|';
            c[1][3]='|';
            c[2][0]='|';
            c[2][3]='|';
            c[3][0]='|';
            c[3][3]='|';
            c[4][0]='|';
            c[4][3]='|';
            c[5][0]='|';
            c[5][3]='|';
            c[6][1]='-';
            c[6][2]='-';
        } 
        if(n==1)
        {
            c[0][0]='|';
            c[1][0]='|';
            c[2][0]='|';
            //c[1][0]='|';
            c[3][0]='|';
            //c[2][0]='|';
            c[4][0]='|';
            c[5][0]='|';
            c[6][0]='|';
        }
        if(n==2)
        {
            c[0][1]='-';
            c[0][2]='-';
            //c[1][0]='|';
            c[1][3]='|';
            //c[2][0]='|';
            c[2][3]='|';
            c[3][1]='-';
            c[3][2]='-';
            c[4][0]='|';
            //c[4][3]='|';
            c[5][0]='|';
            //c[5][3]='|';
            c[6][1]='-';
            c[6][2]='-';
        }
        if(n==3)
        {
            c[0][1]='-';
            c[0][2]='-';
            //c[1][0]='|';
            c[1][3]='|';
            //c[2][0]='|';
            c[2][3]='|';
            c[3][1]='-';
            c[3][2]='-';
            //c[4][0]='|';
            c[4][3]='|';
            //c[5][0]='|';
            c[5][3]='|';
            c[6][1]='-';
            c[6][2]='-';
        }
        if(n==4)
        {
            //c[0][1]='-';
            //c[0][2]='-';
            c[0][0]='|';
            c[0][3]='|';
            c[0][0]='|';
            c[0][3]='|';
            c[1][0]='|';
            c[1][3]='|';
            c[2][0]='|';
            c[2][3]='|';
            c[3][1]='-';
            c[3][2]='-';
            //c[4][0]='|';
            c[4][3]='|';
            c[5][3]='|';
            c[6][3]='|';
            //c[6][1]='-';
            //c[6][2]='-';
        }
        if(n==5)
        {
            c[0][1]='-';
            c[0][2]='-';
            c[1][0]='|';
            //c[1][3]='|';
            c[2][0]='|';
            //c[2][3]='|';
            c[3][1]='-';
            c[3][2]='-';
            //c[4][0]='|';
            c[4][3]='|';
            //c[5][0]='|';
            c[5][3]='|';
            c[6][1]='-';
            c[6][2]='-';
        }
        if(n==6)
        {
            c[0][1]='-';
            c[0][2]='-';
            c[1][0]='|';
            //c[1][3]='|';
            c[2][0]='|';
            //c[2][3]='|';
            c[3][1]='-';
            c[3][2]='-';
            c[4][0]='|';
            c[4][3]='|';
            c[5][0]='|';
            c[5][3]='|';
            c[6][1]='-';
            c[6][2]='-';
        }
        if(n==7)
        {
            c[0][1]='-';
            c[0][2]='-';
            c[0][3]='-';
            //c[1][0]='|';
            c[1][3]='|';
            //c[2][0]='|';
            c[2][3]='|';
            c[3][1]='-';
            c[3][2]='-';
            c[3][3]='-';
            //c[4][0]='|';
            c[4][3]='|';
            //c[5][0]='|';
            c[5][3]='|';
            c[6][3]='|';
            //c[6][1]='-';
            //c[6][2]='-';
        }
        if(n==8)
        {
            c[0][1]='-';
            c[0][2]='-';
            c[1][0]='|';
            c[1][3]='|';
            c[2][0]='|';
            c[2][3]='|';
            c[3][1]='-';
            c[3][2]='-';
            c[4][0]='|';
            c[4][3]='|';
            c[5][0]='|';
            c[5][3]='|';
            c[6][1]='-';
            c[6][2]='-';
        }
        if(n==9)
        {
            c[0][1]='-';
            c[0][2]='-';
            c[1][0]='|';
            c[1][3]='|';
            c[2][0]='|';
            c[2][3]='|';
            c[3][1]='-';
            c[3][2]='-';
            //c[4][0]='|';
            c[4][3]='|';
            //c[5][0]='|';
            c[5][3]='|';
            c[6][1]='-';
            c[6][2]='-';
        }
        // System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
        for(i=0;i<7;i++)
        {
            for(j=0;j<4;j++)
            {//System.out.print(c[i][j]);
            }
            //System.out.println();
        }
        //System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
    }
}