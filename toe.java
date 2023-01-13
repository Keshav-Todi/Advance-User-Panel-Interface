import java.util.*;
public class toe
{
    static int f=0;
    static char c[][]=new char[5][5];
    static int z[]=new int[10];
    static boolean flag=false,win=false;
    static int winner[][]=new int[5][5];
    public static void tac(int d,int e)
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,a=0,b=0,k=0,l=0,m=0,n=0;
        flag=false;win=false;
        //System.out.println("he he");

        for(m=0;m<3;m++)
            for(n=0;n<3;n++)
                winner[i][j]=2;
        //a=sc.nextInt();
        //System.out.println("Enter no. of columns");
        //b=sc.nextInt();
        a=3;b=3;
        //System.out.println("If you wnat to delete a number enter"+(a+1));
        //System.out.println("Enter an Array");    
        //if(f%2==0)
        //System.out.println("Now is X 's turn ");
        //else
        //System.out.println("Now is O 's turn ");
        //System.out.println("Enter row no.");
        //d=sc.nextInt();
        //System.out.println("Enter column no.");
        //e=sc.nextInt();
        if(d==0||e==0)
        {
            --n;
            --f;
            c[z[0]][z[1]]=' ';
            //System.out.println("number reverse succesful");
            //continue;
        }
        z[0]=d-1;
        z[1]=e-1;

        if(((((int)c[d-1][e-1]-1)%2==1)||(((int)c[d-1][e-1])%2==1))&&(c[d-1][e-1]!=' '))
        {
            --n;
            flag=true;
            //System.out.println("Space is full,try again");
            --f;
            //continue;
        }
        else
        {
            if(d==(a+1))
            {
                --n;
                //continue;
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
                //System.out.print(c[k][l]+"|| ");
            }
            //System.out.println();
            //System.out.println("= = =");
        }
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                if((((int)c[i][j]-1)%2==1)||(((int)c[i][j])%2==1))
                {
                    if((c[i][j]==c[i][j+1])&&(c[i][j+1]==c[i][j+2]))
                    {
                        win=true;
                        winner[i][j]=5;winner[i][j+1]=5;winner[i][j+2]=5;
                        //for(m=0;m<3;m++)
                        //for(n=0;n<3;n++)
                        //System.out.println("Winner is "+winner[m][n]+"// "+m+" "+n);
                        if(f%2==0)
                        {
                            //System.out.println("X won");
                            m=m+1000000;
                            n=n+100000;
                        }
                        else
                        {
                            //System.out.println("O won");
                            m=m+10000;
                            n=n+10000;
                        }
                    }
                }
                if((((int)c[j][i]-1)%2==1)||(((int)c[j][i])%2==1))
                {   
                    if((c[j][i]==c[j+1][i])&&(c[j+1][i]==c[j+2][i]))
                    {
                        win=true;
                        winner[j][i]=5;winner[j+1][i]=5;winner[j+2][i]=5;
                        //for(m=0;m<3;m++)
                        //   for(n=0;n<3;n++)
                        //     System.out.println("Winner is "+winner[m][n]+"// "+m+" "+n);
                        if(f%2==0)
                        {
                            //System.out.println("X won");
                            m=m+10000;
                            n=n+10000;
                        }
                        else
                        {
                            //System.out.println("O won");
                            m=m+10000;
                            n=n+10000;
                        }
                    }
                }
                if((((int)c[j][j]-1)%2==1)||(((int)c[j][j])%2==1))
                {
                    if((c[j][j]==c[j+1][j+1])&&(c[j+1][j+1]==c[j+2][j+2]))
                    {
                        win=true;
                        winner[j][j]=5;winner[j+1][j+1]=5;winner[j+2][j+2]=5;
                        //for(m=0;m<3;m++)
                        //  for(n=0;n<3;n++)
                        //    System.out.println("Winner is "+winner[m][n]+"// "+m+" "+n);
                        if(f%2==0)
                        {
                            //System.out.println("X won");
                            i=i+10000;
                            j=j+10000;
                            m=m+10000;
                            n=n+10000;
                            break;
                        }
                        else
                        {
                            //System.out.println("O won");
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
                        win=true;
                        winner[i][j+2]=5;winner[i+1][j+1]=5;winner[i+2][j]=5;
                        //for(m=0;m<3;m++)
                        //    for(n=0;n<3;n++)
                        //        System.out.println("Winner is "+winner[m][n]+"// "+m+" "+n);
                        if(f%2==0)
                        {
                            //System.out.println("X won");
                            i=i+10000;
                            j=j+10000;
                            m=m+10000;
                            m=n+10000;
                            break;
                        }
                        else
                        {
                            //System.out.println("O won");
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

    public static void initialize()
    {
        f=0;
        c=new char[5][5];
        z=new int[10];
        flag=false;win=false;
        winner=new int[5][5];
    }
}