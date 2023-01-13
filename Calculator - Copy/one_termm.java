package Calculator;
//package Calculator;
import java.util.*;
public class one_termm
{
    public static void ot()
    {
        Scanner sc=new Scanner(System.in);
        Calculator ob=new Calculator();
        try
        {
            //while(true)
            //{

                int i=0,j=0,r=0,index=0,z=0,n=0,y=0,l=0,l1=0,d=0;
                double a1=0.0,a2=0.0;
                int k=0;
                String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s9="";
                char c1=' ',c=' ',c2=' ',c3=' ';            
                System.out.println("Enter String");
                String s=sc.nextLine();
                //if(s.equals("5"))
                  //  break;            
                l=s.length();
                //s4=Double.toString(k);
                //     s=s.substring(0,j+1)+s4+s.substring(
                i=s.indexOf('=');  
                s1=s.substring(0,i);
                s2=s.substring(i+1,l);
                for(j=0;j<i;j++)
                {
                    c=s1.charAt(j);
                    if(c=='x')
                        index=j;
                }
                s3=s1.substring(0,index);
                s4=s1.substring(index+1,i);

                int indu=0,endu=0;
                //////////////////////////////////////////////////////////////////////////////////////
                for(j=index-1;j>=0;j--)

                {
                    //2 main part
                    //if(j!=0)
                    //c3=s.charAt(j-1); 
                    c=s.charAt(j);
                    if(d==1)
                    {
                        s5=s5+c;
                        k++;
                    }
                    if((c=='+')||(c=='-'))
                    {
                        if(d==0)
                        {
                            c1=c;
                            indu=j+1;
                        }

                        d=1;
                    }

                }
                //System.out.println("indu is "+indu);
                //System.out.println("indu char "+s.charAt(indu));
                for(j=k-1;j>=0;j--)

                {
                    //2 main part
                    //if(j!=0)
                    //c3=s.charAt(j-1); 
                    c=s5.charAt(j);

                    s7=s7+c;

                }
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                d=0;
                //60+50/2+5*x/2*3+55-60=60-20
                for(j=index+1;j<i;j++)

                {
                    //System.out.println("j is "+j+" till i "+i);
                    c=s.charAt(j);
                    //System.out.println("char is "+c);
                    if(d==1)
                    {
                        //System.out.println("d is "+d);
                        s6=s6+c;
                        //System.out.println("started adding back but front equal "+s6);
                    }
                    if((c=='+')||(c=='-')||(c=='='))
                    {
                        //System.out.println("c identified , triggered to note and start counting "+c);
                        if(d==0)
                        {    
                            //System.out.println("first one , as d is "+d);
                            c2=c;
                            //System.out.println("c2 is "+c);
                            endu=j;
                            //System.out.println("endu is  "+endu);
                        }   
                        d=1;
                        //System.out.println("d is "+d);
                    }

                }
                //////////////////////////////////////////////////////////////////////////////////////////
                if(endu==0)
                    endu=i;
                //System.out.println("endu is "+endu);
                //System.out.println("endu char "+s.charAt(endu));
                String s8=s.substring(indu,endu);
                //System.out.println("s is "+s); 
                //System.out.println("s1 is "+s1); 
                //System.out.println("s2 is "+s2); 
                //System.out.println("s3 is "+s3); 
                //System.out.println("s4 is "+s4);
                //System.out.println("s7 is "+s7);
                //System.out.println("s6 is "+s6);
                //System.out.println("s8 is "+s8);
                double d2=ob.kiki(s2);
                double d7=ob.kiki(s7);
                double d6=ob.kiki(s6);

                //System.out.println("d2 is "+d2);
                //System.out.println("d7 is "+d7);
                //System.out.println("d6 is "+d6);

                if(c2=='-')
                    d6=d6*(-1);
                double dd=d2-d7;
                //else
                //dd=d2+d7;
                dd=dd-d6;
                //System.out.println("dd is "+dd);
                int l20=s8.length();
                d=0;
                String s10="";
                double d10=0.0;
                for(j=0;j<l20;j++)
                {
                    c=s8.charAt(j);
                    if(c=='x')
                        index=j;
                }
                //System.out.println("index is "+index+" l is "+l20);
                c=s8.charAt(index);
                //System.out.println("char form "+index);
                for(j=index+1;j<l20;j++)
                {
                    c=s8.charAt(j);
                    //System.out.println("c is "+c);
                    if(d==1)
                        s10=s10+c;
                    if(c=='*'||c=='/')
                    {
                        if(d==0)
                        {
                            d=1;
                            c3=c;
                        }
                        ////System.out.println("c is "+c);

                        //break;
                    }
                    //System.out.println("s10 is "+s10);
                    //s10=s10+c;
                }
                //s10=s10+"+0";
                //System.out.println("s10 is "+s10+" dd is "+dd);
                d10=ob.kiki(s10);
                if(s10.equals(""))
                {}
                else
                {
                    if(c3=='*')
                        dd=dd/d10;
                    else
                        dd=dd*d10;
                }
                //System.out.println("d10 is "+d10+" dd is "+dd);
                ///////////////////////////////////
                for(j=0;j<l20;j++)
                {
                    c=s8.charAt(j);
                    if(c=='*'||c=='/')
                    {
                        c3=c;
                        break;
                    }
                    else if(c=='x')
                        break;
                    s9=s9+c;
                }
                //s9=s9+"+0";
                double d9=0.0;
                //System.out.println("s9 is "+s9+" dd is "+dd);
                d9=ob.kiki(s9);
                int al=0;
                if(c1=='-')
                    d9=d9*(-1);
                if(s9.equals(""))
                {
                    al=1;
                }
                else
                {
                    if(c3=='*')
                        dd=dd/d9;
                    else
                        dd=d9/dd;
                }
                ////System.out.println("endu char is "+s.charAt(indu-1));
                if(indu!=0)
                    if((al==1)&&(s.charAt(indu-1)=='-'))
                        dd=dd*(-1);
                //System.out.println("d9 is "+d9+" dd is "+dd);
                System.out.println("\n\n\nx is "+dd);            
                ////System.out.println("Returnin k"+k); 
                //return(k);
                //56+32/2-7*x/7*5-77+45/5=58-99/3+98
            //}
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage()+" is Invalid");
        }
    }
}