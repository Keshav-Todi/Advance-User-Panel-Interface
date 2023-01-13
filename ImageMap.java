import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import javax.swing.*;
  
public class ImageMap
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(new ContentPanel());
        f.setSize(400,400);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}
  
class ContentPanel extends JPanel
{
    public ContentPanel()
    {
        final JLabel imageLabel = new ImageLabel().getLabel();
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.white);
        panel.add(imageLabel, new GridBagConstraints());
        final JLabel statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setPreferredSize(new Dimension(10, 25));
        imageLabel.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {
                Rectangle[] rects = getClickableRegions(imageLabel);
                Point p = e.getPoint();
                String s = "error";
                if(rects[0].contains(p))
                    s = "upper half";
                if(rects[1].contains(p))
                    s = "lower half";
                statusLabel.setText(s);
            }
        });
        setLayout(new BorderLayout());
        add(panel);
        add(statusLabel, "South");
    }
  
    private Rectangle[] getClickableRegions(JLabel label)
    {
        int w = label.getWidth();
        int h = label.getHeight();
        Rectangle hi = new Rectangle(0, 0, w, h/2);
        Rectangle lo = new Rectangle(0, h/2, w, h);
        return new Rectangle[] { hi, lo };
    }
}
  
class ImageLabel
{
    JLabel label;
  
    public ImageLabel()
    {
        Image image = loadImage();
        label = new JLabel(new ImageIcon(image));
    }
  
    public JLabel getLabel()
    {
        return label;
    }
  
    private Image loadImage()
    {
        String fileName = "images/bclynx.jpg";
        Image image = null;
        try
        {
            URL url = getClass().getResource("#alpha_1609.jpg");
            image = ImageIO.read(url);
        }
        catch(MalformedURLException mue)
        {
            System.out.println("url: " + mue.getMessage());
        }
        catch(IOException ioe)
        {
            System.out.println("read: " + ioe.getMessage());
        }
        return image;
    }
}