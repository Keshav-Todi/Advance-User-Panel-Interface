import java.util.*;
class word_need
{
    String a[]=new String[100];
    int k=0;
    void proper (String s)
    {
        Scanner sc=new Scanner(System.in);
        int i=0,l=0,j=0;
        k=0;
        char c=' ';
        String s1="";

        //System.out.println("spacing operation , i have recieved "+s);
        // s=sc.nextLine();
        //System.out.println("No. of the word");
        //j=sc.nextInt();
        //j--;
        l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c==' ')
            {
                
                a[k++]=s1;
                //System.out.println("s1 is "+s1+" k is "+k );
                s1="";
            }
            else if(i==(l-1))
            {
                s1=s1+c;
                //System.out.println(s1);
                a[k++]=s1;//System.out.println("s1 is "+s1+" k is "+k );
                s1="";
            }
            if(c!=' ')
                s1=s1+c;
        }
        //for(i=0;i<k;i++)
        //System.out.println("Array -"+a[i]);
        //System.out.println("\n\n Your Word is "+a[j]);
    }

    public static void spaces(String s)
    {
        //String s="aadyaFemale16HDFC BANK10000000";
        CalPlay in=new CalPlay();
        String s1="";
        String args[]=new String[100]; {

            int i=0,l=0,j=0;
            char c=' ',c1=' ';
            l=s.length();
            for(i=0;i<l;i++)
            {
                c=s.charAt(i);
                //System.out.println("Lets start");
                if(i!=0)
                {
                    c1=s.charAt(i-1);
                    if((c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')&&
                    (c1!='1'&&c1!='2'&&c1!='3'&&c1!='4'&&c1!='5'&&c1!='6'&&c1!='7'&&c1!='8'&&c1!='9'&&c1!='0'))
                    {
                        args[j++]=s1;
                        s1="";
                    }
                }
                if(i!=0)
                {
                    c1=s.charAt(i-1);
                    if((Character.isUpperCase(c))&&(Character.isUpperCase(c1)!=true&&c1!=' '))
                    {
                        args[j++]=s1;
                        s1="";
                    }
                }
                if(i==(l-1))
                {
                    s1=s1+c;
                    args[j++]=s1;
                    s1="";
                }
                s1=s1+c;
            }
            System.out.print("\n                                                                          ");
            //in.formai();
            System.out.println();
            System.out.print("                                                                          ");
            //in.formal();
            System.out.println("\n");
            System.out.println("Name \t:-\t "+args[0]);
            
            if(j==6)
            {
                System.out.println("Gender \t:-\t "+args[2]);
                System.out.println("Age \t:-\t "+args[3]);
                System.out.println("lucky number \t:-\t "+args[1]);
                System.out.println("Bank \t:-\t "+args[4]);
                System.out.println("Amount \t:-\t "+args[5]);
            }
            else
            {
                System.out.println("Gender \t:-\t "+args[1]);
                System.out.println("Bank \t:-\t "+args[2]);
                System.out.println("Amount \t:-\t "+args[3]);
            }
        }    
    }
}

 