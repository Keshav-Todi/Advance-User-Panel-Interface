import java.util.*;
class write
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        file_input ob1=new file_input();
        int i=0;
        String s="",ss="";
                System.out.println("Enter"+" I am done with "+" to quit");
        System.out.println("Enter name of file that store data ");
        ss=sc.nextLine();
                System.out.println("Enter String ");
        while(s.equals("I am done with")==false)
        {
        System.out.print("");
        s=sc.nextLine();
        if(s.equals("I am done with"))
        break;
        ob1.input(s,ss,2);
    }
    }
}
        