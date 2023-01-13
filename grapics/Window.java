package Graphics;
import  Calculator.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window
{
    JPanel p=new JPanel();
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    public  void came()
    {
        JFrame f=new JFrame();
        simplify ob91=new simplify();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,125);
        f.setVisible(true);
        f.setTitle("My House");
        JLabel l=new JLabel("Hi I am Label");
        JLabel l4=new JLabel("Welcome to INOX");
        JButton b=new JButton("click me");
        JTextField t=new JTextField(15);

        ImageIcon i=new ImageIcon(getClass().getResource("title.jpg")); 
        JLabel l1=new JLabel(i);

        //setLayout(new FlowLayout());
        b.addActionListener(new action());
        f.add(p);
        p.add(l4);
        p.add(l1);
        System.out.println("Enter no. of tickets");
        p.add(t);
        p.add(l);
        p.add(l3);
        
        
        ///////////////////////////////
        String[] items={"keshav","Jayash","Aadya","Samridhi"};
        JComboBox k=new JComboBox(items);
        p.add(k);
        JButton b1=new JButton("Test1");
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(null,"HI how are you");
                    ob91.simple();
                }

            });
        b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    String s=k.getSelectedItem().toString();
                    l.setText(s);
                }

            });
         p.add(b);
        p.add(b1);
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("file");
        mb.add(file);
        JMenu edit=new JMenu("edit");
        mb.add(edit);
        p.add(mb);           
    }
}

