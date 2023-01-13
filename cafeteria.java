import java.util.*;
public class cafeteria
{
    String bv[]={"Aloo Burger","Cheese Sandwich","Paneer Puff","Onion Roll","Cheese Popcorn","Fish Burger","Chicken Sandwich","Chicken Wings","French pork"};
    int amtv[]={79,99,69,89,49,129,149,199,299};
    int gani[]=new int[100];
    int ganit[]=new int[100];
    int k=0,th=0;
    public void cafet()
    {
        Scanner sc=new Scanner(System.in);
        Error ob=new Error();
        transactions ob1=new transactions();
        //Bill ob2=new Bill();
        boolean flag=false;
        String s="",s1="";
        int i=0,l=0,l1=0,sum=0,d=0,ant=0;
        
        l=5;
        l1=l+4;
        
        while(true)
        {
            System.out.println("Enter veg or non veg ,     enter ' No more ' to go out ");
            if(d==0)
                s=sc.nextLine();
            else
                s=ob.erorr();
            System.out.println(s);
            if(s.equals("No more"))
                break;
            if(s.equals("veg"))
                for(i=0;i<l;i++)
                    System.out.print(bv[i]+"\t worth Rs"+amtv[i]+"\n");
            else if(s.equals("non veg"))
                for(i=l;i<l1;i++)
                    System.out.print(bv[i]+"\t worth Rs"+amtv[i]+"\n");
            else
            {
                System.out.println("Enter valid category ");
                continue;
            }
            System.out.println("Enter what you want ");
            s1=ob.erorr();
            for(i=0;i<l1;i++)
            {   
                if(s1.equals(bv[i]))
                {
                    gani[k]=i;
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.println("Item not found enter again ");
                continue;
            }
            else
            {
                System.out.println( bv[gani[k]]+" confrmed ");
                System.out.println( "Amount is "+amtv[gani[k]]);
                System.out.println( "Enter Quantity ");
                ganit[k]=sc.nextInt();
                ant=amtv[gani[k]]*ganit[k];
                System.out.println( "Amount is "+ant);
                sum=sum+ant;
                System.out.println( "\nTotal Amount is "+sum);               
            }
            ++k;flag=false;d++;
        }

        System.out.println("Final order");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Item"+" \t "+"Quantity"+" \t "+"Amount in Rs");
        for(i=0;i<k;i++)
            System.out.println(bv[gani[i]]+" \t "+ganit[i]+" \t "+amtv[gani[i]]);
        System.out.println("\nTotal amount "+sum);
        ob1.transa(sum);
        System.out.println("\nEnter 1 for take away ");
        System.out.println("\nEnter 2 for home delivery ");
        th=sc.nextInt();
        //ob2.bil();
    }
}

