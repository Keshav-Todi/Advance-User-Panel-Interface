package Array;
import java.util.*;
public class Calender
{
    public static String s="";
    public static void day(int y,int m,int d)
    {
        Scanner sc = new Scanner(System.in);
        int i=0,y2=0;
        //String s="";
        while(true)
        {
            //System.out.println("Enter year");
            //y=sc.nextInt();
            if(y<2000||y>2100)
            {
                System.out.println("Enter a valid year between 2000 to 2100");
                continue;
            }
            else 
                break;
        }
        while(true)
        {
            //System.out.println("Enter month");
            //m=sc.nextInt();m--;
            if(m<0||m>11)
            {
                System.out.println("Enter a valid month between 1 to 12");
                continue;
            }
            else 
                break;
        }
        while(true)
        {
            //System.out.println("Enter date");
            //d=sc.nextInt();
            if(d<1||d>31)
            {
                System.out.println("Enter a valid year between 2000 to 2100");
                continue;
            }
            else 
                break;
        }
        //char y1[]=new char[100];
        --m;
        char y1[]={'A','B','C','K','F','G','A','I','D','E','F','N','B','C','D','L','G','A','B','J','E','F','G','H','C','D','E','M','A','B','C','K','F','G','A','I','D','E','F','N','B','C','D','L','G','A','B','J','E','F','G','H','C','D','E','M','A','B','C','K','F','G','A','I','D','E','F','N','B','C','D','L','G','A','B','J','E','F','G','H','C','D','E','M','A','B','C','K','F','G','A','I','D','E','F','N','B','C','D','E'}; 
        i=y-2000;
        --i;
        /*
        while(i>28)
        {
        i=i-28;
        }
        /*/
         System.out.println("Letter is "+y1[i]);
        int m1[]={1,4,4,7,2,5,7,3,6,1,4,6};
        int m2[]={2,5,5,1,3,6,1,4,7,2,5,7};
        int m3[]={3,6,6,2,4,7,2,5,1,3,6,1};
        int m4[]={4,7,7,3,5,1,3,6,2,4,7,2};
        int m5[]={5,1,1,4,6,2,4,7,3,5,1,3};
        int m6[]={6,2,2,5,7,3,5,1,4,6,2,4};
        int m7[]={7,3,3,6,1,4,6,2,5,7,3,5};
        int m8[]={1,4,5,1,3,5,1,4,7,2,5,7};
        int m9[]={2,5,6,2,4,6,2,5,1,3,6,1};
        int m10[]={3,6,7,3,5,1,3,6,2,4,7,2};
        int m11[]={4,7,1,4,6,2,4,7,3,5,1,3};
        int m12[]={5,1,2,5,7,3,1,5,4,6,2,4};
        int m13[]={6,2,3,6,1,4,6,2,5,7,3,5};
        int m14[]={7,3,4,7,2,5,7,3,6,1,4,6};
        int m15[][]={{1,4,4,7,2,5,7,3,6,1,4,6},{2,5,5,1,3,6,1,4,7,2,5,7},{3,6,6,2,4,7,2,5,1,3,6,1},{4,7,7,3,5,1,3,6,2,4,7,2},{5,1,1,4,6,2,4,7,3,5,1,3},{6,2,2,5,7,3,5,1,4,6,2,4},{7,3,3,6,1,4,6,2,5,7,3,5},{1,4,5,1,3,5,1,4,7,2,5,7},{2,5,6,2,4,6,2,5,1,3,6,1},{3,6,7,3,5,1,3,6,2,4,7,2},{4,7,1,4,6,2,4,7,3,5,1,3},{5,1,2,5,7,3,1,5,4,6,2,4},{6,2,3,6,1,4,6,2,5,7,3,5},{7,3,4,7,2,5,7,3,6,1,4,6}};
        y2=(int)y1[i]-65;
         System.out.println("y2[] is "+y2);
         System.out.println("Array is ");
         for(int jk=0;jk<12;jk++)
          System.out.println(m15[y2][jk]);
         int d1=m15[y2][m];
         System.out.println("d1 is "+d1);
        --d1;
        
        while(d>7)
        {
            d=d-7;
        }
        d=d+d1;
        while(d>7)
        {
            d=d-7;
        }
        if(d==1){
            s="Monday";
            System.out.println("Monday");}
        if(d==2){
             s="Tuesday";
            System.out.println("Tuesday");}
        if(d==3){
             s="Wednesday";
            System.out.println("Wednesday");}
        if(d==4){
             s="Thursday";
            System.out.println("Thursday");}
        if(d==5){
             s="Friday";
            System.out.println("Friday");}
        if(d==6){
             s="Saturday";
            System.out.println("Saturday");}
        if(d==7){
             s="Sunday";
            System.out.println("Sunday");}
    }
}