package Data_Encryption;
import java.util.*;
class hello
{
    public static void main()
    {
        text_num ob=new text_num();
        bar_num ob1=new bar_num();
        String s5="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text or barcode");
        String s=sc.nextLine();
        char c=s.charAt(0);
        System.out.println("c is *"+c+"*");
        if(c=='|'||c==' '||c=='?')
        {
            System.out.println("c equal");
            s5=ob1.bn(s);
            System.out.println("after conversion to bar_num "+s5);
        }
        else
            s5=ob.tn(s);
        System.out.println("after conversion to bar "+s5);
        System.out.println(""+s5);
    }
}