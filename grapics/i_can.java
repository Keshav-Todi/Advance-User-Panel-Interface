package Graphics;


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
class i_can
{
    GridBagConstraints c=new GridBagConstraints();
    JPanel p=new JPanel(new GridBagLayout());
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    String s="",s1="",s2="";
    int aloo=49,jk=1;
    double d12=0.0;
    public  void watchi()
    {
        JFrame f=new JFrame();
        //p.setBackground(Color.WHITE);

        simplify ob91=new simplify();
        delete ob81=new delete();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,125);
        f.setVisible(true);
        f.setTitle("My House");
        JButton btfor=new JButton(" change ");
        JTextField t=new JTextField(15);

        ImageIcon i8=new ImageIcon(getClass().getResource("0.jpg")); 
        JLabel l1=new JLabel(i8);
        ImageIcon colon=new ImageIcon(getClass().getResource("colon.jpg")); 
        JLabel l2=new JLabel(colon);
        ImageIcon kolon=new ImageIcon(getClass().getResource("0.jpg")); 
        JLabel l30=new JLabel(kolon);
        ImageIcon solon=new ImageIcon(getClass().getResource("0.jpg")); 
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

        aloo=0;
        btfor.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    String pa="",du="";
                    //++aloo;
                    //if(aloo>=10)
                    //  aloo=0;
                    s="";
                    //s=Integer.toString(aloo)+".jpg";
                    //ImageIcon i1=new ImageIcon(getClass().getResource(s)); 
                    //l1.setIcon(i1); 
                    int i=80;
                    int k=i/60;
                    int n=0;
                    for(i=80;i>=1;i--)
                    {
                        n=i;
                        System.out.println("i is "+i);
                        int j=0;
                        for(j=1;j<=978888880;j++)
                        {
                        }
                        System.out.println("delay done "+j);
                        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
                                //l30.setIcon(i2);
                                
                                s=pa+".jpg";
                                ImageIcon i3=new ImageIcon(getClass().getResource(s)); 
                                //l40.setIcon(i3); 
                                s=du+".jpg";
                                ImageIcon i4=new ImageIcon(getClass().getResource(s)); 
                                l1.setIcon(i4); 
                                System.out.println("                                                                                        "+k+":"+n);
                            }
                            else
                            {
                                s=Integer.toString(k)+".jpg";
                                ImageIcon i1=new ImageIcon(getClass().getResource(s)); 
                                //l30.setIcon(i1);
                                s=Integer.toString(0)+".jpg";
                                ImageIcon i2=new ImageIcon(getClass().getResource(s)); 
                                //l40.setIcon(i2);
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
                                //l30.setIcon(i2);
                                s=pa+".jpg";
                                ImageIcon i3=new ImageIcon(getClass().getResource(s)); 
                                //l40.setIcon(i3); 
                                s=du+".jpg";
                                ImageIcon i4=new ImageIcon(getClass().getResource(s)); 
                                l1.setIcon(i4); 
                                System.out.println("                                                                                        "+k+":"+n);
                            }
                            else
                            {
                                s=Integer.toString(k)+".jpg";
                                ImageIcon i1=new ImageIcon(getClass().getResource(s)); 
                                //l30.setIcon(i1);
                                s=Integer.toString(0)+".jpg";
                                ImageIcon i2=new ImageIcon(getClass().getResource(s)); 
                                //l40.setIcon(i2);
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
                                //l30.setIcon(i1);
                                s=pa+".jpg";
                                ImageIcon i2=new ImageIcon(getClass().getResource(s)); 
                                //l40.setIcon(i2); 
                                s=du+".jpg";
                                ImageIcon i3=new ImageIcon(getClass().getResource(s)); 
                                l1.setIcon(i3);
                                System.out.println("                                                                                        "+k+":"+i);
                            }
                            else
                            {
                                s=Integer.toString(k)+".jpg";
                                ImageIcon i1=new ImageIcon(getClass().getResource(s)); 
                                //l30.setIcon(i1);
                                s=Integer.toString(0)+".jpg";
                                ImageIcon i2=new ImageIcon(getClass().getResource(s)); 
                                //l40.setIcon(i2);
                                s=Integer.toString(i)+".jpg";
                                ImageIcon i3=new ImageIcon(getClass().getResource(s)); 
                                l1.setIcon(i3);
                                System.out.println("                                                                                        "+k+":"+"0"+i);
                            }
                        }
                        System.out.println("\n\n\n\n\n\n\n\n\n");
                    }
                }

            });
            String pa="",du="";
                    //++aloo;
                    //if(aloo>=10)
                    //  aloo=0;
                    s="";
                    //s=Integer.toString(aloo)+".jpg";
                    //ImageIcon i1=new ImageIcon(getClass().getResource(s)); 
                    //l1.setIcon(i1); 
                    int mc=180;
                    int k=mc/60;
                    int n=0;
                    for(int i=mc;i>=1;i--)
                    {
                        n=i;
                        System.out.println("i is "+i);
                        int j=0;
                        for(j=1;j<=978888880;j++)
                        {
                        }
                        System.out.println("delay done "+j);
                        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
                                System.out.println("                                                                                        "+k+":"+"0"+i);
                            }
                        }
                        System.out.println("\n\n\n\n\n\n\n\n\n");
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


