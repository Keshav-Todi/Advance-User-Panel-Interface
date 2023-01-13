
import  Calculator.*;
import Array.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class day
{
    GridBagConstraints c=new GridBagConstraints();
    JPanel p=new JPanel(new GridBagLayout());
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    Calender ob=new Calender();
    String s="",s1="",s2="",s5="",s15="";
    double d12=0.0;
    String s3="";
    public   boolean flag=false;
    JTextField t1=new JTextField(15);    
    String us="Keshav",pa="8445",cap="qGphJ";
    public  void days()
    {
        //b.setLayout(new GridLayout(3,4,5,10));

        //p.setBackground(Color.YELLOW);
        JFrame f=new JFrame();
        Container d=f.getContentPane();

        c.insets=new Insets(20,20,20,20);
        c.gridx=0;
        c.gridy=1;
        simplify ob91=new simplify();
        //delete ob81=new delete();
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,125);
        f.setVisible(true);
        f.setTitle("Scientific Calculator");
        ImageIcon i=new ImageIcon(getClass().getResource("500.jpg")); 
        ImageIcon i1=new ImageIcon(getClass().getResource("#captcha.jpg")); 
        JLabel l=new JLabel("Day of the respective date");
        //JLabel l=new JLabel("Hi I am Label");
        JLabel l4=new JLabel("User-name");
        JLabel l5=new JLabel("Password");
        JLabel l41=new JLabel("User-name");
        JLabel l51=new JLabel("Password");
        JLabel l6=new JLabel("Captcha : Enter the code below");
        JLabel l50=new JLabel(i1);
        JButton b=new JButton(" Enter ");

        // Button b=new Button("Button 1");     
        // b.setBounds(150,300,200,150);    
        //b.setBackground(Color.yellow);  

        JTextField t=new JTextField(15);
        JTextField t5=new JTextField(15);
        //ImageIcon i=new ImageIcon(getClass().getResource("calcu.jpg")); 
        JLabel l1=new JLabel("");

        //setLayout(new FlowLayout());
        //b.addActionListener(new action());
        f.add(p);
        //p.add(l4);
        //p.add(l1);
        //System.out.println("Enter no. of tickets");
        c.gridx=1;
        c.gridy=2;
        //p.add(t,c);
        //p.add(l);
        //p.add(l3);
        JButton bt1=new JButton("1");JButton bt2=new JButton("2");JButton bt3=new JButton("3");JButton bt4=new JButton("4");JButton bt5=new JButton("5");
        JButton bt6=new JButton("6");JButton bt7=new JButton("7");JButton bt8=new JButton("8");JButton bt9=new JButton("9");JButton bt0=new JButton("0");
        JButton btplus=new JButton("+");JButton btminus=new JButton("-");JButton btmul=new JButton("*");JButton btdiv=new JButton("/");
        JButton btsin=new JButton("sin");JButton btcos=new JButton("cos");JButton bttan=new JButton("tan");JButton btlog=new JButton("log");
        JButton btpow=new JButton("^");JButton bte=new JButton("e");JButton btmod=new JButton("|x|");JButton btdel=new JButton(" ◄ ");
        ///////////////////////////////

        String year[]=new String[101];
        String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] day=new String[31];
        int x=0,j1=0;
        for(j1=2000;j1<=2100;j1++)
        {
            year[x]=Integer.toString(j1);
            x++;
        }
        x=0;
        for(j1=1;j1<=31;j1++)
        {
            day[x]=Integer.toString(j1);
            x++;
        }
        JComboBox ky=new JComboBox(year);
        JComboBox km=new JComboBox(month);
        JComboBox kd=new JComboBox(day);

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
        //front ob77=new front();
        //boolean flgg=false;
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
        //flgg=ob77.flag;
        l41.setText(d19);
        l51.setText(s190);
        //}
        /////////////////////////
        JButton b1=new JButton("Test1");
        b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();
                    s3=t1.getText();
                    s15=t5.getText();
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
                    s5=ky.getSelectedItem().toString();
                    //l.setText(s);
                    if(s5.equals(year[1]))    
                    {
                        if(s15.equals(cap))
                        {
                            if(flag==true)
                                JOptionPane.showMessageDialog(null,"Login successful");
                            flag=false;
                        }
                        else
                            JOptionPane.showMessageDialog(null,"Captcha wrong");
                    }
                    else
                        JOptionPane.showMessageDialog(null,"You should agree with terms ");
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
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    String s1=ky.getSelectedItem().toString();
                    String s2=km.getSelectedItem().toString();
                    String s3=kd.getSelectedItem().toString();
                    int is1=Integer.valueOf(s1);
                    int is2=0;
                    for(int j1=0;j1<12;j1++)
                        if(s2.equals(month[j1]))
                            is2=j1;

                    int is3=Integer.valueOf(s3);
                    ob.day(is1,is2,is3);
                    s1=ob.s; 
                    l.setText(s1);
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
        /*
        c.gridx=4;
        c.gridy=1;
        p.add(l,c);
        c.gridy=2;
        p.add(l1,c);
        //p.add(b,c);
        //p.add(b1);
        c.gridx=3;
        c.gridy=3;
        p.add(l4,c);++c.gridx;p.add(t,c);//++c.gridx;p.add(bt3,c);++c.gridy;c.gridx=0;
        c.gridx=3;
        c.gridy=4; 
        p.add(l5,c);++c.gridx;p.add(t1,c);//++c.gridx;p.add(bt6,c);++c.gridy;c.gridx=0;
         */
        c.gridx=1;
        c.gridy=5; 
        p.add(ky,c);
        c.gridx=2;
        c.gridy=5; 
        p.add(km,c);
        c.gridx=3;
        c.gridy=5; 
        p.add(kd,c);
        c.gridx=5;
        c.gridy=7; 
        p.add(b,c);
        c.gridx=2;
        c.gridy=3; 
        p.add(l,c);
        /*
         *

        c.gridx=6;
        c.gridy=8;
        p.add(b,c);
        c.gridx=7;
        c.gridy=5;
        p.add(l6,c);
        c.gridx=7;
        c.gridy=6;
        p.add(l50,c);
        c.gridx=7;
        c.gridy=7;
        p.add(t5,c);

        c.gridx=8;
        c.gridy=2; 
        p.add(l41,c);
        c.gridx=8;
        c.gridy=3;
        p.add(l51,c);
        // c.gridx=7;
        Checkbox checkbox1 = new Checkbox("C++");  
        checkbox1.setBounds(100,100, 50,50);  
        Checkbox checkbox2 = new Checkbox("Java", true);  
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

        /*
        /*
        p.add(bt7,c);++c.gridx;p.add(bt8,c);++c.gridx;p.add(bt9,c);++c.gridy;c.gridx=1;
        p.add(bt0,c);
        c.gridx=4;
        c.gridy=4;
        p.add(btplus,c);++c.gridx;p.add(btminus,c);++c.gridx;p.add(btmul,c);++c.gridx;p.add(btdiv,c);
        c.gridx=4;
        c.gridy=5;
        p.add(btsin,c);++c.gridx;p.add(btcos,c);++c.gridx;p.add(bttan,c);++c.gridx;p.add(btlog,c);
        c.gridx=4;
        c.gridy=6;
        p.add(btpow,c);++c.gridx;p.add(bte,c);++c.gridx;p.add(btmod,c);++c.gridx;p.add(btdel,c);
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
}