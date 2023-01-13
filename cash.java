import java.util.*;
public class cash
{
    public static void kash(int amt)
    {
        Scanner sc=new Scanner(System.in);
        denomination ob=new denomination();
        int i=0,j=0,copy=0,notes=0,change=0,k=0,totalNotes=0;
        boolean flag=false;
        int den[]={2000,500,100,50,20,10,5,2,1};
        int use[]=new int[100];
        int used[]=new int[100];
        copy=amt;
        System.out.println("Amont to be paid is "+amt+"\n");
        while(copy>0)
        {
            System.out.println("Enter no. of "+den[i]+" notes");
            notes=sc.nextInt();
            if(notes!=0)
            {
                use[k]=i;
                used[k]=notes;
                k++;
                totalNotes+=notes;
            }
            copy=copy-notes*den[i++];
            if(copy<0)
            { 
                flag=true;
                System.out.println("Amount done");
                break;
            }
            else
                System.out.println("Rs "+copy+" more needed ");
            if(i>=9)
            {
                i=0;
                System.out.println("Insufficient amount , not balanced transaction incomplete");
            }
        }
        for(i=0;i<k;i++)
            System.out.println(den[use[i]]+"\tx\t"+used[i]+"\t= "+den[use[i]]*used[i]);
        System.out.println("--------------------------------");
        System.out.println("TOTAL\t\t\t= "+amt); 
        System.out.println("--------------------------------");
        System.out.println("Total Number of Notes\t= "+totalNotes);
        if(flag==true)
        {
            System.out.println("\n\n\n");
            change=0-copy;
            System.out.println("Rs "+change+" given as change ");
            ob.deno(change);
            System.out.println("Transaction successful");
        }
    }
}