import java.util.*;

class del_Array
{  
    String a1[];
    int n;
    public void dele(String a[],int pos,int till)
    {
        Scanner sc = new Scanner(System.in);
        
        int i;
        n=a.length;
        
        /*
        System.out.println("Enter the number of elements:") ;
        int[] a = new int[n];

        System.out.println("Enter the elements") ;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the position of the number which is to be deleted");
        pos = sc.nextInt();
        */
        System.out.println("\nInitial array\n");
        for(i=0;i<n;i++) 
        {
            System.out.println("a["+i+"] = "+a[i]);
        }
        for(int j=0;j<=(till-pos);j++)
        for(i=pos;i<n-1;i++)
        {
            a[i]=a[i+1];
        }
        for(int j=0;j<=(till-pos);j++)
        n=n-1;
        a1=new String[n];
        for(i=0;i<n;i++) 
        {
            a1[i]=a[i];
        }
        System.out.println("\nOn deleting new array we get is\n");
        for(i=0;i<n;i++) 
        {
            System.out.println("a1["+i+"] = "+a1[i]);
        }
    }
}