 import java.util.*;
class display_dt extends Gt_dt
{
    String p[]=new String[100];
    String na[]=new String[100];
    String nap[][]=new String[100][100];
    void display(String cand)
    {
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of Candidate ");
        String cand=sc.nextLine();
         */
        detail(cand);

        if(flag==true)
        {
            System.out.println("Candidate Details : ");
            System.out.println("\n----------------------------------------------------------------------\n\n");
            System.out.println("\nName - "+name);
            System.out.println("\nCandidate id - "+cn_id);
            System.out.println("\nAge - "+age);
            System.out.println("\nBlood group - "+bld_grp);
            System.out.println("\nGaurdian Name - "+gaurdian);

            if (status.equals("SCHOOLING"))
                System.out.print("\nClass : "+c);
            else if(status.equals("COLLEGE"))
                System.out.print("\nYear : "+c);
            else if(status.equals("GRADUATED"))
                System.out.print("\n"+c+" Year after being ");

            System.out.println(" ,  "+status);
            System.out.println("\nDate of Birth - "+dob);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }

    void parent()
    {
        int i=0,k=0,j=0,count=1;
        /*
        String p[]=new String[100];
        String na[]=new String[100];
        String nap[][]=new String[100][100];
         */
        detail("");
        for(i=0,k=0;i<n;i=i+4,k++)
        {
            na[k]=a[i];
            i=i+4;
            p[k]=a[i];
        }
        for(i=0;i<k;i++)
        {
            for(j=0;j<k;j++)
            {
                System.out.println("p[i] is "+p[i]);
                System.out.println("p[j] is "+p[j]);
                if(p[i].equals(p[j]))
                {
                    System.out.println("Equal ");
                    nap[i][0]=p[i];
                    nap[i][count++]=na[j];
                }
            }
            count=1;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void age()
    {
        int i=0,k=0,j=0,count=1;

        String ag[]=new String[100];
        String nam[]=new String[100];
        String nam_ag[][]=new String[100][100];

        detail("");
        for(i=0,k=0;i<n;i=i+6,k++)
        {
            nam[k]=a[i];
            i=i+2;
            ag[k]=a[i];
        }
        for(i=0;i<k;i++)
        {
            for(j=0;j<k;j++)
            {
                System.out.println("ag[i] is "+ag[i]);
                System.out.println("ag[j] is "+ag[j]);
                if(ag[i].equals(ag[j]))
                {
                    System.out.println("Equal ");
                    nam_ag[i][0]=ag[i];
                    nam_ag[i][count++]=nam[j];
                }
            }
            count=1;
        } 
    }

    void clas()
    {
        int i=0,k=0,j=0,count=1;
        /*
        String p[]=new String[100];
        String na[]=new String[100];
        String nap[][]=new String[100][100];
         */
        detail("");
        for(i=0,k=0;i<n;i=i+2,k++)
        {
            na[k]=a[i];
            i=i+6;
            p[k]=a[i];
        }
        for(i=0;i<k;i++)
        {
            for(j=0;j<k;j++)
            {
                System.out.println("p[i] is "+p[i]);
                System.out.println("p[j] is "+p[j]);
                if(p[i].equals(p[j]))
                {
                    System.out.println("Equal ");
                    nap[i][0]=p[i];
                    nap[i][count++]=na[j];
                }
            }
            count=1;
        }
    }

    String[] remove(String arr[])
    {
        int i=0,j=0,l=0;
        l=arr.length;
        for(i=0;i<l;i++)
        {
            for(j=i;j<l;j++)
            {
                //if(arr[i].equals(arr[j]))
                //f
            }
        }
        return arr;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void shown()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of Candidate ");
        String cand=sc.nextLine();

        Graphical_show ob1=new  Graphical_show ();
        ob1.graphi(cand);

        display_dt ob=new display_dt();
        ob.display(cand);
    }
}