package Data_Encryption;
public class ques_bar
{
    public String qb(String s)
    {
        int i=0,j=0,l=0;
        char c=' ';
        String s1="";
        l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c=='?')
                s1=s1+'?';
            else
                s1=s1+c;
        }
        //char c5='?';
        char c6='?';
        j=(int)c6;
        System.out.println("Done "+j );
        return s1;
    }
}
//? ?  ? |  | ?  | ?|  | |?  ??  ? ?  |?  | ?  ? |  | |?  | ?  