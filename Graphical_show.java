
import  Calculator.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Graphical_show extends Gt_dt
{
    //int clas=c;
    GridBagConstraints curb=new GridBagConstraints();
    JPanel p=new JPanel(new GridBagLayout());
    String s="#alpha_",s1="",s2="",s5="",s15="";
    double d12=0.0;
    String s3="";
    public   boolean flag=false, flag10=false;
    JTextField t1=new JTextField(15);    
    String us="1",pa="1",curbap="qGphJ";
    public  void graphi(String s_alpha)
    {
        try
        {
        //b.setLayout(new GridLayout(3,4,5,10));
        detail(s_alpha);
        //System.out.println("name "+name);
        //p.setBackground(Color.YELLOW);
        JFrame f=new JFrame();
        Container d=f.getContentPane();

        curb.insets=new Insets(20,20,20,20);
        curb.gridx=0;
        curb.gridy=1;
        simplify ob91=new simplify();
        //delete ob81=new delete();
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,125);
        f.setVisible(true);
        f.setTitle("Scientific Calculator");

        ImageIcon i;
        if(s_alpha.equals("nouser")==false)
            i=new ImageIcon(getClass().getResource(s+cn_id+".jpg")); 
        else
            i=new ImageIcon(getClass().getResource("500.jpg")); 

        ImageIcon i1=new ImageIcon(getClass().getResource("#capcha_1.jpg")); 
        JLabel l=new JLabel(i);
        //JLabel l=new JLabel("Hi I am Label");
        JLabel l1=new JLabel("NAME          :");            JLabel la1=new JLabel(name);
        JLabel l2=new JLabel("CAND_ID       :");            JLabel la2=new JLabel(Integer.toString(cn_id));
        JLabel l3=new JLabel("AGE           :");            JLabel la3=new JLabel(Integer.toString(age));
        JLabel l4=new JLabel("BLOOD         :");            JLabel la4=new JLabel(bld_grp);
        JLabel l5=new JLabel("GUARDIAN      :");            JLabel la5=new JLabel(gaurdian);
        JLabel l6=new JLabel("STATUS        :");            JLabel la6=new JLabel(status);
        JLabel l7=new JLabel("CLASS         :");            JLabel la7=new JLabel(Integer.toString(c));
        JLabel l8=new JLabel("DOB           :");            JLabel la8=new JLabel(dob);
        //JLabel l6=new JLabel("Captcha : Enter the code below");
        JLabel l50=new JLabel(i1);
        JButton b=new JButton(" Login ");
        JTextField t=new JTextField(15);
        JTextField t5=new JTextField(15);
        //ImageIcon i=new ImageIcon(getClass().getResource("calcu.jpg")); 
        //JLabel l1=new JLabel("");

        //setLayout(new FlowLayout());
        //b.addActionListener(new action());
        f.add(p);
        //p.add(l4);
        //p.add(l1);
        //System.out.println("Enter no. of tickets");
        //curb.gridx=1;
        //curb.gridy=2;
        //p.add(t,curb);
        //p.add(l);
        //p.add(l3);
        JButton bt1=new JButton("1");JButton bt2=new JButton("2");JButton bt3=new JButton("3");JButton bt4=new JButton("4");JButton bt5=new JButton("5");
        JButton bt6=new JButton("6");JButton bt7=new JButton("7");JButton bt8=new JButton("8");JButton bt9=new JButton("9");JButton bt0=new JButton("0");
        JButton btplus=new JButton("+");JButton btminus=new JButton("-");JButton btmul=new JButton("*");JButton btdiv=new JButton("/");
        JButton btsin=new JButton("sin");JButton btcos=new JButton("cos");JButton bttan=new JButton("tan");JButton btlog=new JButton("log");
        JButton btpow=new JButton("^");JButton bte=new JButton("e");JButton btmod=new JButton("|x|");JButton btdel=new JButton(" ◄ ");
        ///////////////////////////////
        String[] items={"not agree","I agree"};
        JComboBox k=new JComboBox(items);
        //p.add(k);

        //String s1="";
        //String s30="";
        /*
        s3=t1.getText();
        int ln3=s3.length();
        for(int i3=0;i3<ln3;i3++)
        {
        //c3=s3.charAt(i3);
        s30=s30+'*';
        }
        t1.setText(s30);
        s30="";
         */
        ////////////////////////
        Graphical_show ob77=new Graphical_show();
        boolean flgg=false;
        //while(flgg==false)
        //{  
        CalPlay ob1=new CalPlay();
        ob1.formai();
        ob1.formal();
        int s19=0,m19=0,h19=0;
        String d19="",s190="",m190="",h190="";
        d19=ob1.s1;

        s19=ob1.n1;
        m19=ob1.i1;
        h19=ob1.h1;
        //System.out.println("s1 m1 h1 in int "+s1+":"+m1+":"+h1+"\n\n" );
        s190=Integer.toString(s19);
        m190=Integer.toString(m19);
        h190=Integer.toString(h19);
        if(m19>=10)
            s190=h190+":"+m190;    
        else
            s190=h190+":0"+m190;    
        flgg=ob77.flag;
        //l41.setText(d19);
        //l51.setText(s190);
        //}
        /////////////////////////

        JButton b1=new JButton("Test1");
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();
                    s3=t1.getText();
                    s15=t5.getText();
                    /*
                    if(s2.equals(us))
                    {
                    if(s3.equals(pa))
                    {
                    flag=true;
                    }   
                    else
                    JOptionPane.showMessageDialog(null,"Wrong password");
                    }
                    else
                    JOptionPane.showMessageDialog(null,"Wrong username");
                     */
                    boolean flag1=false;
                    //flag=false;
                    file_output ob=new file_output();
                    ob.output("logkey",2);
                    int nout=ob.n;
                    String aout[]=new String[100];
                    int iout=0;
                    for(iout=0;iout<nout;iout++)
                        aout[iout]=ob.a[iout];
                    for(iout=0;iout<nout;iout=iout+2)
                    {
                        if(aout[iout].equals(s2))
                            flag=true;
                        System.out.println("flag at checking uesrname "+aout[iout]+" checking is "+flag);
                    }
                    if(flag==true)
                        for(iout=1;iout<nout;iout=iout+2)
                        {
                            if(aout[iout].equals(s3))
                                flag1=true;
                            System.out.println("flag at checking password "+aout[iout]+" checking is "+flag1);
                        }
                    else

                        JOptionPane.showMessageDialog(null,"Wrong username");
                    if(flag1==false)

                        JOptionPane.showMessageDialog(null,"Wrong password");
                    else if(flag==true && flag1==true)
                    {
                        System.out.println("use and pass agreed");
                        s5=k.getSelectedItem().toString();
                        //l.setText(s);
                        if(s5.equals(items[1]))    
                        {
                            System.out.println("terms agreed");
                            if(s15.equals(""))
                            {
                                System.out.println("cap equals");
                                if(flag==true)
                                {   
                                    JOptionPane.showMessageDialog(null,"Login successful");
                                    flag10=true;
                                    System.out.println("login successful");
                                }  
                                //flag=false;
                            }
                            else
                                JOptionPane.showMessageDialog(null,"Captcha wrong");
                        }
                        else
                            JOptionPane.showMessageDialog(null,"You should agree with terms ");
                    }
                    //System.out.println("t1 is"+t1);
                    //t1.setText("*****");                    
                    //System.out.println("t1 is"+t1);
                    /*
                    d12=ob91.simple(s2); 
                    s1=Double.toString(d12);
                    JOptionPane.showMessageDialog(null,s1);
                    t.setText(s1);
                    s=s1;
                     */
                }

            });
        b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    String s=k.getSelectedItem().toString();
                    l.setText(s);
                }

            });
        bt1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"1";t.setText(s);
                }

            });

        btplus.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"+";t.setText(s);
                }

            });

        curb.gridx=10;
        curb.gridy=1;
        p.add(l,curb);
        // curb.gridy=2;
        //p.add(l1,curb);
        //p.add(b,curb);
        //p.add(b1);
        curb.gridx=1;
        curb.gridy=3;
        p.add(l1,curb);++curb.gridx;p.add(la1,curb);//++curb.gridx;p.add(bt3,curb);++curb.gridy;curb.gridx=0;
        curb.gridx=1;
        curb.gridy=4; 
        p.add(l2,curb);++curb.gridx;p.add(la2,curb);//++curb.gridx;p.add(bt6,curb);++curb.gridy;curb.gridx=0;
        curb.gridx=1;
        curb.gridy=5; 
        p.add(l3,curb);++curb.gridx;p.add(la3,curb);
        curb.gridx=1;
        curb.gridy=6;
        p.add(l4,curb);++curb.gridx;p.add(la4,curb);
        curb.gridx=1;
        curb.gridy=7;
        p.add(l5,curb);++curb.gridx;p.add(la5,curb);
        curb.gridx=1;
        curb.gridy=8;
        p.add(l6,curb);++curb.gridx;p.add(la6,curb);
        curb.gridx=1;
        curb.gridy=9;
        p.add(l7,curb);++curb.gridx;p.add(la7,curb);
        curb.gridx=1;
        curb.gridy=10;
        p.add(l8,curb);++curb.gridx;p.add(la8,curb);

        curb.gridx=8;
        curb.gridy=2; 
        //p.add(l41,curb);
        curb.gridx=8;
        curb.gridy=3;
        // p.add(l51,curb);
        // curb.gridx=7;
        Checkbox checkbox1 = new Checkbox("Correct");  
        checkbox1.setBounds(100,100, 50,50);  
        Checkbox checkbox2 = new Checkbox("Changes required" /*,true*/);  
        checkbox2.setBounds(100,150, 50,50);  

        // private static Dialog d; 
        /*
        d = new Dialog(f , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );  
        Button b15 = new Button ("OK");  
        b.addActionListener ( new ActionListener()  
        {  
        public void actionPerformed( ActionEvent e )  
        {  
        //DialogExample.d.setVisible(false);  
        }  
        });  
        d.add( new Label ("Click button to continue."));  
        d.add(b15);   
        d.setSize(300,300);    
        d.setVisible(true);  
         */
        //if(checkbox1==true)
        //JOptionPane.showMessageDialog(null,"Good");

        checkbox2.addItemListener(new ItemListener() {  
                public void itemStateChanged(ItemEvent e) {               

                    if(e.getStateChange()==1)  
                        JOptionPane.showMessageDialog(null,"Good");
                }  
            });  

        curb.gridx=6;
        curb.gridy=6; 
        p.add(checkbox1,curb);  
        curb.gridx=6;
        curb.gridy=7; 
        p.add(checkbox2,curb);  
        /*
        /*
        p.add(bt7,curb);++curb.gridx;p.add(bt8,curb);++curb.gridx;p.add(bt9,curb);++curb.gridy;curb.gridx=1;
        p.add(bt0,curb);
        curb.gridx=4;
        curb.gridy=4;
        p.add(btplus,curb);++curb.gridx;p.add(btminus,curb);++curb.gridx;p.add(btmul,curb);++curb.gridx;p.add(btdiv,curb);
        curb.gridx=4;
        curb.gridy=5;
        p.add(btsin,curb);++curb.gridx;p.add(btcos,curb);++curb.gridx;p.add(bttan,curb);++curb.gridx;p.add(btlog,curb);
        curb.gridx=4;
        curb.gridy=6;
        p.add(btpow,curb);++curb.gridx;p.add(bte,curb);++curb.gridx;p.add(btmod,curb);++curb.gridx;p.add(btdel,curb);
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("file");
        mb.add(file);
        JMenu edit=new JMenu("edit");
        mb.add(edit);
         */
        //p.add(mb);
        boolean flg=false;
        /*
        while(flg==false)
        {            
        for(int j=999999999;j>=0;j--)
        {
        }
        flg=flag;        
        String s30="";
        s3=t1.getText();
        //int kn=s3.indexOf();
        System.out.println("s3 is"+s3);
        int ln3=s3.length();
        for(int i3=0;i3<ln3;i3++)
        {
        //c3=s3.charAt(i3);
        s30=s30+'*';
        }
        System.out.println("s30 is"+s30);
        t1.setText(s30);
        s30="";
        }
         */
        }

        
        catch(NullPointerException e)
        {
        System.out.println("Sorry name not found\n\n");
        System.out.println("s_alpha is "+s_alpha);
        graphi("nouser");

        }
         
    }

    public void stn()
    {

        /*
        Graphical_show ob77=new Graphical_show();
        ob77.graphi();
        boolean flg=false;
        while(flg==false)
        {            
        for(int j=999999999;j>=0;j--)
        {
        }
        flg=ob77.flag;        
        String s30="";
        s3=t1.getText();
        System.out.println("t1 is"+t1);
        int ln3=s3.length();
        for(int i3=0;i3<ln3;i3++)
        {
        //c3=s3.charAt(i3);
        s30=s30+'*';
        }
        System.out.println("s30 is"+s30);
        t1.setText(s30);
        s30="";
         */
    }    

    public static void main(String args[])
    {

    }
}

