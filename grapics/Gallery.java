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
public class Gallery
{
    GridBagConstraints c=new GridBagConstraints();
    JPanel p=new JPanel(new GridBagLayout());
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    String s="",s1="",s2="";
    int aloo=49,jk=1;
    double d12=0.0;
    public  void gall()
    {
        JFrame f=new JFrame();
        simplify ob91=new simplify();
        delete ob81=new delete();
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,125);
        f.setVisible(true);
        f.setTitle("My House");
        JLabel l=new JLabel("Hi I am Label");
        JLabel l4=new JLabel("Total 49");
        JButton b=new JButton(" change ");
        JTextField t=new JTextField(15);

        ImageIcon i=new ImageIcon(getClass().getResource("1.jpg")); 
        JLabel l1=new JLabel(i);
        //////////////////////////////////////////////////////////////////////////////
        //BufferedImage scaleImage(int WIDTH, int HEIGHT, String filename) {
        //BufferedImage bi = null;
        //////////////////////////////////////////////////////////////////////////////
        //setLayout(new FlowLayout());
        b.addActionListener(new action());
        f.add(p);
        c.insets=new Insets(20,20,20,20);
        c.gridx=0;
        c.gridy=0;
        p.add(l4,c);
        c.gridx=3;
        c.gridy=5;
        p.add(l1,c);
        //System.out.println("Enter no. of tickets");
        //p.add(t);
        //p.add(l);
        //p.add(l3);
        JButton btfor=new JButton(" ◄ ");
        JButton btback=new JButton(" ► ");
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
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    if(aloo==38)
                        aloo=0;
                    ++aloo;
                    s="";
                    s=Integer.toString(aloo)+".jpg";
                    ImageIcon i=new ImageIcon(getClass().getResource(s)); 
                    //BufferedImage resized = resize(i, 500, 500);
                    //l1.setIcon(resized);
                    //JLabel l1=new JLabel(i);
                    //p.add(l1,c);
                    //c.gridx++;
                }

            });
        b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    String s=k.getSelectedItem().toString();
                    l.setText(s);
                }

            });
        btfor.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    if(aloo==49||jk==1)
                        {aloo=1;++jk;}
                    else
                        ++aloo;
                    //aloo=1;
                    s="";
                    s=Integer.toString(aloo)+".jpg";
                    ImageIcon i=new ImageIcon(getClass().getResource(s)); 
                    BufferedImage img=scaleImage(50,50,s);
                    l1.setIcon(i);
                    l4.setText(Integer.toString(aloo)+" / 49");
                }

            });
        btback.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    if(aloo==1||jk==1)
                        {aloo=49;++jk;}
                    else
                        --aloo;
                    //aloo=1;
                    s="";
                    s=Integer.toString(aloo)+".jpg";
                    ImageIcon i=new ImageIcon(getClass().getResource(s)); 
                    BufferedImage img=scaleImage(50,50,s);
                    l1.setIcon(i);
                    l4.setText(Integer.toString(aloo)+" / 49");
                }

            });
        //p.add(b1,c);
        c.gridx=1;
        c.gridy=5;
        p.add(btfor,c);
        c.gridx=5;
        c.gridy=5;
        p.add(btback,c);
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("file");
        mb.add(file);
        JMenu edit=new JMenu("edit");
        mb.add(edit);
        //p.add(mb);           
    }

    private static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

    public BufferedImage scaleImage(int WIDTH, int HEIGHT, String filename) {
        BufferedImage bi = null;
        try {
            ImageIcon ii = new ImageIcon(filename);//path to image
            bi = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(ii.getImage(), 0, 0, WIDTH, HEIGHT, null);
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
    return bi;
}
}

