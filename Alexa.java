import  Array.*;
//import  Graphics.*;
import  Calculator.*;
import java.util.*;
import java.io.*;
public class Alexa  
{
    static String s="";
    public static void done()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hi I am Alexa what can i do for you,  anything");
        fronti ob77=new fronti();
        ob77.graphi();
        boolean flg=false;
        while(flg==false)
        {
            flg=ob77.flag10;
        }
        /*
        if(flg==true)
        System.out.println("Done///////////////////////////////////////////////////////");
        else
        System.out.println("Not Done///////////////////////////////////////////////////////"); 
         */
        Refeeral ob6=new Refeeral();file_writer ob100=new file_writer();
        //ob6.ref();
        int lp=0,h=0,k=0; 
        while(true)
        {
            if(h!=0)
            {k=h;h=0;}
            else
            {
                System.out.println("\n\nEnter 1 to play tic tac toe");
                System.out.println("Enter 2 to play hangman");
                System.out.println("Enter 3 to play dino game");
                System.out.println("Enter 4 to say your name");
                System.out.println("Enter 5 to open gallery");
                System.out.println("Enter 6 for telling a day");
                System.out.println("Enter 7 for guessing your age");
                System.out.println("Enter 8 for a stopwatch");
                System.out.println("Enter 9 to access ATM ");
                System.out.println("Enter 10 to go to cafeteria ");
                System.out.println("Enter 11 for scientific calculator ");
                System.out.println("Enter 12 to extract data from public listed files ");
                System.out.println("Enter 13 to see Candiadate details ");
                System.out.println("Enter 14 to create a login account ");
                System.out.println("Enter 15 for exit");
                Error ob5=new Error();
                k=ob5.eror();
            }
            switch(k)
            {
                case 1:
                System.out.println("\nTic Tac Toe game operated");
                tic ob1=new tic();//tic_tac_toe ob1=new tic_tac_toe();
                ob1.graphi();//ob1.tac();
                break;
                case 2:
                System.out.println("\nHangman game operated");
                Hangman ob12=new Hangman();
                ob12.hangi();
                break;
                case 3:
                System.out.println("\ndino game operated");
                user_action ob32=new user_action();
                ob32.uso();
                break;
                case 4:
                System.out.println("\nName function operated");
                name ob2=new name();
                ob2.naam();
                break;
                case 5: 
                System.out.println("\nPanel making operated");
                Gallery ob3=new Gallery();
                ob3.gall();
                //Window ob3=new Window();
                //ob3.came();
                break;
                case 6:
                System.out.println("\nCalender day operated");
                //Calender ob4=new Calender();
                //ob4.day();
                day ob4=new day();
                ob4.days();
                break;
                case 7:
                System.out.println("\nAge function on operation");
                age ob8=new age();
                ob8.guesse();
                break;
                case 8:
                System.out.println("\nStopwatch function on operation");
                stopwatch ob78=new stopwatch();
                ob78.wath();
                break;
                case 9:
                System.out.println("\nATM accessing on operation");
                ATM ob10=new ATM();
                lp=ob10.atun();
                break;
                case 10:
                System.out.println("\ncafeteria accessing on operation");
                //cafeteria ob11=new cafeteria();
                //ob11.cafet();
                Bill ob11=new Bill();
                ob11.bil();
                break;
                case 11:
                System.out.println("\naccessing calculator on operation");
                //simplify ob91=new simplify();
                //ob91.simple();
                Graphical_Calculator ob71=new Graphical_Calculator();
                ob71.graphi();
                break;
                case 12:
                System.out.println("\naccessing data on operation");
                //File_Handle ob19=new File_Handle();
                //ob19.datan();
                file_output ob19=new file_output();
                ob19.nikal();
                break;
                case 13:
                System.out.println("\naccessing user's data on operation");
                display_dt ob72 = new display_dt(); 
                ob72.shown();
                break;
                case 14:
                System.out.println("\naccessing user's account creation");
                Ur_Acc_crt ob73 = new Ur_Acc_crt();
                ob73.create();
                break;
                case 15:
                System.out.println("\nTermination on operation");
                System.exit(0);
                break;
                case 16:
                System.out.println("ok i see");
                extraction ob99=new extraction();
                ob99.extr();
                h=ob99.n;
                break;
                default:
                System.out.println("Wrong choice");
            }
            if(lp==55)
            {
                //System.out.println("Please enter your feedback");
                //s=sc.nextLine();
                //ob100.besti(s);
                break;
            }
        }

    }
}