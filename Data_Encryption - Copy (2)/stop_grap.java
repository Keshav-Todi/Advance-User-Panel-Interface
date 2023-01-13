package Data_Encryption;

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
public class stop_grap
{
    GridBagConstraints c=new GridBagConstraints();
    JPanel p=new JPanel(new GridBagLayout());
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    String s="",s1="",s2="";
    int aloo=49,jk=1,hehe=0,mcu=0;
    long j=0;
    double d12=0.0;
    public void watchi(int mc)
    {

        JFrame f=new JFrame();
        p.setBackground(Color.WHITE);

        //mcu=mc;
        simplify ob91=new simplify();
        //delete ob81=new delete();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,125);
        f.setVisible(true);
        f.setTitle("My House");
        JButton btfor=new JButton(" change ");
        JTextField t=new JTextField(15);

        int k=mc/60;
        int n=mc-k*60;
        String kolo=Integer.toString(k);
        String neu= Integer.toString(n);
        String befo="",afte="";
        if(n>=10)
        {
            befo=neu.substring(0,1)+".jpg";
            afte=neu.substring(1,2)+".jpg";
        }
        else
        {
            befo="0.jpg";
            afte=neu.substring(0,1)+".jpg";
        }
        //System.out.println("AFTE IS "+afte);
        ImageIcon i8=new ImageIcon(getClass().getResource(afte)); 
        JLabel l1=new JLabel(i8);
        ImageIcon colon=new ImageIcon(getClass().getResource("colon.jpg")); 
        JLabel l2=new JLabel(colon);
        ImageIcon kolon=new ImageIcon(getClass().getResource(kolo+".jpg")); 
        JLabel l30=new JLabel(kolon);
        ImageIcon solon=new ImageIcon(getClass().getResource(befo)); 
        JLabel l40=new JLabel(solon);

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
        c.gridx=4;
        c.gridy=5;
        p.add(l1,c);
        c.gridx=2;
        c.gridy=5;
        p.add(l2,c);
        c.gridx=1;
        c.gridy=5;
        p.add(l30,c);
        c.gridx=3;
        c.gridy=5;
        p.add(l40,c);
        for(long jn=1;jn<=678888880;jn++)
        {
        }
        System.out.println("Enter no. of tickets");
        //p.add(t);
        //p.add(l);
        //p.add(l3);
        JLabel l=new JLabel("Hi I am Label");
        JLabel l4=new JLabel("Total 49");
        JButton b=new JButton(" Start ");
        JButton btback=new JButton(" ► ");
        ///////////////////////////////

        c.gridx=0;
        c.gridy=3;
        //p.add(b,c);
        c.gridx=0;
        c.gridy=4;
        c.gridy++;
        String[] items={"keshav","Jayash","Aadya","Samridhi"};
        //JComboBox k=new JComboBox(items);
        //p.add(k);

        //String s1="";
        JButton b1=new JButton("Test1");
        JButton b24=new JButton(" Stop ");
        aloo=0;

        c.gridx=2;
        c.gridy=4;
        p.add(b24,c);
        String pa="",du="";
        for(int i=mc;i>=0;i--)
        {
            k=i/60;
        n=i-k*60;
         
            for(j=1;j<=678888880;j++)
            {
            }
            System.out.println("delay done "+j);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("n was "+n);
            while(n>=60)
            {
                n=n-60;
            }
            System.out.println("n is "+n);
            if(n>=10)
            {
                System.out.println("n  greater than 0 "+n);

                s=Integer.toString(n);
                pa=s.charAt(0)+"";
                du=s.charAt(1)+"";
                System.out.println("pa is "+pa);
                System.out.println("du is "+du);
            }
            if(i%60==0)
            {
                System.out.println("i%60  i is "+i);
                if(n>=10)
                {
                    System.out.println("n lesser then 10  "+n);

                    s=Integer.toString(k)+".jpg";
                    ImageIcon i2=new ImageIcon(getClass().getResource(s)); 
                    l30.setIcon(i2);

                    s=pa+".jpg";
                    ImageIcon i3=new ImageIcon(getClass().getResource(s)); 
                    l40.setIcon(i3); 
                    s=du+".jpg";
                    ImageIcon i4=new ImageIcon(getClass().getResource(s)); 
                    l1.setIcon(i4); 
                    System.out.println("                                                                                        "+k+":"+n);
                }
                else
                {
                    s=Integer.toString(k)+".jpg";
                    ImageIcon i1=new ImageIcon(getClass().getResource(s)); 
                    l30.setIcon(i1);
                    s=Integer.toString(0)+".jpg";
                    ImageIcon i2=new ImageIcon(getClass().getResource(s)); 
                    l40.setIcon(i2);
                    s=Integer.toString(n)+".jpg";
                    ImageIcon i3=new ImageIcon(getClass().getResource(s)); 
                    l1.setIcon(i3);
                    System.out.println("                                                                                        "+k+":"+"0"+n);
                }
                --k;
            }
            else if(i>60)
            {    
                if(n>=10)
                {
                    s=Integer.toString(k)+".jpg";
                    ImageIcon i2=new ImageIcon(getClass().getResource(s)); 
                    l30.setIcon(i2);
                    s=pa+".jpg";
                    ImageIcon i3=new ImageIcon(getClass().getResource(s)); 
                    l40.setIcon(i3); 
                    s=du+".jpg";
                    ImageIcon i4=new ImageIcon(getClass().getResource(s)); 
                    l1.setIcon(i4); 
                    System.out.println("                                                                                        "+k+":"+n);
                }
                else
                {
                    s=Integer.toString(k)+".jpg";
                    ImageIcon i1=new ImageIcon(getClass().getResource(s)); 
                    l30.setIcon(i1);
                    s=Integer.toString(0)+".jpg";
                    ImageIcon i2=new ImageIcon(getClass().getResource(s)); 
                    l40.setIcon(i2);
                    s=Integer.toString(n)+".jpg";
                    ImageIcon i3=new ImageIcon(getClass().getResource(s)); 
                    l1.setIcon(i3);
                    System.out.println("                                                                                        "+k+":"+"0"+n);
                }
            }
            else if(i<60)
            {
                if(i>=10)
                {
                    s=Integer.toString(i);
                    pa=s.charAt(0)+"";
                    du=s.charAt(1)+"";
                }
                if(i>=10)
                {
                    s=Integer.toString(k)+".jpg";
                    ImageIcon i1=new ImageIcon(getClass().getResource(s)); 
                    l30.setIcon(i1);
                    s=pa+".jpg";
                    ImageIcon i2=new ImageIcon(getClass().getResource(s)); 
                    l40.setIcon(i2); 
                    s=du+".jpg";
                    ImageIcon i3=new ImageIcon(getClass().getResource(s)); 
                    l1.setIcon(i3);
                    System.out.println("                                                                                        "+k+":"+i);
                }
                else
                {
                    s=Integer.toString(k)+".jpg";
                    ImageIcon i1=new ImageIcon(getClass().getResource(s)); 
                    l30.setIcon(i1);
                    s=Integer.toString(0)+".jpg";
                    ImageIcon i2=new ImageIcon(getClass().getResource(s)); 
                    l40.setIcon(i2);
                    s=Integer.toString(i)+".jpg";
                    ImageIcon i3=new ImageIcon(getClass().getResource(s)); 
                    l1.setIcon(i3);
                    // System.out.println("                                                                                        "+k+":"+"0"+i);
                }
            }
            System.out.println("\n\n\n\n\n\n\n\n\n");
           b24.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e)
                    {
                        hehe=1;
                    }

                });

            if(hehe==1)
                i=-1;
        }
        //p.add(b1,c);
        c.gridx=1;
        c.gridy=1;
        p.add(btfor,c);
        c.gridx=5;
        c.gridy=5;
        //p.add(btback,c);
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("file");
        mb.add(file);
        JMenu edit=new JMenu("edit");
        mb.add(edit);
        //p.add(mb);     
    }
}


