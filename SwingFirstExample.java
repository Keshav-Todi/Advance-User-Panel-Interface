import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 
import javax.swing.*; 
public class SwingFirstExample {
    
    public static void main(String[] args) {    
        JFrame frame = new JFrame("My First Swing Example");
        
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel panel = new JPanel();    
        
        frame.add(panel);
        SwingFirstExample ob=new SwingFirstExample();
        ob.placeComponents(panel);

        frame.setVisible(true);
    }

     void placeComponents(JPanel panel) {

        
        panel.setLayout(null);

        
        JLabel userLabel = new JLabel("User");
        
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
        
        ImageIcon i=new ImageIcon(getClass().getResource("500.jpg"));
        JLabel l=new JLabel(i);
        l.setBounds(10, 120, 80, 25);
        panel.add(l);
    }

}