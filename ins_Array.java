import java.util.*;

class ins_Array
{  
    String a1[];
    int n;
    public void ins(String a[],int pos,String x)
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
        a1=new String[n+1];
        for(i = n-1; i >= (pos); i--)
        {

            //System.out.println("pos is "+pos);
            //System.out.println("Putting a[i] "+a[i]+" in a1[i+1] "+" i is "+i);
            a1[i+1] = a[i];
            //System.out.println("a1[i+1] = "+a1[i+1]);
        }
        a1[pos] = x;
        
        //System.out.println("a1[pos] is "+a1[pos]+" pos is "+pos);
        for(i=0;i<pos;i++) 
        {
            a1[i]=a[i];
            //System.out.println("Putting a[i] "+a[i]+" in a1[i] "+" i is "+i+" till pos "+pos);
        }
        System.out.println("\nOn deleting new array we get is\n");
        for(i=0;i<n+1;i++) 
        {
            System.out.println("a1["+i+"] = "+a1[i]);
        }
    }
}