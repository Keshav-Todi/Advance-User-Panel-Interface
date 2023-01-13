package Graphics;

public class dinasour
{
    static String s="";
    public static void dino()
    {
        int i=0,j=0,l=0;
        String s1="";
        char c=' ';
        char a[]=new char[100];
        int b[]=new int[100];
        for(i=0;i<100;i++)
            b[i]=0;
        System.out.println("filling obstacles array");
        while(j<=30)
        {
            System.out.println("no. of obstacles left to fill is "+j);
            l=(int)(Math.random()*100);
            System.out.println("l is "+l);
            if(l<=3)
            {    
                            System.out.println("l is less than 3 "+l);
                continue;
            }
            if(b[l-1]==5)
            {    
                            System.out.println("b[l-1] stores no. 5 , b[l-1] is "+b[l-1]);
                continue;
            }
            System.out.println("index of obstacles to fill is "+l);
            a[l]='5';
            b[l]=5;
            System.out.println("stored no. in a[l] is "+a[l]);
            ++j;
        }
        j=0;
        System.out.println("s ");
        while(j<100)
        {
            System.out.println("j is "+j);
            if(a[j]!='5')
            {
                System.out.println("a[j] is not '5' ");
                a[j]='0';
                System.out.println("So now a[j] is  "+a[j]);
            }
            ++j;
        }

        for(i=0;i<100;i++)
        {
            s=s+a[i];
            
            if(a[i]=='5')
                System.out.print("o");
            else
                System.out.print(" ");
        }
    }
}
