import  Calculator.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class tic
{
    GridBagConstraints c=new GridBagConstraints();
    JPanel p=new JPanel(new GridBagLayout());

    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    String s="",s1="",s2="";;
    double d12=0.0;
    toe obb = new toe();
    public void graphi()
    {
        //b.setLayout(new GridLayout(3,4,5,10));

        //p.setBackground(Color.YELLOW);   
        //p.setBackground(new java.awt.Color(153, 153, 153));
        p.setBackground(new java.awt.Color(211,211,211));
        JFrame f=new JFrame();
        Container d=f.getContentPane();

        c.insets=new Insets(8,8,8,8);
        c.gridx=0;
        c.gridy=1;
        f.setSize(200,125);
        f.setVisible(true);
        f.setTitle("Tic Tac Toe Game");
        JLabel l=new JLabel("Now is X's turn");
        JLabel l4=new JLabel(" Play other Games ");
        JButton b=new JButton(" = ");
        Font f1 = new Font("Verdana",Font.BOLD,60);

        ImageIcon i=new ImageIcon(getClass().getResource("calcu.jpg")); 
        JLabel l1=new JLabel(i);
        JLabel lnum[]=new JLabel[50];
        for(int ii=0;ii<50;ii++)
            lnum[ii]=new JLabel("              ");
        JTextField t=new JTextField(15);
        //setLayout(new FlowLayout());
        //b.addActionListener(new action());
        f.add(p);
        //p.add(l4);
        //p.add(l1);
        //System.out.println("Enter no. of tickets");

        //p.add(l);
        p.add(l3);
        JButton bt1=new JButton("  ");JButton bt2=new JButton("  ");JButton bt3=new JButton("  ");JButton bt4=new JButton("  ");JButton bt5=new JButton("  ");
        JButton bt6=new JButton("  ");JButton bt7=new JButton("  ");JButton bt8=new JButton("  ");JButton bt9=new JButton("  ");JButton bt0=new JButton(" ");
        JButton btplus=new JButton(" Hangman ");JButton btminus=new JButton(" Dino-on  ");JButton btmul=new JButton("*");JButton btdiv=new JButton("/");
        JButton btsin=new JButton("sin");JButton btcos=new JButton("cos");JButton bttan=new JButton("tan");JButton btlog=new JButton("log");
        JButton btpow=new JButton("^");JButton bte=new JButton("e");JButton btmod=new JButton("|x|");JButton btdel=new JButton("Del");
        JButton btrst=new JButton(" Replay ");

        c.gridx=1;
        c.gridy=2;
        p.add(btdel,c);

        JButton btnum[][]={{bt1,bt2,bt3},{bt4,bt5,bt6},{bt7,bt8,bt9}};
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
                    //JOptionPane.showMessageDialog(null,s2); //JOptionPane.showMessageDialog(null,s1);
                    t.setText(s1);
                    s=s1;
                }

            });
        bt1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"1";t.setText(s);
                    obb.tac(1,1);
                    if(obb.flag==false)
                        if(obb.f%2==1)
                        {
                            bt1.setForeground(Color.RED);
                            bt1.setText("X");   btdel.setText("O turn now");
                        }
                        else
                        {
                            bt1.setForeground(Color.BLUE);
                            bt1.setText("O");
                        }
                    if(obb.win==true){
                        for(int lp1=0;lp1<3;lp1++)
                            for(int lp2=0;lp2<3;lp2++)
                                if(obb.winner[lp1][lp2]==5){
                                    btnum[lp1][lp2].setBackground(Color.BLACK);  btnum[lp1][lp2].setForeground(Color.WHITE);}}
                }

            });
        bt2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"2";t.setText(s);
                    obb.tac(1,2);
                    if(obb.flag==false)
                        if(obb.f%2==1)
                        {
                            bt2.setForeground(Color.RED);
                            bt2.setText("X");
                        }
                        else
                        {
                            bt2.setForeground(Color.BLUE);
                            bt2.setText("O");
                        }
                    if(obb.win==true){
                        for(int lp1=0;lp1<3;lp1++)
                            for(int lp2=0;lp2<3;lp2++)
                                if(obb.winner[lp1][lp2]==5){
                                    btnum[lp1][lp2].setBackground(Color.BLACK);  btnum[lp1][lp2].setForeground(Color.WHITE);}}
                }

            });
        bt3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"3";t.setText(s);
                    obb.tac(1,3);
                    if(obb.flag==false)
                        if(obb.f%2==1)
                        {
                            bt3.setForeground(Color.RED);
                            bt3.setText("X");
                        }
                        else
                        {
                            bt3.setForeground(Color.BLUE);
                            bt3.setText("O");
                        }
                    if(obb.win==true){
                        for(int lp1=0;lp1<3;lp1++)
                            for(int lp2=0;lp2<3;lp2++)
                                if(obb.winner[lp1][lp2]==5){
                                    btnum[lp1][lp2].setBackground(Color.BLACK);  btnum[lp1][lp2].setForeground(Color.WHITE);}}
                }

            });
        bt4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"4";t.setText(s);
                    obb.tac(2,1);
                    if(obb.flag==false)
                        if(obb.f%2==1)
                        {
                            bt4.setForeground(Color.RED);
                            bt4.setText("X");
                        }
                        else
                        {
                            bt4.setForeground(Color.BLUE);
                            bt4.setText("O");
                        }
                    if(obb.win==true){
                        for(int lp1=0;lp1<3;lp1++)
                            for(int lp2=0;lp2<3;lp2++)
                                if(obb.winner[lp1][lp2]==5){
                                    btnum[lp1][lp2].setBackground(Color.BLACK);  btnum[lp1][lp2].setForeground(Color.WHITE);}}
                }

            });
        bt5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"5";t.setText(s);
                    obb.tac(2,2);
                    if(obb.flag==false)
                        if(obb.f%2==1)
                        {
                            bt5.setForeground(Color.RED);
                            bt5.setText("X");
                        }
                        else
                        {
                            bt5.setForeground(Color.BLUE);
                            bt5.setText("O");
                        }
                    if(obb.win==true){
                        for(int lp1=0;lp1<3;lp1++)
                            for(int lp2=0;lp2<3;lp2++)
                                if(obb.winner[lp1][lp2]==5){
                                    btnum[lp1][lp2].setBackground(Color.BLACK);  btnum[lp1][lp2].setForeground(Color.WHITE);}}
                }

            });
        bt6.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"6";t.setText(s);
                    obb.tac(2,3);
                    if(obb.flag==false)
                        if(obb.f%2==1)
                        {
                            bt6.setForeground(Color.RED);
                            bt6.setText("X");
                        }
                        else
                        {
                            bt6.setForeground(Color.BLUE);
                            bt6.setText("O");
                        }
                    if(obb.win==true){
                        for(int lp1=0;lp1<3;lp1++)
                            for(int lp2=0;lp2<3;lp2++)
                                if(obb.winner[lp1][lp2]==5){
                                    btnum[lp1][lp2].setBackground(Color.BLACK);  btnum[lp1][lp2].setForeground(Color.WHITE);}}
                }

            });
        bt7.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"7";t.setText(s);
                    obb.tac(3,1);
                    if(obb.flag==false)
                        if(obb.f%2==1)
                        {
                            bt7.setForeground(Color.RED);
                            bt7.setText("X");
                        }
                        else
                        {
                            bt7.setForeground(Color.BLUE);
                            bt7.setText("O");
                        }
                    if(obb.win==true){
                        for(int lp1=0;lp1<3;lp1++)
                            for(int lp2=0;lp2<3;lp2++)
                                if(obb.winner[lp1][lp2]==5){
                                    btnum[lp1][lp2].setBackground(Color.BLACK);  btnum[lp1][lp2].setForeground(Color.WHITE);}}
                }

            });
        bt8.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"8";t.setText(s);
                    obb.tac(3,2);
                    if(obb.flag==false)
                        if(obb.f%2==1)
                        {
                            bt8.setForeground(Color.RED);
                            bt8.setText("X");
                        }
                        else
                        {
                            bt8.setForeground(Color.BLUE);
                            bt8.setText("O");
                        }
                    if(obb.win==true){
                        for(int lp1=0;lp1<3;lp1++)
                            for(int lp2=0;lp2<3;lp2++)
                                if(obb.winner[lp1][lp2]==5){
                                    btnum[lp1][lp2].setBackground(Color.BLACK);  btnum[lp1][lp2].setForeground(Color.WHITE);}}
                }

            });
        bt9.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"9";t.setText(s);
                    obb.tac(3,3);
                    if(obb.flag==false)
                        if(obb.f%2==1)
                        {
                            bt9.setForeground(Color.RED);
                            bt9.setText("X");
                        }
                        else
                        {
                            bt9.setForeground(Color.BLUE);
                            bt9.setText("O");
                        }
                    if(obb.win==true){
                        for(int lp1=0;lp1<3;lp1++)
                            for(int lp2=0;lp2<3;lp2++)
                                if(obb.winner[lp1][lp2]==5){
                                    btnum[lp1][lp2].setBackground(Color.BLACK);  btnum[lp1][lp2].setForeground(Color.WHITE);}}
                }

            });
        btrst.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"0";t.setText(s);
                    for(int lp1=0;lp1<3;lp1++)
                        for(int lp2=0;lp2<3;lp2++)
                        {   btnum[lp1][lp2].setText("  ");  btnum[lp1][lp2].setBackground(Color.WHITE);  }

                    obb.initialize();

                }

            });

        // bt1.setBackground(Color.BLACK);  bt1.setForeground(Color.WHITE);

        b.setFont(new java.awt.Font("Tahoma", 0, 36));
        bt1.setFont(new java.awt.Font("Tahoma", 0, 100));     bt1.setBackground(new java.awt.Color(255, 255, 255));
        bt2.setFont(new java.awt.Font("Tahoma", 0, 100));     bt2.setBackground(new java.awt.Color(255, 255, 255));
        bt3.setFont(new java.awt.Font("Tahoma", 0, 100));     bt3.setBackground(new java.awt.Color(255, 255, 255));
        bt4.setFont(new java.awt.Font("Tahoma", 0, 100));     bt4.setBackground(new java.awt.Color(255, 255, 255));
        bt5.setFont(new java.awt.Font("Tahoma", 0, 100));     bt5.setBackground(new java.awt.Color(255, 255, 255));
        bt6.setFont(new java.awt.Font("Tahoma", 0, 100));     bt6.setBackground(new java.awt.Color(255, 255, 255));
        bt7.setFont(new java.awt.Font("Tahoma", 0, 100));     bt7.setBackground(new java.awt.Color(255, 255, 255));
        bt8.setFont(new java.awt.Font("Tahoma", 0, 100));     bt8.setBackground(new java.awt.Color(255, 255, 255));
        bt9.setFont(new java.awt.Font("Tahoma", 0, 100));     bt9.setBackground(new java.awt.Color(255, 255, 255));
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
        btdel.setFont(new java.awt.Font("Tahoma", 0, 36));    btdel.setBackground(new java.awt.Color(255, 0, 51));
        btrst.setFont(new java.awt.Font("Tahoma", 0, 36));    btrst.setBackground(new java.awt.Color(46, 204, 113)); //btrst.setBackground(new java.awt.Color(255, 102, 0));  

        btdel.setBorder(null);   //.setBackground(new java.awt.Color(46, 204, 113));
        btdel.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        btdel.setForeground(new java.awt.Color(255, 255, 255));
        btdel.setText("Play");

        c.gridx=8;
        c.gridy=3;
        p.add(l4,c);
        //p.add(b1);
        c.gridx=2;
        c.gridy=4;
        p.add(bt1,c);++c.gridx;p.add(bt2,c);++c.gridx;p.add(bt3,c);++c.gridy;c.gridx=2;
        p.add(bt4,c);++c.gridx;p.add(bt5,c);++c.gridx;p.add(bt6,c);++c.gridy;c.gridx=2;
        p.add(bt7,c);++c.gridx;p.add(bt8,c);++c.gridx;p.add(bt9,c);++c.gridy;c.gridx=3;
        //p.add(bt0,c);
        c.gridx=5;
        c.gridy=4;
        p.add(lnum[0],c);++c.gridx;p.add(lnum[1],c);++c.gridx;p.add(lnum[2],c);
        c.gridx=8;
        c.gridy=4;
        p.add(btplus,c);++c.gridy;p.add(btminus,c);//++c.gridx;p.add(btmul,c);++c.gridx;p.add(btdiv,c);
        c.gridx=6;
        c.gridy=5;
        //p.add(btsin,c);++c.gridx;p.add(btcos,c);++c.gridx;p.add(bttan,c);++c.gridx;p.add(btlog,c);
        c.gridx=6;
        c.gridy=6;
        //p.add(btpow,c);++c.gridx;p.add(bte,c);++c.gridx;p.add(btmod,c);c.gridx=5;c.gridy=3;p.add(btdel,c);
        c.gridx=1;
        c.gridy=4;
        p.add(btrst,c);
        boolean fg=true;
        s2=t.getText();

        /*while(fg==true)
        {
        s2=t.getText();
        System.out.print("");
        int len=0;
        }*/
    }

    public static void main()
    {
        tic ob71=new tic();
        ob71.graphi();
    }
}

