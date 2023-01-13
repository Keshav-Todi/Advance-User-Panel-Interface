package Google;
import java.util.*;
class evacuation
{
    static int in = 1;
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        int t=sc.nextInt();
        for(in=1;in<=t;in++)
        {
            //Scanner sc=new Scanner(System.in);
            int i=0,j=0,max=0,max2=0,diff=0,d=0,index=0,index2=0,c=0,N=0;
            System.out.print("");
            N=sc.nextInt();
            int a[]=new int[N];
            String dd[]=new String[N] ;
            for(i=0;i<N;i++)
                dd[i]=(char)(65+i)+"";
            System.out.print("");
            for(i=0;i<N;i++)
            {   
                System.out.print("");
                a[i]=sc.nextInt();
                System.out.print("");
            }  
            System.out.print("Case #"+in+": ");
            max=a[0];
            for(i=N-1;i>=0;i--)
            {
                if(a[i]>max)
                {
                    max=a[i];
                    index=i;
                }
            }
            //System.out.println("The max is "+max);
            diff=max;
            for(i=0;i<N;i++)
            {
                if(a[i]==max)
                    continue;
                d=max-a[i];
                if(d<diff)
                    diff=d;
            }
            max2=max-diff;
            //System.out.println("The max2 is "+max2);
            for(i=0;i<N;i++)
            {
                if(a[i]==max)
                    ++c;
            }
            //System.out.println("c is "+c);
            if(c<2)
            {
                //System.out.println("c less than 2 "+c);
                //System.out.println("index to be less is "+a[index]);
                while(a[index]>max2)
                {
                    //System.out.println("index to be less is "+a[index]);
                    if((a[index]-max2)%2==1)
                    {    
                        System.out.print(dd[index]+" ");
                        --a[index];
                    }    
                    else
                    {
                        System.out.print(dd[index]+dd[index]+" ");
                        a[index]-=2;
                    }
                }
                max=max2;
            }
            c=0;
            //System.out.println("Main step ");
            //System.out.println("The max is "+max);
            for(i=0;i<N;i++)
            {
                //System.out.println("i is "+i+" a[i] is "+a[i]);
                if(a[i]==max&&c<2)
                {
                    //System.out.println(" I am here ");
                    ++c;
                    index2=i;
                    //System.out.println("c is "+c+" index2 is "+index2);
                    continue;
                }
                else
                {
                    while(a[i]>0)
                    {
                        if(a[i]%2==1)
                        {    
                            System.out.print(dd[i]+" ");
                            --a[i];
                        }    
                        else
                        {
                            System.out.print(dd[i]+dd[i]+" ");
                            a[i]-=2;
                        }
                    }
                }
            }
            for(i=0;i<N;i++)
            {
                //System.out.println("a[i] is "+a[i]+" i is "+i);
                if(a[i]==max)
                {
                    //System.out.println("Cool");
                    while(a[i]>0)
                    {
                        //System.out.println("a[i] is "+a[i]+" a[index2] is "+a[index2]);
                        System.out.print(dd[i]+dd[index2]+" ");
                        --a[i];--a[index2];
                    }
                }
            }

            System.out.println();
        }
    }
}
/*
3
6
3
1
2
 */

    