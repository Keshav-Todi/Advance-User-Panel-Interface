import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class SimpleMenuExample //extends Frame implements ActionListener
{
    GridBagConstraints c=new GridBagConstraints();
    JPanel p=new JPanel(new GridBagLayout());
    Menu states, cities;
    public SimpleMenuExample()
    {           
        p.setBackground(new java.awt.Color(211,211,211));
        JFrame f=new JFrame();

        c.insets=new Insets(8,8,8,8);
        c.gridx=0;
        c.gridy=1;
        f.setSize(200,125);
        f.setVisible(true);
        f.setTitle("Tic Tac Toe Game");
        f.add(p);
        MenuBar mb = new MenuBar();             // begin with creatin   g menu bar
        //p.add(mb);        
        states = new Menu("Indian States");     // create menus   
        cities = new Menu("Indian Cities"); 

        mb.add(states);             // add menus to menu bar
        mb.add(cities);

        //states.addActionListener(this);     // link with ActionListener for event handling
        //cities.addActionListener(this);

        states.add(new MenuItem("Himachal Pradesh"));
        states.add(new MenuItem("Rajasthan"));
        states.add(new MenuItem("West Bengal"));
        states.addSeparator();          // separates from north Indian states from south Indian
        states.add(new MenuItem("Andhra Pradesh"));
        states.add(new MenuItem("Tamilnadu"));
        states.add(new MenuItem("Karnataka"));

        cities.add(new MenuItem("Delhi"));
        cities.add(new MenuItem("Jaipur"));
        cities.add(new MenuItem("Kolkata"));
        cities.addSeparator();          // separates north Indian cities from south Indian
        cities.add(new MenuItem("Hyderabad"));
        cities.add(new MenuItem("Chennai"));
        cities.add(new MenuItem("Bengaluru"));

        //setTitle("Simple Menu Program");        // frame creation methods
        //setSize(300, 300);
        //setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String str = e.getActionCommand();      // know the menu item selected by the user
        System.out.println("You selected " + str);
    }

    public static void main(String args[])
    {
        new SimpleMenuExample();
    }
}