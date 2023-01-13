import java.util.*;

class chg_Array
{  
    String a1[];
    int n;
    public void insert(String a[],int pos,String data)
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
        System.out.println("\ndata is "+data+ "\n");
        a[pos]=data;
         System.out.println("\na[pos] is "+a[pos]+ "\n");
        a1=new String[n];
        for(i=0;i<n;i++) 
        {
            a1[i]=a[i];
        }
        System.out.println("\nChange new array we get is\n");
        for(i=0;i<n;i++) 
        {
            System.out.println("a1["+i+"] = "+a1[i]);
        }
    }
}