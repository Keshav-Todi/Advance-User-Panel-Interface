import java.util.*;
public class transactions
{
    static int p=0;
    public static void transa(int amt)
    {
        old_user ob2=new old_user();
        new_user ob1=new new_user();
        cash ob =new cash();
        String s=" ";
        int n=0,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to pay through Cash");
        System.out.println("Enter 2 to pay through Card");
        System.out.println("Enter 3 to pay and use ATM");
        n=sc.nextInt();
        if(n==2)
        {   
            System.out.println("Sorry currently unavailable");
            System.out.println("Enter 1 to pay through Cash");
            System.out.println("Enter 3 to pay and use ATM");
            n=sc.nextInt();
        }
        if(n==1)
        {   
            ob.kash(amt);
        }
        else if(n==3)
        {
            k=ob2.gass();
            if(k<amt)

                System.out.println("Insufficient amount");
            else
            {
                System.out.println("Payment Proceeding");
                p=k-amt;
                System.out.println("Amount deducted "+p);
                s=ob1.pass(1);
                System.out.println("Your new Account number is "+s);
            }

        }
    }
}