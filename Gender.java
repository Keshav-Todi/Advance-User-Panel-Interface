import java.util.*;
class Gender
{
    public static String gend(String s)
    {
        Scanner sc=new Scanner(System.in);
        int l=0;
        char c=' ';
        l=s.length();
        c=s.charAt(l-1);
        if(c=='a'||c=='e'||c=='u'||c=='i')
        return("Female");
        else
        return("Male");
    }
}