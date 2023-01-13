import java.util.*;
public class extraction
{
    int n=0;
    void extr()
    {
        Scanner sc=new Scanner(System.in);
        word_need ob=new word_need();
        file_input ob3=new file_input();
        file_output ob4=new file_output();
        CalPlay ob1=new CalPlay();
        int k=0,i=0,j=0,f=0,g=0,l=0,si=0;
        String s1="",ss="",su="";
        String store="Remember";
        String a[]=new String[100];
        String c[]=new String[100];
        String d[]=new String[100];        
        //String b[]=new String[100];
        String b[]={"Remember","Hello","Hi","How","What","When","play","bro","I","you","want"};
        g=b.length;
        while(true)
        {
            System.out.println("Enter a string");
            String s=sc.nextLine();
            l=s.length();
            //String s="Hey how are you bro";
            ob.proper(s);
            k=ob.k;

            //System.out.println("k is "+k);
            for(i=0;i<k;i++)
                a[i]=ob.a[i];
            //for(i=0;i<k;i++)
            //System.out.println("Arraynew -"+a[i]);
            for(i=0;i<g;i++)
            {
                //System.out.println("i is "+i+ " b is "+b[i] );
                for(j=0;j<k;j++)
                {
                    //System.out.println("j is "+j+ " a is "+a[j] );
                    //System.out.println("i is "+i+ " b is "+b[i] );
                    ++f;
                    String fh=a[j];
                    f=f+fh.length();
                    if(b[i].equals(a[j]))
                    {//System.out.println("word found "+a[j]);
                        s1=a[j];

                    }
                }
            }
            if(s1.equals("Remember"))
            {
                System.out.print("I will Remember that ");
                for(i=1;i<k;i++)
                    ss=ss+a[i]+" ";
                System.out.println(ss);
                //System.out.println();
                ob3.input(ss,store,2);
                //n=sc.nextInt();
            }
            if(s1.equals("play"))
            {
                System.out.println("\nEnter 1 to play tic tac toe");
                System.out.println("Enter 2 to play hangman");
                n=sc.nextInt();
            }
            if(s1.equals("What"))
            {
                for(i=1;i<k;i++)
                {
                    //System.out.println("i is "+i+" till k "+k+" a[i] is "+a[i] );
                    if(a[i].equals("time"))
                    {
                        ob1.formai();
                        //int s1=ob1.n1;
                        int m1=ob1.i1;
                        int h1=ob1.h1;
                        //System.out.println("s1 m1 h1 in int "+s1+":"+m1+":"+h1+"\n\n" );
                        //s=Integer.toString(s1);
                        String m=Integer.toString(m1);
                        String h=Integer.toString(h1);
                        String sime=h+":"+m;
                        System.out.println("Time is "+sime);
                    }
                    if(a[i].equals("capital"))
                    {
                        ob4.output("capital",2); 
                        //int s1=ob1.n1;
                        int n1=ob4.n;
                        int k1=0;
                        boolean flag=false;
                        //for(n=i+2;n<k;n++)
                        su=su+a[i+2];
                        //System.out.println("su is "+su);
                        for(n=0;n<n1;n++)
                            c[n]=ob4.a[n];
                        for(n=0;n<n1;n++)
                        {
                            //System.out.println("state to check is   "+c[n]);                            
                            ob.proper(c[n]);
                            k1=ob.k;
                            //System.out.println("no. of words in it is "+k1);
                            for(si=0;si<k1;si++)
                            {
                                d[si]=ob.a[si];
                                //System.out.println("words are "+d[si]);
                            }
                            for(si=0;si<k1;si++)
                            {
                                //System.out.println("su is "+su);
                                //System.out.println("word in line  is "+d[si]);                                
                                if(su.equals(d[si]))                          
                                {
                                    if(d[si+1].equals("-"))
                                        System.out.println("The capital of "+su+" is "+d[si+2]);
                                    else
                                        System.out.println("The capital of "+su+" "+d[si+1]+" is "+d[si+3]);
                                    flag=true;
                                }
                            }
                            if(flag==true)
                                break;

                        }
                        //System.out.println("s1 m1 h1 in int "+s1+":"+m1+":"+h1+"\n\n" );
                        /*  
                        //s=Integer.toString(s1);
                        String m=Integer.toString(m1);
                        String h=Integer.toString(h1);
                        String sime=h+":"+m;
                        System.out.println("Time is "+sime);
                         */
                    }
                }
                //System.out.println("Enter 2 to play hangman");
                //n=sc.nextInt();
            }
            if(s1.equals("want"))
            {

                System.out.println("Are you sure you want "+s.substring(7,l));
                n=100;
            }
            if(s1.equals("I"))
            {

                System.out.println("What! you "+s.substring(1,l));
                n=100;
            }
            if(s1.equals("you"))
            {

                System.out.println("Yes I "+s.substring(3,l));
                n=100;
            }
            if(s1.equals("Hello"))
            {

                System.out.println("Hi what can i do for you ");
                n=100;
            }
            if(s1.equals("Hi"))
            {

                System.out.println("Hello what can i do for you ");
                n=100;
            }
            if(s1.equals("How")||s1.equals("When"))
            {

                System.out.println("Sorry my wikipedia kit is still in development , but still though i will do research on this , "+s1);
                n=100;
            }
            s1="";
        }
    }
}

