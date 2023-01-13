package Graphics;
public class delete
{
    public String del(String s)
    {
        //String s="355+sin 45";
        int i=0,l=0;
        char c=' ';
        l=s.length();
        String s1="";
        for(i=0;i<l-1;i++)
        {
            c=s.charAt(i);
            s1=s1+c;
        }
        s=s1;
        return s;
    }
}
        
        
        