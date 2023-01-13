
import Data_Encryption.*;
import java.io.*;
import java.util.*;
public class change_file
{
    public static void nikal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name the file you want to change data");
        String naam=sc.nextLine();
        file_output ob=new file_output();
        ob.output(naam,2);
        System.out.println("\n----------------------------------------------------------------\n");
        int n1=0,i=0;
        String a1[]=new String[300];
        n1=ob.n;
        System.out.println("Storage of array "+n1);
        for(i=0;i<n1;i++)
        {
            a1[i]=ob.a[i];
            System.out.println(i+" - "+a1[i]);
        }
        int n2=0;
        String a2[]=new String[300];
        System.out.println("Enter 1 to remove data , 2 to change data, 3 to insert data");
        int j=sc.nextInt();
        if(j==1)
        {
            del_Array ob1=new del_Array();
            System.out.println("Tell lower and upper portion  including to be removed");
            int p=sc.nextInt();
            int q=sc.nextInt();
            ob1.dele(a1,p,q);

            n2=ob1.n;
            for(i=0;i<n2;i++)
            {
                a2[i]=ob1.a1[i];
            }
        }
        else if(j==2)
        {
            chg_Array ob5=new chg_Array();
            System.out.println("Tell position and data to be changed");
            int p=sc.nextInt();
            System.out.println("");
            String d=sc.nextLine();
            ob5.insert(a1,p,d);

            n2=ob5.n;
            for(i=0;i<n2;i++)
            {
                a2[i]=ob5.a1[i];
            }
        }
        else if(j==3)
        {
            ins_Array ob7=new ins_Array();
            System.out.println("Tell position and data to be inserted");
            int p=sc.nextInt();
             System.out.println("hgffjf");accept_str ob99=new accept_str();
            String d=ob99.accept();
            ob7.ins(a1,p,d);

            n2=ob7.n;
            for(i=0;i<n2;i++)
            {
                a2[i]=ob7.a1[i];
            }
        }
        else
        System.exit(0);
        file_input obb=new file_input();

        clr_file ob2=new clr_file();
        ob2.empty(naam);
        for(i=0;i<n2;i++)
            obb.input(a2[i],naam,5);
        System.out.println("\nFinal array is\n");
        for(i=0;i<n2;i++) 
        {
            System.out.println("a2["+i+"] = "+a2[i]);
        }
    }
}