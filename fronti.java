import  Calculator.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class fronti 
{
    GridBagConstraints c=new GridBagConstraints();
    JPanel p=new JPanel(new GridBagLayout());
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    String s="",s1="",s2="",s5="",s15="";
    double d12=0.0;
    String s3="";
    public   boolean flag=false, flag10=false;
    JTextField t1=new JTextField(5);    
    String us="1",pa="1",cap="qGphJ";
    //////////////////////////////////////  for captcha
    int cap_aloo=1,for_get=0;
    String cap_s; 
    String cap_arr[]={"qGphJ","ReCAPtCbA","HHPTUT","WGMEE7XH","vp8ps"};
    String buff_arr[]={"buffera1.jpg","buffera2.jpg","buffera3.jpg","buffera4.jpg"};

    Gt_dt ob_gt=new Gt_dt();
    ///////////////////////////////////////////////////////////////////
    public  void graphi()
    {
        //b.setLayout(new GridLayout(3,4,5,10));

        //p.setBackground(Color.YELLOW);
        JFrame f=new JFrame();
        Container d=f.getContentPane();

        c.insets=new Insets(20,0,20,0);
        c.gridx=0;
        c.gridy=1;
        simplify ob91=new simplify();
        //delete ob81=new delete();
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(100,125);
        f.setVisible(true);
        f.setTitle("Scientific Calculator");
        ImageIcon i=new ImageIcon(getClass().getResource("500.jpg")); 
        ImageIcon i1=new ImageIcon(getClass().getResource("#capcha_3.jpg")); 
        ImageIcon i2=new ImageIcon(getClass().getResource("#alexa_cloc.jpg")); 
        ImageIcon i3=new ImageIcon(getClass().getResource("#alexa_clo.jpg")); 
        ImageIcon i4=new ImageIcon(getClass().getResource("Exit.jpg")); 

        ImageIcon cap_i1=new ImageIcon(getClass().getResource("#num_0.jpg")); 
        ImageIcon cap_i2=new ImageIcon(getClass().getResource("#num_0.jpg")); 
        ImageIcon cap_i3=new ImageIcon(getClass().getResource("#name_colon.jpg")); 
        ImageIcon cap_i4=new ImageIcon(getClass().getResource("#num_0.jpg")); 
        ImageIcon cap_i5=new ImageIcon(getClass().getResource("#num_0.jpg")); 

        ImageIcon buff_i=new ImageIcon(getClass().getResource("buffera1.jpg")); 

        JLabel l=new JLabel(i);

        JLabel l_i2=new JLabel(i2);
        JLabel l_i3=new JLabel(i3);
        JLabel l_i4=new JLabel(i4);
        //JLabel l=new JLabel("Hi I am Label");
        JLabel l4=new JLabel("User-name");
        JLabel l5=new JLabel("Password");
        JLabel l41=new JLabel("User-name");
        JLabel l51=new JLabel("Password");
        JLabel l6=new JLabel("Captcha : Enter the code below");
        JLabel l50=new JLabel(i1);
        JLabel lspace=new JLabel("                         ");

        JLabel cap_l1=new JLabel(cap_i1);
        JLabel cap_l2=new JLabel(cap_i2);
        JLabel cap_l3=new JLabel(cap_i3);
        JLabel cap_l4=new JLabel(cap_i4);
        JLabel cap_l5=new JLabel(cap_i5);

        JLabel buff_l=new JLabel(buff_i);

        JButton b=new JButton(" Login ");
        JButton b_exit=new JButton(" Quit ");
        JButton b_forget=new JButton("Forget password");
        JTextField t=new JTextField(5);
        JTextField t5=new JTextField(5);
        JTextField t6=new JTextField(5);
        //ImageIcon i=new ImageIcon(getClass().getResource("calcu.jpg")); 
        JLabel l1=new JLabel("");

        //setLayout(new FlowLayout());
        //b.addActionListener(new action());
        f.add(p);
        //p.add(l4);
        //p.add(l1);
        //System.out.println("Enter no. of tickets");
        c.gridx=1;
        c.gridy=2;
        p.add(t,c);
        //p.add(l);
        p.add(l3);
        JButton bt1=new JButton("1");JButton bt2=new JButton("2");JButton bt3=new JButton("3");JButton bt4=new JButton("4");JButton bt5=new JButton("5");
        JButton bt6=new JButton("6");JButton bt7=new JButton("7");JButton bt8=new JButton("8");JButton bt9=new JButton("9");JButton bt0=new JButton("0");
        JButton btplus=new JButton("+");JButton btminus=new JButton("-");JButton btmul=new JButton("*");JButton btdiv=new JButton("/");
        JButton btsin=new JButton("sin");JButton btcos=new JButton("cos");JButton bttan=new JButton("tan");JButton btlog=new JButton("log");
        JButton btpow=new JButton("^");JButton bte=new JButton("e");JButton btmod=new JButton("|x|");JButton btdel=new JButton(" ◄ ");
        ///////////////////////////////
        String[] items={"not agree","I agree"};
        JComboBox k=new JComboBox(items);
        //p.add(k);

        //String s1="";
        //String s30="";
        /*
        s3=t1.getText();
        int ln3=s3.length();
        for(int i3=0;i3<ln3;i3++)
        {
        //c3=s3.charAt(i3);
        s30=s30+'*';
        }
        t1.setText(s30);
        s30="";
         */
        ////////////////////////
        fronti ob77=new fronti();
        boolean flgg=false;
        //while(flgg==false)
        //{  
        CalPlay ob1=new CalPlay();
        ob1.formai();
        ob1.formal();
        int s19=0,m19=0,h19=0;
        String d19="",s190="",m190="",h190="";
        d19=ob1.s1;

        s19=ob1.n1;
        m19=ob1.i1;
        h19=ob1.h1;
        //System.out.println("s1 m1 h1 in int "+s1+":"+m1+":"+h1+"\n\n" );
        s190=Integer.toString(s19);
        m190=Integer.toString(m19);
        h190=Integer.toString(h19);
        if(m19>=10)
        {   
            s190=h190+":"+m190;
            if(h19>=10)
            {    
                cap_i1=new ImageIcon(getClass().getResource("#num_"+h190.charAt(0)+".jpg"));         cap_l1.setIcon(cap_i1);
                cap_i2=new ImageIcon(getClass().getResource("#num_"+h190.charAt(1)+".jpg"));         cap_l2.setIcon(cap_i2);
            }
            else
            {
                cap_i1=new ImageIcon(getClass().getResource("#num_0.jpg"));                         cap_l1.setIcon(cap_i1);
                cap_i2=new ImageIcon(getClass().getResource("#num_"+h190.charAt(0)+".jpg"));        cap_l2.setIcon(cap_i2);
            }
            cap_i4=new ImageIcon(getClass().getResource("#num_"+m190.charAt(0)+".jpg"));            cap_l4.setIcon(cap_i4);
            cap_i5=new ImageIcon(getClass().getResource("#num_"+m190.charAt(1)+".jpg"));            cap_l5.setIcon(cap_i5);

        }  
        else
        {
            s190=h190+":0"+m190;    
            if(h19>=10)
            {    
                cap_i1=new ImageIcon(getClass().getResource("#num_"+h190.charAt(0)+".jpg"));        cap_l1.setIcon(cap_i1);
                cap_i2=new ImageIcon(getClass().getResource("#num_"+h190.charAt(1)+".jpg"));        cap_l2.setIcon(cap_i2);
            }
            else
            {
                cap_i1=new ImageIcon(getClass().getResource("#num_0.jpg"));                         cap_l1.setIcon(cap_i1);
                cap_i2=new ImageIcon(getClass().getResource("#num_"+h190.charAt(0)+".jpg"));        cap_l2.setIcon(cap_i2);
            }
            cap_i4=new ImageIcon(getClass().getResource("#num_0.jpg"));                             cap_l4.setIcon(cap_i4);
            cap_i5=new ImageIcon(getClass().getResource("#num_"+m190.charAt(0)+".jpg"));            cap_l5.setIcon(cap_i5);

        }
        flgg=ob77.flag;
        l41.setText(d19);
        l51.setText(s190);
        //}
        /////////////////////////
        JButton cap_b1=new JButton("<=");
        JButton cap_b2=new JButton("=>");
        JButton b1=new JButton("New User");
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();         s2=s2.toUpperCase();
                    s3=t1.getText(); //   System.out.println("s3 is "+s3);
                    s15=t5.getText();
                    /*
                    if(s2.equals(us))
                    {
                    if(s3.equals(pa))
                    {
                    flag=true;
                    }   
                    else
                    JOptionPane.showMessageDialog(null,"Wrong password");
                    }
                    else
                    JOptionPane.showMessageDialog(null,"Wrong username");
                     */ //System.out.println("s3 is "+s3);
                    boolean flag1=false;
                    //flag=false;
                    file_output2 ob_fr=new file_output2();String v=""; v=s3;//System.out.println("s3 is "+s3);
                    ob_fr.output("logkey",2); //System.out.println("s3 is "+s3);
                    int nout=ob_fr.n; //System.out.println("v is "+v);
                    String aout[]=new String[100]; //System.out.println("s3 is "+s3);
                    int iout=0;
                    for(iout=0;iout<nout;iout++)
                        aout[iout]="";
                    for(iout=0;iout<nout;iout++)
                        aout[iout]=ob_fr.a[iout];
                         //System.out.println("s3 is "+s3);
                    for(iout=0;iout<nout;iout=iout+2)
                    {
                         //System.out.println("s3 is "+s3);
                        if(aout[iout].equals(s2))
                            flag=true;
                        //System.out.println("flag at s2 "+s2+" checking uesrname "+aout[iout]+" checking is "+flag);
                        // System.out.println("s3 is "+s3);
                    }
                     //System.out.println("s3 is "+s3);
                    if(flag==true)
                        for(iout=1;iout<nout;iout=iout+2)
                        {
                            //System.out.println("s3 is "+s3);
                            if(aout[iout].equals(v))
                                flag1=true;
                            //System.out.println("flag at s3 "+v+" checking password "+aout[iout]+" checking is "+flag1);
                        }
                    else

                        JOptionPane.showMessageDialog(null,"Wrong username");
                    if(flag1==false)

                        JOptionPane.showMessageDialog(null,"Wrong password");
                    else if(flag==true && flag1==true)
                    {
                        //System.out.println("use and pass agreed");
                        s5=k.getSelectedItem().toString();
                        //l.setText(s);
                        if(s5.equals(items[1]))    
                        {
                            //System.out.println("terms agreed");
                            if(s15.equals(cap_arr[cap_aloo-1]))
                            {
                                //System.out.println("cap equals");
                                if(flag==true)
                                {   
                                    JOptionPane.showMessageDialog(null,"Login successful");
                                    if(for_get==1)
                                        fogt();
                                    flag10=true;
                                    //System.out.println("login successful");
                                }  
                                //flag=false;
                            }
                            else
                                JOptionPane.showMessageDialog(null,"Captcha wrong");
                        }
                        else
                            JOptionPane.showMessageDialog(null,"You should agree with terms ");
                    }
                    //System.out.println("t1 is"+t1);
                    //t1.setText("*****");                    
                    //System.out.println("t1 is"+t1);
                    /*
                    d12=ob91.simple(s2); 
                    s1=Double.toString(d12);
                    JOptionPane.showMessageDialog(null,s1);
                    t.setText(s1);
                    s=s1;
                     */
                }

            });
        b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    /*
                    String s=k.getSelectedItem().toString();
                    l.setText(s);
                     */
                    JOptionPane.showMessageDialog(null,"Default : \n\nUsername  :    GUEST\n\nPASSWORD  :   1234\n");
                }

            });
        bt1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"1";t.setText(s);
                }

            });

        btplus.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    s2=t.getText();s=s2;s=s+"+";t.setText(s);
                }

            });

        cap_b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    //s2=t.getText();s=s2;s=s+"1";t.setText(s);
                    if(cap_aloo==5)
                    {cap_aloo=1;}
                    else
                        ++cap_aloo;
                    //aloo=1;
                    cap_s="";
                    cap_s="#capcha_"+Integer.toString(cap_aloo)+".jpg";
                    ImageIcon i=new ImageIcon(getClass().getResource(cap_s)); 
                    l50.setIcon(i);
                }

            });

        cap_b2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    //s2=t.getText();s=s2;s=s+"1";t.setText(s);
                    if(cap_aloo==1)
                    {cap_aloo=5;}
                    else
                        --cap_aloo;
                    //aloo=1;
                    cap_s="";
                    cap_s="#capcha_"+Integer.toString(cap_aloo)+".jpg";
                    ImageIcon i=new ImageIcon(getClass().getResource(cap_s)); 
                    l50.setIcon(i);
                }

            }); 

        b_exit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    f.dispose();
                    //System.exit(0);
                }

            }); 

        b_forget.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(null,"Default : \n\nUsername  :    GUEST\n\nPASSWORD  :   1234\n");
                    for_get=1;
                }

            }); 

        c.gridx=8;
        c.gridy=1;
        p.add(l,c);

        c.gridy=2;
        p.add(b1,c);

        c.gridx=9;
        c.gridy=1;
        p.add(lspace,c);
        c.gridx=10;
        c.gridy=1;
        p.add(cap_l1,c);
        ++c.gridx;p.add(cap_l2,c);
        ++c.gridx;p.add(cap_l3,c);
        ++c.gridx;p.add(cap_l4,c);
        ++c.gridx;p.add(cap_l5,c);

        c.gridx=13;
        c.gridy=2;
        p.add(l_i4,c);
        c.gridx=14;
        c.gridy=2;
        b_exit.setFont(new java.awt.Font("Tahoma", 0, 46)); b_exit.setBackground(Color.RED);  b_exit.setForeground(Color.WHITE);
        p.add(b_exit,c);

        c.gridx=11;
        c.gridy=6;
        p.add(buff_l,c);

        c.gridx=7;
        c.gridy=3;
        p.add(l4,c);++c.gridx;p.add(t,c);//++c.gridx;p.add(bt3,c);++c.gridy;c.gridx=0;
        c.gridx=7;
        c.gridy=4; 
        //p.add(l5,c);
        ++c.gridx;p.add(t1,c);//++c.gridx;p.add(bt6,c);++c.gridy;c.gridx=0;
        c.gridx=12;
        c.gridy=5; 
        p.add(k,c);
        c.gridx=10;
        c.gridy=7;
        b.setFont(new java.awt.Font("Tahoma", 0, 25)); b.setBackground(Color.GREEN);  b.setForeground(Color.WHITE);
        p.add(b,c);
        c.gridx=8;
        c.gridy=5;
        p.add(l6,c);

        c.gridx=7;
        c.gridy=5;
        p.add(b_forget,c);

        c.gridx=7;
        c.gridy=6;
        //p.add(cap_b1,c);

        c.gridx=8;
        c.gridy=6;
        p.add(l50,c);

        c.gridx=9;
        c.gridy=6;
        //p.add(cap_b2,c);

        c.gridx=8;
        c.gridy=7;
        p.add(t5,c);

        c.gridx=10;
        c.gridy=2; 
        p.add(l41,c);
        c.gridx=10;
        c.gridy=3;
        p.add(l51,c);
        // c.gridx=7;
        Checkbox checkbox1 = new Checkbox(" Allow acess data");  
        checkbox1.setBounds(100,100, 50,50);  
        Checkbox checkbox2 = new Checkbox(" Allow store data", true);  
        checkbox2.setBounds(100,150, 50,50);  

        // private static Dialog d; 
        /*
        d = new Dialog(f , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );  
        Button b15 = new Button ("OK");  
        b.addActionListener ( new ActionListener()  
        {  
        public void actionPerformed( ActionEvent e )  
        {  
        //DialogExample.d.setVisible(false);  
        }  
        });  
        d.add( new Label ("Click button to continue."));  
        d.add(b15);   
        d.setSize(300,300);    
        d.setVisible(true);  
         */
        //if(checkbox1==true)
        //JOptionPane.showMessageDialog(null,"Good");

        checkbox2.addItemListener(new ItemListener() {  
                public void itemStateChanged(ItemEvent e) {               

                    if(e.getStateChange()==1)  
                        JOptionPane.showMessageDialog(null,"Your information will be encrypted");
                }  
            });  

        c.gridx=12;
        c.gridy=6; 
        p.add(checkbox1,c);  
        c.gridx=12;
        c.gridy=7; 
        p.add(checkbox2,c);  
        c.gridx=14;
        c.gridy=6; 
        p.add(l_i2,c);  
        c.gridx=14;
        c.gridy=8; 
        //p.add(l_i3,c);
        /*
        /*
        p.add(bt7,c);++c.gridx;p.add(bt8,c);++c.gridx;p.add(bt9,c);++c.gridy;c.gridx=1;
        p.add(bt0,c);
        c.gridx=4;
        c.gridy=4;
        p.add(btplus,c);++c.gridx;p.add(btminus,c);++c.gridx;p.add(btmul,c);++c.gridx;p.add(btdiv,c);
        c.gridx=4;
        c.gridy=5;
        p.add(btsin,c);++c.gridx;p.add(btcos,c);++c.gridx;p.add(bttan,c);++c.gridx;p.add(btlog,c);
        c.gridx=4;
        c.gridy=6;
        p.add(btpow,c);++c.gridx;p.add(bte,c);++c.gridx;p.add(btmod,c);++c.gridx;p.add(btdel,c);
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("file");
        mb.add(file);
        JMenu edit=new JMenu("edit");
        mb.add(edit);
         */
        //p.add(mb);
        int buff_c=0;
        boolean flg=false;
        int counter=0;
        while(flg==false)
        {            
            for(int j=99999999;j>=0;j--)
            {
            }
            counter++;
            if(counter<=150)
            {
                if(cap_aloo==1)
                {cap_aloo=5;}
                else
                    --cap_aloo;
                //aloo=1;
                cap_s="";
                cap_s="#capcha_"+Integer.toString(cap_aloo)+".jpg";
                i=new ImageIcon(getClass().getResource(cap_s)); 
                l50.setIcon(i);  
            }
            buff_i=new ImageIcon(getClass().getResource("#blank.jpg")); // buff_i=new ImageIcon(getClass().getResource(buff_arr[buff_c])); 
            buff_l.setIcon(buff_i);
            ++buff_c;
            if(buff_c==4)
                buff_c=0;

            flg=flag;        
            String s30="";
            s3=t.getText();
            //int kn=s3.indexOf();

            //System.out.println("s3 is "+s3);
            ob_gt.detail(s3);
            int can_id=ob_gt.cn_id;
            if(ob_gt.flag==true)
            {
                //System.out.println("done , cn_id is "+can_id);
                String can_photo="#alpha_"+can_id+".jpg";
                ImageIcon can_i2=new ImageIcon(getClass().getResource(can_photo)); 
                l.setIcon(can_i2);
            }
            else
            {

                ImageIcon can_i2=new ImageIcon(getClass().getResource("500.jpg")); 
                l.setIcon(can_i2);

            }
            /*
            int ln3=s3.length();
            for(int i3=0;i3<ln3;i3++)
            {
            //c3=s3.charAt(i3);
            s30=s30+'*';
            }
            System.out.println("s30 is"+s30);
            t1.setText(s30);
            s30="";
             */

            ob1.formai();
            ob1.formal();

            d19=ob1.s1;

            s19=ob1.n1;
            m19=ob1.i1;
            h19=ob1.h1;
            //System.out.println("s1 m1 h1 in int "+s1+":"+m1+":"+h1+"\n\n" );
            s190=Integer.toString(s19);
            m190=Integer.toString(m19);
            h190=Integer.toString(h19);
            if(m19>=10)
            {   
                s190=h190+":"+m190;
                if(h19>=10)
                {    
                    cap_i1=new ImageIcon(getClass().getResource("#num_"+h190.charAt(0)+".jpg"));         cap_l1.setIcon(cap_i1);
                    cap_i2=new ImageIcon(getClass().getResource("#num_"+h190.charAt(1)+".jpg"));         cap_l2.setIcon(cap_i2);
                }
                else
                {
                    cap_i1=new ImageIcon(getClass().getResource("#num_0.jpg"));                         cap_l1.setIcon(cap_i1);
                    cap_i2=new ImageIcon(getClass().getResource("#num_"+h190.charAt(0)+".jpg"));        cap_l2.setIcon(cap_i2);
                }
                cap_i4=new ImageIcon(getClass().getResource("#num_"+m190.charAt(0)+".jpg"));            cap_l4.setIcon(cap_i4);
                cap_i5=new ImageIcon(getClass().getResource("#num_"+m190.charAt(1)+".jpg"));            cap_l5.setIcon(cap_i5);

            }  
            else
            {
                s190=h190+":0"+m190;    
                if(h19>=10)
                {    
                    cap_i1=new ImageIcon(getClass().getResource("#num_"+h190.charAt(0)+".jpg"));        cap_l1.setIcon(cap_i1);
                    cap_i2=new ImageIcon(getClass().getResource("#num_"+h190.charAt(1)+".jpg"));        cap_l2.setIcon(cap_i2);
                }
                else
                {
                    cap_i1=new ImageIcon(getClass().getResource("#num_0.jpg"));                         cap_l1.setIcon(cap_i1);
                    cap_i2=new ImageIcon(getClass().getResource("#num_"+h190.charAt(0)+".jpg"));        cap_l2.setIcon(cap_i2);
                }
                cap_i4=new ImageIcon(getClass().getResource("#num_0.jpg"));                             cap_l4.setIcon(cap_i4);
                cap_i5=new ImageIcon(getClass().getResource("#num_"+m190.charAt(0)+".jpg"));            cap_l5.setIcon(cap_i5);

            }
        }
    }

    public static void stn()
    {

        fronti ob77=new fronti();
        ob77.graphi();
        /*
        boolean flg=false;
        while(flg==false)
        {            
        for(int j=999999999;j>=0;j--)
        {
        }
        flg=ob77.flag;        
        String s30="";
        s3=t1.getText();
        System.out.println("t1 is"+t1);
        int ln3=s3.length();
        for(int i3=0;i3<ln3;i3++)
        {
        //c3=s3.charAt(i3);
        s30=s30+'*';
        }
        System.out.println("s30 is"+s30);
        t1.setText(s30);
        s30="";
         */
    }    

    public void fogt()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the user ");
        String un=sc.nextLine();un=un.toUpperCase();
        System.out.println("Admin Credential required ****************************** ");
        String kn=sc.nextLine();kn=kn.toUpperCase();
        System.out.println("********Encrypted passcode*********************** ");
        String kp=sc.nextLine();

        ////////////////////////////////////////////////////////////////////////////////////
        boolean flag1=false;
        file_output obfp=new file_output();
        obfp.output("logkey",2);
        int nout=obfp.n;
        String aout[]=new String[100];
        int iout=0;
        for(iout=0;iout<nout;iout++)
            aout[iout]="null,0";
        for(iout=0;iout<nout;iout++)
        {
            System.out.print("");
            //System.out.println("value is "+obfp.a[iout]);
        }
        for(iout=0;iout<nout;iout++)
        {
            //System.out.println("Storing value is "+obfp.a[iout]);
            aout[iout]=obfp.a[iout];
            //System.out.println("Stored value is "+aout[iout]);
        }
        System.out.println("\n\n\n");
        for(iout=0;iout<nout;iout=iout+2)
        {
            if(aout[iout].equals(kn))
                flag=true;
            System.out.println("flag at checking uesrname "+aout[iout]+" checking is "+flag);
        }
        System.out.println("\n\n\n");
        if(flag==true)
        {
            for(iout=1;iout<nout;iout=iout+2)
            {
                if(aout[iout].equals(kp))
                    flag1=true;
                System.out.println("flag at checking password ************ checking is "+flag1);
                //System.out.println("flag at checking password "+aout[iout]+" checking is "+flag1);
            }
        }

        if(flag==true&&flag1==true)
        {
            int index=0;boolean fg=false;
            for(iout=0;iout<nout;iout=iout+2)
            {
                if(aout[iout].equals(un))
                {    
                    fg=true;
                    index=iout;
                    System.out.println("\n-------------------------------------------------------------------------------");
                    System.out.println("\n\nYour password is "+aout[index+1]+"\n\n");
                    System.out.println("\n--------------------------------------------------------------------------------\n\n");
                }
            }
            if(fg==false)
                System.out.println("\n\nNo such user found !\n\n");
        }
        else
            System.out.println("\n\nUser Credential failed !\n\n");
        for(int djn=12;djn>=0;djn--)
            for(int dj=600000000;dj>=0;dj--)
            {

            }
        System.out.println("\n\nYou are directed to the main function , Alexa");
        System.out.println("You can create a new account laterwards ..................\n\n\n");
        for(int djn=12;djn>=0;djn--)
            for(int dj=600000000;dj>=0;dj--)
            {
            }
        flag10=true;
    }
}

