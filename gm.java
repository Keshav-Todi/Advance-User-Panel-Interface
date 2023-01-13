 
import Data_Encryption.*;
import  Calculator.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics2D;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.RenderingHints;
public class gm
{
    GridBagConstraints c=new GridBagConstraints();
    JPanel p=new JPanel(new GridBagLayout());
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    String s="",s1="",s2="";
    int aloo=49,jk=1;
    double d12=0.0;
    int go=0;
    //gf ob=new gf();
    ImageIcon i=new ImageIcon(getClass().getResource("tic.jpg")); 
    JLabel l8=new JLabel(i);
    ImageIcon i1=new ImageIcon(getClass().getResource("hang.jpg")); 
    JLabel l9=new JLabel(i1);
    ImageIcon i2=new ImageIcon(getClass().getResource("dino.jpg")); 
    JLabel l10=new JLabel(i2);
    public  void gall()
    {
        JFrame f=new JFrame();
        simplify ob91=new simplify();
        //delete ob81=new delete();
        p.setBackground(Color.GREEN);
        //Graphical_Calculator ob50=new Graphical_Calculator();
        Gallery ob40=new Gallery();
        stopwatch ob30=new stopwatch();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,125);
        f.setVisible(true);
        f.setTitle("My House");
        JLabel l=new JLabel("                ");
         JLabel l45=new JLabel("                ");
        JLabel l4=new JLabel("Game");
        JButton b=new JButton(" change ");
        JTextField t=new JTextField(15);

        //////////////////////////////////////////////////////////////////////////////
        //BufferedImage scaleImage(int WIDTH, int HEIGHT, String filename) {
        //BufferedImage bi = null;
        //////////////////////////////////////////////////////////////////////////////
        //setLayout(new FlowLayout());
        //b.addActionListener(new action());
        f.add(p);
        c.insets=new Insets(20,20,20,20);
        c.gridx=0;
        c.gridy=0;
        p.add(l4,c);
        c.gridx=2;
        c.gridy=5;
        p.add(l8,c);
        c.gridx=3;
        c.gridy=5;
        p.add(l,c);
        c.gridx=5;
        c.gridy=5;
        p.add(l45,c);
        c.gridx=4;
        c.gridy=5;
        p.add(l9,c);
        c.gridx=6;
        c.gridy=5;
        p.add(l10,c);
        //System.out.println("Enter no. of tickets");
        //p.add(t);
        //p.add(l);
        //p.add(l3);
        JButton btgalu=new JButton(" tic-tac-toe ");
        JButton btcalcu=new JButton(" hangman ");
        JButton btstopi=new JButton(" dino ");
        ///////////////////////////////

        c.gridx=0;
        c.gridy=3;
        //p.add(b,c);
        c.gridx=0;
        c.gridy=4;
        c.gridy++;
        String[] items={"keshav","Jayash","Aadya","Samridhi"};
        JComboBox k=new JComboBox(items);
        //p.add(k);

        //String s1="";
        JButton b1=new JButton("Test1");
       
        b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    String s=k.getSelectedItem().toString();
                    l.setText(s);
                }

            });
        btgalu.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    /*
                    if(aloo==49||jk==1)
                    {aloo=1;++jk;}
                    else
                    ++aloo;
                    //aloo=1;
                    s="";
                    s=Integer.toString(aloo)+".jpg";
                    ImageIcon i=new ImageIcon(getClass().getResource(s)); 
                    //BufferedImage img=scaleImage(50,50,s);
                    l8.setIcon(i);
                    l4.setText(Integer.toString(aloo)+" / 49");
                     */
                    ob40.gall();
                }

            });
        btcalcu.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    /*
                    if(aloo==1||jk==1)
                    {aloo=49;++jk;}
                    else
                    --aloo;
                    //aloo=1;
                    s="";
                    s=Integer.toString(aloo)+".jpg";
                    ImageIcon i=new ImageIcon(getClass().getResource(s)); 
                    //BufferedImage img=scaleImage(50,50,s);
                    l9.setIcon(i);
                    l4.setText(Integer.toString(aloo)+" / 49");
                     */
                    //ob50.graphi();
                }

            });
            btstopi.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    
                    ob30.wath();
                }

            });
        //p.add(b1,c);
        c.gridx=2;
        c.gridy=6;
        p.add(btgalu,c);
        c.gridx=4;
        c.gridy=6;
        p.add(btcalcu,c);
        c.gridx=6;
        c.gridy=6;
        p.add(btstopi,c);
        JMenuBar mb=new JMenuBar();
        c.gridx=0;
        c.gridy=0;
        JMenu file=new JMenu("file");JMenu edit=new JMenu("edit");JMenu view=new JMenu("view");JMenu tools=new JMenu("tools");JMenu help=new JMenu("help");
        mb.add(file,c);
        //JMenu edit=new JMenu("edit");
        ++c.gridx;mb.add(edit,c);++c.gridx;mb.add(view,c);++c.gridx;mb.add(tools,c);++c.gridx;mb.add(help,c);
        //p.add(mb);           
    }
     public static void main()
    {
        gm ob=new gm();
        ob.gall();
    }
}