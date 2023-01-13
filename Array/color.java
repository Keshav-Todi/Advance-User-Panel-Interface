package Array;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class color
{
    private JFrame f;
    private JPanel p;
    private JComboBox k;
    private JButton b1;
    private JButton b2;
    private JLabel l;
    //color()
    //{
      //  gui();
    //}

    public void gui()
    {
        f=new JFrame("Creativity tuts");
        f.setVisible(true);
        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        p=new JPanel(new GridBagLayout());
        p.setBackground(Color.YELLOW);
        
        GridBagConstraints c=new GridBagConstraints();
        c.insets=new Insets(10,10,10,10);
        c.gridx=0;
        c.gridy=1;
        String[] items={"keshav","Jayash","Aadya","Samridhi"};
        
        k=new JComboBox(items);
        
        c.gridx=0;
        c.gridy=3;
        p.add(k,c);
        b1=new JButton("Test1");
        b2=new JButton("Test2");
        l=new JLabel("This is a test Label");
        b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(null,"HI how are you");
                }

            });
        b2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    String s=k.getSelectedItem().toString();
                    l.setText(s);
                }

            });
            JMenuBar mb=new JMenuBar();
            JMenu file=new JMenu("file");
            mb.add(file);
            JMenu edit=new JMenu("edit");
            mb.add(edit);
        p.add(mb);           
             c.gridx=0;
        c.gridy=1;
            p.add(b1,c);
        ///////////
         c.gridx=2;
        c.gridy=1;
        p.add(l,c);
            ///////////////
        c.gridx=0;
        c.gridy=6;
        p.add(b2,c);
        
        
        f.add(p);
    }

    
}