
import  Calculator.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Graphical_Calculator
{
    GridBagConstraints c=new GridBagConstraints();
    JPanel p=new JPanel(new GridBagLayout());

    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    String s="",s1="",s2="";;
    double d12=0.0;
    public  void graphi()
    {
        //b.setLayout(new GridLayout(3,4,5,10));

        //p.setBackground(Color.YELLOW);   
        p.setBackground(new java.awt.Color(153, 153, 153));
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
        JLabel l=new JLabel("Hi I am Label");
        JLabel l4=new JLabel("This is a calculator");
        JButton b=new JButton(" = ");
        Font f1 = new Font("Verdana",Font.BOLD,60);
        //JTextField tf = new JTextField(60);
        JTextField t=new JTextField(15);
        t.setFont(f1);
        //t.setForeground(Color.green);
        t.setBounds(80,20,250,50);//t.setBounds(800,200,2050,500);

        ImageIcon i=new ImageIcon(getClass().getResource("calcu.jpg")); 
        JLabel l1=new JLabel(i);

        //setLayout(new FlowLayout());
        //b.addActionListener(new action());
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
        JButton btpow=new JButton("^");JButton bte=new JButton("e");JButton btmod=new JButton("|x|");JButton btdel=new JButton("Del");
        JButton btrst=new JButton(" Reset ");
        ///////////////////////////////
        String[] items={"keshav","Jayash","Aadya","Samridhi"};
        JComboBox k=new JComboBox(items);
        //p.add(k);

        //String s1="";
        JButton b1=new JButton("Test1");
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();
                    //JOptionPane.showMessageDialog(null,s2);

                    d12=ob91.simple(s2); 
                    s1=Double.toString(d12);
                    //JOptionPane.showMessageDialog(null,s1);
                    t.setText(s1);
                    s=s1;
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
        bt2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"2";t.setText(s);
                }

            });
        bt3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"3";t.setText(s);
                }

            });
        bt4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"4";t.setText(s);
                }

            });
        bt5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"5";t.setText(s);
                }

            });
        bt6.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"6";t.setText(s);
                }

            });
        bt7.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"7";t.setText(s);
                }

            });
        bt8.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"8";t.setText(s);
                }

            });
        bt9.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"9";t.setText(s);
                }

            });
        bt0.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"0";t.setText(s);
                }

            });
        btplus.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"+";t.setText(s);
                }

            });
        btminus.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"-";t.setText(s);
                }

            });
        btmul.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"*";t.setText(s);
                }

            });
        btdiv.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"/";t.setText(s);
                }

            });
        btsin.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"sin";t.setText(s);
                }

            });
        btcos.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"cos";t.setText(s);
                }

            });
        bttan.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"tan";t.setText(s);
                }

            });

        btlog.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"log";t.setText(s);
                }

            });
        bte.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"e";t.setText(s);
                }

            });
        btmod.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"|";t.setText(s);
                }

            });

        btdel.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=ob81.del(s);t.setText(s);
                }

            });

        b.setFont(new java.awt.Font("Tahoma", 0, 36));
        bt1.setFont(new java.awt.Font("Tahoma", 0, 36));
        bt2.setFont(new java.awt.Font("Tahoma", 0, 36));
        bt3.setFont(new java.awt.Font("Tahoma", 0, 36));
        bt4.setFont(new java.awt.Font("Tahoma", 0, 36));
        bt5.setFont(new java.awt.Font("Tahoma", 0, 36));
        bt6.setFont(new java.awt.Font("Tahoma", 0, 36));
        bt7.setFont(new java.awt.Font("Tahoma", 0, 36));
        bt8.setFont(new java.awt.Font("Tahoma", 0, 36));
        bt9.setFont(new java.awt.Font("Tahoma", 0, 36));
        bt0.setFont(new java.awt.Font("Tahoma", 0, 36));
        btplus.setFont(new java.awt.Font("Tahoma", 0, 36));
        btminus.setFont(new java.awt.Font("Tahoma", 0, 36));
        btmul.setFont(new java.awt.Font("Tahoma", 0, 36));
        btdiv.setFont(new java.awt.Font("Tahoma", 0, 36));
        btsin.setFont(new java.awt.Font("Tahoma", 0, 36));
        btcos.setFont(new java.awt.Font("Tahoma", 0, 36));
        bttan.setFont(new java.awt.Font("Tahoma", 0, 36));
        btlog.setFont(new java.awt.Font("Tahoma", 0, 36));
        btpow.setFont(new java.awt.Font("Tahoma", 0, 36));
        bte.setFont(new java.awt.Font("Tahoma", 0, 36));
        btmod.setFont(new java.awt.Font("Tahoma", 0, 36));
        btdel.setFont(new java.awt.Font("Tahoma", 0, 36));    btdel.setBackground(new java.awt.Color(51, 102, 255));
        btrst.setFont(new java.awt.Font("Tahoma", 0, 36));    btrst.setBackground(new java.awt.Color(255, 102, 0));  

        c.gridx=3;
        c.gridy=3;
        p.add(b,c);
        //p.add(b1);
        c.gridx=2;
        c.gridy=4;
        p.add(bt1,c);++c.gridx;p.add(bt2,c);++c.gridx;p.add(bt3,c);++c.gridy;c.gridx=2;
        p.add(bt4,c);++c.gridx;p.add(bt5,c);++c.gridx;p.add(bt6,c);++c.gridy;c.gridx=2;
        p.add(bt7,c);++c.gridx;p.add(bt8,c);++c.gridx;p.add(bt9,c);++c.gridy;c.gridx=3;
        p.add(bt0,c);
        c.gridx=6;
        c.gridy=4;
        p.add(btplus,c);++c.gridx;p.add(btminus,c);++c.gridx;p.add(btmul,c);++c.gridx;p.add(btdiv,c);
        c.gridx=6;
        c.gridy=5;
        p.add(btsin,c);++c.gridx;p.add(btcos,c);++c.gridx;p.add(bttan,c);++c.gridx;p.add(btlog,c);
        c.gridx=6;
        c.gridy=6;
        p.add(btpow,c);++c.gridx;p.add(bte,c);++c.gridx;p.add(btmod,c);c.gridx=5;c.gridy=3;p.add(btdel,c);
        c.gridx=1;
        c.gridy=4;
        p.add(btrst,c);

        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("file");
        mb.add(file);
        JMenu edit=new JMenu("edit");
        mb.add(edit);
        p.add(mb); 
        boolean fg=true;
        s2=t.getText();
        while(fg==true)
        {
            s2=t.getText();
            System.out.println("s2 is "+s2);
            int len=0;
            len=s2.length();
            char cha='B';
            if(len!=0)
                cha=s2.charAt(len-1);
            if(cha=='A'||cha==' ')
            {
                s2=s2.substring(0,len-1);
                d12=ob91.simple(s2); 
                s1=Double.toString(d12);
                t.setText(s1);
                s=s1;
            }
        }
    }

    public static void main()
    {
        Graphical_Calculator ob71=new Graphical_Calculator();
        ob71.graphi();
    }
}

