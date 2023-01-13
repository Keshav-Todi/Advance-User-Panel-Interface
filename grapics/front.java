package Graphics;
import  Calculator.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class front
{
    GridBagConstraints c=new GridBagConstraints();
    JPanel p=new JPanel(new GridBagLayout());
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    String s="",s1="",s2="",s5="";
    double d12=0.0;
    String s3="";
    public   boolean flag=false;
    JTextField t1=new JTextField(15);    
    String us="Keshav",pa="8445";
    public  void graphi()
    {
        //b.setLayout(new GridLayout(3,4,5,10));

        //p.setBackground(Color.YELLOW);
        JFrame f=new JFrame();
        Container d=f.getContentPane();

        c.insets=new Insets(20,20,20,20);
        c.gridx=0;
        c.gridy=1;
        simplify ob91=new simplify();
        delete ob81=new delete();
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,125);
        f.setVisible(true);
        f.setTitle("Scientific Calculator");
        ImageIcon i=new ImageIcon(getClass().getResource("avatar.jpg")); 
        JLabel l=new JLabel(i);
        //JLabel l=new JLabel("Hi I am Label");
        JLabel l4=new JLabel("User-name");
        JLabel l5=new JLabel("Password");
        JButton b=new JButton(" Login ");
        JTextField t=new JTextField(15);

        //ImageIcon i=new ImageIcon(getClass().getResource("calcu.jpg")); 
        JLabel l1=new JLabel("");

        //setLayout(new FlowLayout());
        b.addActionListener(new action());
        f.add(p);
        //p.add(l4);
        //p.add(l1);
        //System.out.println("Enter no. of tickets");
        c.gridx=1;
        c.gridy=2;
        p.add(t,c);
        //p.add(l);
        p.add(l3);
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
        JButton b1=new JButton("Test1");
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();
                    s3=t1.getText();
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
                    s5=k.getSelectedItem().toString();
                    //l.setText(s);
                    if(s5.equals(items[1]))    
                    {
                        if(flag==true)
                            JOptionPane.showMessageDialog(null,"Login successful");
                    }
                    else
                        JOptionPane.showMessageDialog(null,"You should agree with terms ");
                     System.out.println("t1 is"+t1);
                        t1.setText("*****");                    
                     System.out.println("t1 is"+t1);
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
        c.gridx=3;
        c.gridy=5; 
        p.add(k,c);
        c.gridx=6;
        c.gridy=7;
        p.add(b,c);
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
    }

    public void stn()
    {
        front ob77=new front();
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
        }    
    }
}
