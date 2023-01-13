package Array;
import java.util.*;
public class Hangman
{
    public static void hangi()
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,l=0,k=65,index=0,f=0;
        char c=' ',p=' ';
        String g=" \\";
        String h="/";
        boolean flag=false,slag=false;
        String s="";
        l=s.length();
        String args[]=new String[11];
        args[0]="RAMAYA VASTAVAYA";args[1]="JAYANTA BHAI KI LOVE STORY";args[2]="YEH JAWAANI HAI DEEWANI";args[3]="ZINDAGI NA MILEGI DOBARA";
        args[4]="OM SHANTI OM";args[5]="TARE ZAMEEN PAR";args[6]="RANG DE BASANTI";args[7]="KUCH KUCH HOTA HAI";args[8]="DILWALE DHULANIYA LE JAYENGE";
        args[9]="ANDAZ APNA APNA";args[10]="JAB WE MET";
        int n=(int)(Math.random()*10);
        //System.out.println("N IS "+n);
        s=args[n];
        l=s.length();
        char a[]=new char[l];
        char d[]=new char[l];
        //System.out.println("s is "+s+" l is "+l);
        //System.out.println("\nChoose valid letters from here");
        for(i=0;i<6;i++)
        {
            for(j=0;j<5;j++)
            {

                System.out.print((char)k+" ");
                if(i==5&&j==0)
                    break;

                if(j==4)
                {
                    System.out.println();
                }
                k++;
            }
        }
        System.out.println("\n\n\n");
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c==' ')
            {
                System.out.print(c+" ");
                d[i]=c;
            }
            else
                System.out.print("_ ");
            a[i]=c;
        }
        System.out.print("\n");
        while(true)
        {
            for(i=0;i<l;i++)
            {   
                if(((((int)d[i]-1)%2==1)||(((int)d[i])%2==1)))
                    slag=true;
                else
                {
                    slag=false;
                    break;
                }
            }
            if(slag==true)
                break;

            p=sc.next().charAt(0);
            System.out.print("\n");
            for(i=0;i<l;i++)
            {
                c=s.charAt(i);
                if((c==p)&&((((int)d[i]-1)%2!=1)&&(((int)d[i])%2!=1)))
                {
                    flag=true;
                    d[i]=p;
                    index=i;
                    break;
                }
                else
                    flag=false;
            }
            if(flag==true)
            {   
                while(index<l)
                {   
                    c=a[index];
                    if(c==p)
                        d[index]=p;
                    ++index;
                }
                for(i=0;i<l;i++)
                {   
                    if(((((int)d[i]-1)%2==1)||(((int)d[i])%2==1)))
                        System.out.print(d[i]+" ");
                    else
                    {
                        if(a[i]==' ')    
                            System.out.print(" ");
                        else  
                            System.out.print("_ ");
                    }
                }
                System.out.print("\n \n");
            }
            else
            {
                ++f;
                System.out.print("\n\n");
                if(f==1)
                {
                    System.out.println("▄▄▄▄");
                    System.out.println("|  |");
                    System.out.println("|   ");
                    System.out.println("▄▄▄▄");
                }
                if(f==2)
                {
                    System.out.println("▄▄▄▄");
                    System.out.println("|  |");                 
                    System.out.println("|  ☺");
                    System.out.println("|   ");
                    System.out.println("▄▄▄▄");
                }
                if(f==3)
                {
                    System.out.println("▄▄▄▄");
                    System.out.println("|  |");
                    System.out.println("|  ☺");
                    System.out.println("|  |");
                    System.out.println("|   ");
                    System.out.println("▄▄▄▄");
                }
                if(f==4)
                {
                    System.out.println("▄▄▄▄");
                    System.out.println("|  |");
                    System.out.println("|  ☺");
                    System.out.println("|"+g+"| ");
                    System.out.println("|  |");
                    System.out.println("|   ");
                    System.out.println("▄▄▄▄");
                }
                if(f==5)
                {
                    System.out.println("▄▄▄▄");
                    System.out.println("|  |");
                    System.out.println("|  ☺");
                    System.out.println("|"+g+"|"+h);
                    System.out.println("|  |");
                    System.out.println("|   ");
                    System.out.println("▄▄▄▄");
                }
                if(f==6)
                {
                    System.out.println("▄▄▄▄");
                    System.out.println("|  |");
                    System.out.println("|  ☺");
                    System.out.println("|"+g+"|"+h);
                    System.out.println("|  |");
                    System.out.println("| "+h+"|");
                    System.out.println("|   ");
                    System.out.println("▄▄▄▄");
                }
                if(f==7)
                {
                    System.out.println("▄▄▄▄");
                    System.out.println("|  |");
                    System.out.println("|  ☺");
                    System.out.println("|"+g+"|"+h);
                    System.out.println("|  |");
                    System.out.println("| "+h+"|\\");
                    System.out.println("|   ");
                    System.out.println("▄▄▄▄");
                }
                if(f==8)
                {
                    System.out.println("HANGMAN!!!!!!!!");
                    System.out.println("▄▄▄▄");
                    System.out.println("|  |");
                    System.out.println("|  ☺");
                    System.out.println("|"+g+"|"+h);
                    System.out.println("|  |");
                    System.out.println("| "+h+"|\\");
                    System.out.println("|   ");
                    System.out.println("▄▄▄▄");
                    break;
                }
            }
        }
        if(f<8)
            System.out.println("\nCongrats you Won !!!");
        else
            {
                System.out.println("\nMovie was  :- "+s);
                System.out.println("\nBetter Try next Time");
            }
    }
}