package Array;
import java.util.*;
public class tic_tac_toe
{
    public static void tac()
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,a=0,b=0,d=0,e=0,f=0,k=0,l=0,m=0,n=0;
        System.out.println("Enter no. of rows");
        a=sc.nextInt();
        System.out.println("Enter no. of columns");
        b=sc.nextInt();
        char c[][]=new char[a+2][b+2];
        int z[]=new int[10];
        System.out.println("If you wnat to delete a number enter"+(a+1));
        System.out.println("Enter an Array");
        for(m=0;m<a;m++)
        {
            for(n=0;n<b;n++)
            {      
                if(f%2==0)
                    System.out.println("Now is X 's turn ");
                else
                    System.out.println("Now is O 's turn ");
                System.out.println("Enter row no.");
                d=sc.nextInt();
                System.out.println("Enter column no.");
                e=sc.nextInt();
                if(d==0||e==0)
                {
                    --n;
                    --f;
                    c[z[0]][z[1]]=' ';
                    System.out.println("number reverse succesful");
                    continue;
                }
                z[0]=d-1;
                z[1]=e-1;
                
                if(((((int)c[d-1][e-1]-1)%2==1)||(((int)c[d-1][e-1])%2==1))&&(c[d-1][e-1]!=' '))
                {
                    --n;
                    System.out.println("Space is full,try again");
                    continue;
                }
                else
                {
                    if(d==(a+1))
                    {
                        --n;
                        continue;
                    }
                    else
                    {    
                        if(f%2==0)
                            c[d-1][e-1]='X';
                        else
                            c[d-1][e-1]='O';
                    }
                }
                for(k=0;k<a;k++)
                {
                    for(l=0;l<b;l++)
                    {
                        System.out.print(c[k][l]+"|| ");
                    }
                    System.out.println();
                    System.out.println("= = =");
                }
                for(i=0;i<a;i++)
                {
                    for(j=0;j<b;j++)
                    {
                        if((((int)c[i][j]-1)%2==1)||(((int)c[i][j])%2==1))
                        {
                            if((c[i][j]==c[i][j+1])&&(c[i][j+1]==c[i][j+2]))
                            {
                                if(f%2==0)
                                {
                                    System.out.println("X won");
                                    m=m+1000000;
                                    n=n+100000;
                                }
                                else
                                {
                                    System.out.println("O won");
                                    m=m+10000;
                                    n=n+10000;
                                }
                            }
                        }
                        if((((int)c[j][i]-1)%2==1)||(((int)c[j][i])%2==1))
                        {   
                            if((c[j][i]==c[j+1][i])&&(c[j+1][i]==c[j+2][i]))
                            {
                                if(f%2==0)
                                {
                                    System.out.println("X won");
                                    m=m+10000;
                                    n=n+10000;
                                }
                                else
                                {
                                    System.out.println("O won");
                                    m=m+10000;
                                    n=n+10000;
                                }
                            }
                        }
                        if((((int)c[j][j]-1)%2==1)||(((int)c[j][j])%2==1))
                        {
                            if((c[j][j]==c[j+1][j+1])&&(c[j+1][j+1]==c[j+2][j+2]))
                            {
                                if(f%2==0)
                                {
                                    System.out.println("X won");
                                    i=i+10000;
                                    j=j+10000;
                                    m=m+10000;
                                    n=n+10000;
                                    break;
                                }
                                else
                                {
                                    System.out.println("O won");
                                    i=i+10000;
                                    j=j+10000;
                                    m=m+10000;
                                    n=n+10000;
                                    break;
                                }
                            }
                        }
                        if((((int)c[i][j+2]-1)%2==1)||(((int)c[i][j+2])%2==1))
                        {
                            if((c[i][j+2]==c[i+1][j+1])&&(c[i+1][j+1]==c[i+2][j]))
                            {
                                if(f%2==0)
                                {
                                    System.out.println("X won");
                                    i=i+10000;
                                    j=j+10000;
                                    m=m+10000;
                                    m=n+10000;
                                    break;
                                }
                                else
                                {
                                    System.out.println("O won");
                                    i=i+10000;
                                    j=j+10000;
                                    m=m+10000;
                                    m=n+10000;
                                    break;
                                }
                            }
                        }
                        else
                        {
                            j=j+3;
                        }
                    }
                }
                f++;
            }
        }
    }
}