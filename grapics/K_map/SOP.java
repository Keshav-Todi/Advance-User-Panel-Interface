package K_map;
import java.util.*;
class SOP
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Binary ob=new Binary();
        int i=0,j=0,l=0;
        String s="",b="";
        char c=' ';
        char ch[][]={{'D','E','F'},{'A','B','C'}};
        System.out.println("Enter length");
        l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter numbers");
        for(i=0;i<l;i++)
        a[i]=sc.nextInt();
        for(i=0;i<l;i++)
        {
             System.out.println("number is "+a[i]);
            b=ob.Binary(a[i]);
             System.out.println("Binary of it is "+b);
            for(j=0;j<3;j++)
            {
                 System.out.println("j is "+j+" till less 3");
                c=b.charAt(j);
                 System.out.println("char of j "+ j +" index is "+c);
                 System.out.println("c for complementary is "+ c);
                  System.out.println("j for ABc is "+ j);
                System.out.println("ch[c][j] is "+ ch[c][j]);
                  s=s+ch[c][j];
                    System.out.println("String is "+ s);
            }
            s=s+'+';
        }
        System.out.println("SOP = "+s);
    }
}
    