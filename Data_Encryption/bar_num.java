package Data_Encryption;
import java.util.*;
public class bar_num
{
    public String s9="";
    public  String bn(String s)
    {

        sampbar obb=new sampbar();
        s=obb.sb(s);
        num_text ob=new num_text();
        Scanner sc=new Scanner(System.in);
        //String s="? ?  ? |  | |?  | ?|  |?  ? |  ? ?  ||  | |?  ||  | ?|  | |",

        //String s=sc.nextLine();
        int i=0,j=0,l=0,m=0;
        char c=' ',c1=' ',c2=' ';
        boolean flag=false;
        String s1="",s2="",copy="";

        String a[]={"||","?|","|?","??","| |","? |","| ?","? ?","| |?","| ?|"};
        l=s.length();
        //System.out.println("barcode is "+s);
        //System.out.println("old l is "+l);
        try 
        {
            while(true)
            {
                l=s.length();
                c=s.charAt(l-1);
                if(c==' ')
                {
                    --l;
                    s=s.substring(0,l);

                }
                else
                    break;
            }
            //System.out.println("at last is "+s);
            //System.out.println("new l is "+l);
            copy=s;
            i=0;
            while(true)
            {
                l=s.length();
                i=0;
                c=s.charAt(i);
                if(c==' ')
                {
                    ++i;
                    s=s.substring(i,l);
                }
                else
                    break;
            }
            //System.out.println("at last is "+s);
            copy=s;
            for(i=0;i<l;i++)
            {
                if(i==(l-1))
                    break;
                j=0;
                //System.out.println("I have enterd loop i is "+i+" l is "+l);
                c=s.charAt(i);
                //System.out.println(" character is "+c);
                if(c==' ')
                {
                    //System.out.println(" first space confirmed "+c);
                    c1=s.charAt(i+1);
                    //System.out.println(" c1 is "+c1);
                    if(c1==' ')
                    {
                        //System.out.println(" total space confirmed , word is "+s1);
                        flag=true;
                        while(true)
                        {
                            //System.out.println(" Enterd while loop "+j);
                            //System.out.println(" word is "+s1+" checking for "+a[j]);
                            //System.out.println(" test s1 a"+s1+"a"+" a[j] a"+a[j]+"a");
                            if(s1.equals(a[j]))   
                            {
                                //System.out.println("confirmed match ");
                                //System.out.print(j);
                                s2=s2+j;
                                s1="";
                                break;
                            }
                            ++j;
                        }
                    }
                }
                if(i==(l-1))
                {
                    s1=s1+c;
                    while(true)
                    {
                        //System.out.println("1 Enterd while loop "+j);
                        //System.out.println("1 word is "+s1+" checking for "+a[j]);
                        //System.out.println(" 1test s1 a"+s1+"a"+" a[j] a"+a[j]+"a");
                        if(s1.equals(a[j]))   
                        {
                            //System.out.println("confirmed match ");
                            //System.out.print(j);
                            s2=s2+j;
                            s1="";
                            break;
                        }
                        ++j;
                    }
                }
                if(c==' ')
                {
                    c1=s.charAt(i+1);
                    c2=s.charAt(i-1);
                    if(c1!=' '&&c2!=' ')
                        s1=s1+c;
                }
                else 
                    s1=s1+c;

                flag=false;
            }

            s1=s1+s.charAt(l-1);
            int z=copy.lastIndexOf(' ');
            c1=s.charAt(z-1);
            if(c1!=' ')
                z=z-2;
            //System.out.println("copy is "+copy);
            //System.out.println(" kinal s for checking is "+s);
            s1=s.substring(i,l);
            //System.out.println(" final s1 for checking is "+s1);
            c1=s.charAt(l-1);
            //System.out.println(" last index of c1 is "+c1);
            int ll=copy.length();
            s1=copy.substring(z-1,ll);
            //System.out.println(" s1 from copy is  "+s1);
            i=0;
            while(true)
            {
                l=s1.length();
                i=0;
                c=s1.charAt(i);
                if(c==' ')
                {
                    ++i;
                    s1=s1.substring(i,l);
                }
                else
                    break;
            }
            while(true)
            {
                //System.out.println(" Enterd while loop "+j);
                //System.out.println(" word is "+s1+" checking for "+a[j]);
                //System.out.println(" test s1 a"+s1+"a"+" a[j] a"+a[j]+"a");
                if(s1.equals(a[j]))   
                {
                    //System.out.println("confirmed match ");
                    //System.out.print(j);
                    s2=s2+j;
                    s1="";
                    break;
                }
                ++j;
            }

            //System.out.println("\ns1 is "+s1);
            //System.out.println("num is "+s2);
            s9=ob.nt(s2);

        }
        catch(StringIndexOutOfBoundsException e1)
        {
            //System.out.println("Not found or invalid");
        }
        catch(ArrayIndexOutOfBoundsException e2)
        {
            //System.out.print("Not found or invalid");
        }
        return s9;
    }
}

