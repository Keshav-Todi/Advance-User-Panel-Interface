import java.util.*;
class Bill
{
    public static void bil()
    {
        Scanner sc=new Scanner(System.in);
        cafeteria ob2=new cafeteria();
        ob2.cafet();
        CalPlay ob1=new CalPlay();
        ob1.formai();
        ob1.formal();
        int gani[]=new int[100];
        int k=0,i=0,s1=0,m1=0,h1=0,th=0;
        //char
        double sum=0.0,dis=1.0,CGST=0.9;
        String d="",s="",m="",h="";
        d=ob1.s1;
        
        s1=ob1.n1;
        m1=ob1.i1;
        h1=ob1.h1;
        //System.out.println("s1 m1 h1 in int "+s1+":"+m1+":"+h1+"\n\n" );
        s=Integer.toString(s1);
        m=Integer.toString(m1);
        h=Integer.toString(h1);
        s=h+":"+m;
        th=ob2.th;
        k=ob2.k;
        for(i=0;i<k;i++)
            gani[i]=ob2.gani[i];
        //♥
        System.out.println("\t\t\t\t\t\t\t   Yellow Chilli♥\n");
        System.out.println("\t\t\t\t\t\t\t   Veg Resturant");
        System.out.println("\t\t\t\t\t\t\t   Amway BLDG");
        System.out.println("\t\t\t\t\t\t\t   339 Canal Street");
        System.out.println("\t\t\t\t\t\t\t   Lake Town , Kolkata 700048");
        System.out.println("\t\t\t\t\t\t\t   Ph: 23867544 ,23827326");
        System.out.println("\t\t\t\t----------------------------TAX INVOICE-------------------------------------------");
        System.out.print("\t\t\t\tDate: "+d+"              ");
        System.out.println("Bill No.: 3/T/3");
        System.out.println("\t\t\t\tPBoy: COUNTER");
        System.out.println("\t\t\t\t-----------------------------------------------------------------------------------");
        System.out.print("\t\t\t\tParticulars\t\t\t\t");
        System.out.print("Qty\t");
        System.out.print("Rate\t");
        System.out.println("Amount ");
        System.out.println("\t\t\t\t-----------------------------------------------------------------------------------");
        for(i=0;i<k;i++)
        {
            sum=sum+(ob2.ganit[i]*ob2.amtv[gani[i]]);
            System.out.println("\t\t\t\t"+ob2.bv[gani[i]]+"\t\t\t\t"+ob2.ganit[i]+"\t"+ob2.amtv[gani[i]]+"\t"+(ob2.ganit[i]*ob2.amtv[gani[i]])+"");
        }
        System.out.println("\t\t\t\t\t\t\t\t\t-------------------------------------------");
        System.out.println("\t\t\t\t\t\t\tSub Total :\t\t\t"+sum);dis=dis/100.0*sum;dis=Math.round(dis);
        System.out.println("\t\t\t\t\t\t\tDis% :\t\t\t\t"+dis);
        System.out.println("\t\t\t\t\t\t\t\t\t-------------------------------------------");sum=sum-dis;
        System.out.println("\t\t\t\t\t\t\tNet Total :\t\t\t"+sum);CGST=0.9/100.0*sum;
        System.out.println("\t\t\t\t\t\t\tCGST @9% :\t\t\t"+CGST);
        System.out.println("\t\t\t\t\t\t\tSGST @9% :\t\t\t"+CGST);
        System.out.println("\t\t\t\t-----------------------------------------------------------------------------------");
        System.out.print("\t\t\t\t1/1\t\t\t");sum=sum+CGST+CGST;
        System.out.println("Grand Total :\t\t\t"+sum);
        System.out.println("\t\t\t\t-----------------------------------------------------------------------------------");
        System.out.println("\t\t\t\tGST NO  27AADFH5037M1Z6\t\t\t\t\t("+s+" AM)");
        System.out.println("\t\t\t\tE.&O.E.\t\tThank You\t\t\tVisit Again");
        if(th==2)
        System.out.println("\n\t\t\t\tHome Delivery");
        else
        System.out.println("\n\t\t\t\tTake Away");
    }
}