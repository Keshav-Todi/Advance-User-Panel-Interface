import java.util.*;
class Encoder
{
    public static String enco(String s)
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter String");
        //String s=sc.nextLine();
        int i=0,j=0,k=2;
        char c=' ';
        String p="";
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            j=(int)c;
            j=j+k;
            if(j<65)
            { j=j+26;}

            if(j>95&&j<97)
            {j=j-26;}
            else if(j<97)
                j=j+26;
            if(j>122)
            {j=j-26;}
            c=(char)j;
            p=p+c;
            k=k*(-1);
        }
        if(p.length()>3)
            p=p.substring(0,3);

        return p;
        //System.out.println(p);
    }

    public static String encoding(String s)
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter String");
        //String s=sc.nextLine();
        int i=0,j=0,k=(int)(Math.random()*9)+1;
        s=Integer.toString(k)+s;
        char c=' ';
        String p="";
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            j=(int)c;
            j=j+k;
            if(j<65)
            { j=j+26;}

            if(j>95&&j<97)
            {j=j-26;}
            else if(j<97)
                j=j+26;
            if(j>122)
            {j=j-26;}
            c=(char)j;
            p=p+c;
            k=k*(-1);
        }
        //if(p.length()>3)
        //p=p.substring(0,3);

        return p;
        //System.out.println(p);
    }

    public static String[] decoding(String s1)
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter String");
        //String s=sc.nextLine();
        int k[]={1,2,3,4,5,6,7,8,9,10};
        String ss[]=new String[100];
        int i=0,j=0,n=0;
        char c=' ';
        String p="",s="";
        for(n=0;n<10;n++)
        {
            s=Integer.toString(k[n])+s1;
            for(i=0;i<s.length();i++)
            {
                c=s.charAt(i);
                j=(int)c;
                j=j+k[n];
                if(j<65)
                { j=j+26;}

                if(j>95&&j<97)
                {j=j-26;}
                else if(j<97)
                    j=j+26;
                if(j>122)
                {j=j-26;}
                c=(char)j;
                p=p+c;
                k[n]=k[n]*(-1);
            }
            ss[n]=p;
            p="";
        }
        //if(p.length()>3)
        //p=p.substring(0,3);
        return ss;
    }   

    //System.out.println(p);
}
