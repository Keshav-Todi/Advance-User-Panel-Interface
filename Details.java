import java.util.*;
class Details
{
    int age=0,c=0,cn_id=0;
    accept_str ob=new accept_str();
    String name="",gaurdian="",dob="",status="",bld_grp="";
    Details(int id)
    {
        cn_id=id;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter candidate name");
        name=ob.accept();
        System.out.println("Enter age of candidate");
        age=sc.nextInt();
        System.out.println("Enter blood grp of candidate");
        bld_grp=ob.accept();
        while(status.equals("schooling")==false&&status.equals("college")==false&&status.equals("graduated")==false)
        {
            System.out.println("Enter status ('schooling'/'college'/graduated')");
            status=ob.accept();
            if(status.equals("schooling"))
            {
                System.out.println("Enter class of candidate");
                c=sc.nextInt();
            }
            else if(status.equals("college"))
            {
                System.out.println("Enter year term of college");
                c=sc.nextInt();
            }
            else if(status.equals("graduated"))
            {
                System.out.println("Enter no. of years from graduation");
                c=sc.nextInt();
            }
            else
            System.out.println("Enter appropriate answer");
        }
        System.out.println("Enter guardian name");
        gaurdian=ob.accept();
        System.out.println("Enter date of birth in '00/00/00'format");
        dob=ob.accept();
    }
    public static void main(String args[])
    {
        Details ob=new Details(1111);
        ob.input();
    }
}