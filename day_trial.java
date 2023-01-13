
import  Calculator.*;
import Array.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class day_trial
{
    GridBagConstraints c=new GridBagConstraints();
    JPanel p=new JPanel(new GridBagLayout());

    JLabel l1=new JLabel("Saturday");
    JLabel l2=new JLabel("Sunday");
    JLabel l3=new JLabel("Monday");
    JLabel l4=new JLabel("Tuesday");
    JLabel l5=new JLabel("Wednesday");
    JLabel l6=new JLabel("Thursday");
    JLabel l7=new JLabel("Friday");

    JLabel sd[]=new JLabel[42];
    static int i=0,xx=2;

    //JLabel l3=new JLabel();
    static int da[][]=new int[6][7];
    Calender ob=new Calender();
    String s="",s1="",s2="",s5="",s15="";
    double d12=0.0;
    String s3="";
    public   boolean flag=false;
    JTextField t1=new JTextField(15);    
    String us="Keshav",pa="8445",cap="qGphJ";
    public  void days()
    {
        //b.setLayout(new GridLayout(3,4,5,10));

        //p.setBackground(Color.YELLOW);
        JFrame f=new JFrame();
        Container d=f.getContentPane();

        c.insets=new Insets(20,20,20,20);
        c.gridx=0;
        c.gridy=1;
        simplify ob91=new simplify();
        //delete ob81=new delete();
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,125);
        f.setVisible(true);
        f.setTitle("Scientific Calculator");
        //ImageIcon i=new ImageIcon(getClass().getResource("500.jpg")); 
        ImageIcon i1=new ImageIcon(getClass().getResource("captcha.jpg")); 
        JLabel l=new JLabel("Day of the respective date");
        //JLabel l=new JLabel("Hi I am Label");
        // JLabel l4=new JLabel("User-name");
        //JLabel l5=new JLabel("Password");
        JLabel l41=new JLabel("User-name");
        JLabel l51=new JLabel("Password");
        //JLabel l6=new JLabel("Captcha : Enter the code below");
        JLabel l50=new JLabel(i1);
        JButton b=new JButton(" Enter ");

        // Button b=new Button("Button 1");     
        // b.setBounds(150,300,200,150);    
        //b.setBackground(Color.yellow);  

        JTextField t=new JTextField(15);
        JTextField t5=new JTextField(15);
        //ImageIcon i=new ImageIcon(getClass().getResource("calcu.jpg")); 
        //JLabel l1=new JLabel("");

        //setLayout(new FlowLayout());
        //b.addActionListener(new action());
        f.add(p);

        c.gridx=1;
        c.gridy=2;

        String year[]=new String[101];
        String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] day=new String[31];
        int x=0,j1=0;
        for(j1=2000;j1<=2100;j1++)
        {
            year[x]=Integer.toString(j1);
            x++;
        }
        x=0;
        for(j1=1;j1<=31;j1++)
        {
            day[x]=Integer.toString(j1);
            x++;
        }
        JComboBox ky=new JComboBox(year);
        JComboBox km=new JComboBox(month);
        JComboBox kd=new JComboBox(day);

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
        //front ob77=new front();
        //boolean flgg=false;
        //while(flgg==false)
        //{  
        CalPlay ob1=new CalPlay();
        ob1.formai();
        ob1.formal();
        int s19=0,m19=0,h19=0;
        String d19="",s1900="",m190="",h190="";
        d19=ob1.s1;

        s19=ob1.n1;
        m19=ob1.i1;
        h19=ob1.h1;
        //System.out.println("s1 m1 h1 in int "+s1+":"+m1+":"+h1+"\n\n" );
        s1900=Integer.toString(s19);
        m190=Integer.toString(m19);
        h190=Integer.toString(h19);
        if(m19>=10)
            s1900=h190+":"+m190;    
        else
            s1900=h190+":0"+m190;    
        //flgg=ob77.flag;
        l41.setText(d19);
        l51.setText(s1900);
        //}
        /////////////////////////
        JButton bt1=new JButton("Test1");
        JButton bt2=new JButton("Test2");
        /*
        b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
        s2=t.getText();
        s3=t1.getText();
        s15=t5.getText();
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
        s5=ky.getSelectedItem().toString();
        //l.setText(s);
        if(s5.equals(year[1]))    
        {
        if(s15.equals(cap))
        {
        if(flag==true)
        JOptionPane.showMessageDialog(null,"Login successful");
        flag=false;
        }
        else
        JOptionPane.showMessageDialog(null,"Captcha wrong");
        }
        else
        JOptionPane.showMessageDialog(null,"You should agree with terms ");

        }

        });
         */
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    String s1=ky.getSelectedItem().toString();
                    String s2=km.getSelectedItem().toString();
                    String s3=kd.getSelectedItem().toString();
                    int is1=Integer.valueOf(s1);
                    int is2=0;
                    for(int j1=0;j1<12;j1++)
                        if(s2.equals(month[j1]))
                            is2=j1;

                    int is3=Integer.valueOf(s3);
                    ob.day(is1,is2,is3);
                    s1=ob.s; 
                    l.setText(s1);
                }

            });
            bt2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    day_trial ob3=new day_trial();
                    --xx;
                    if(xx==0)
                    xx=12;
                    ob3.man(2019,xx);
                    int x=0,x1=0,x2=0;
                    for(x=0;x<42;x++)
                    {

                        if(x2==7)
                        {
                            x2=0;
                            ++x1;
                        }
                        sd[x].setText(Integer.toString(da[x1][x2]));
                        ++x2;
                    }
                }

            });
        bt1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    day_trial ob3=new day_trial();
                    ++xx;
                    if(xx==12)
                    xx=0;
                    ob3.man(2019,xx);
                    int x=0,x1=0,x2=0;
                    for(x=0;x<42;x++)
                    {

                        if(x2==7)
                        {
                            x2=0;
                            ++x1;
                        }
                        sd[x].setText(Integer.toString(da[x1][x2]));
                        ++x2;
                    }
                }

            });
        /*
        btplus.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
        s2=t.getText();s=s2;s=s+"+";t.setText(s);
        }

        });
         */          

        c.gridx=1;
        c.gridy=5; 
        //p.add(ky,c);
        c.gridx=2;
        c.gridy=5; 
        //p.add(km,c);
        c.gridx=3;
        c.gridy=5; 
        //p.add(kd,c);
        c.gridx=5;
        c.gridy=7; 
        //p.add(b,c);
        c.gridx=7;
        c.gridy=0; 
        p.add(bt1,c);

          c.gridx=-1;
        c.gridy=0; 
        p.add(bt1,c);
        
        c.gridx=5;
        c.gridy=1; 
        p.add(l1,c);
        c.gridx=6;
        c.gridy=1; 
        p.add(l2,c);
        c.gridx=0;
        c.gridy=1; 
        p.add(l3,c);
        c.gridx=1;
        c.gridy=1; 
        p.add(l4,c);
        c.gridx=2;
        c.gridy=1; 
        p.add(l5,c);
        c.gridx=3;
        c.gridy=1; 
        p.add(l6,c);
        c.gridx=4;
        c.gridy=1; 
        p.add(l7,c);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        c.gridx=0;
        c.gridy=2; 
        day_trial ob3=new day_trial();
        ob3.man(2019,2);
        /*
        for(i=0;i<6;i++)
        {    
        for(j=0;j<7;j++)
        {
        da[i][j]=new int[6][7];
        }
        }
         */
        JLabel s20=new JLabel(Integer.toString(da[0][0]));p.add(s20,c);c.gridx++;sd[i++]=s20;
        JLabel s30=new JLabel(Integer.toString(da[0][1]));p.add(s30,c);c.gridx++;sd[i++]=s30; 
        JLabel s40=new JLabel(Integer.toString(da[0][2]));p.add(s40,c);c.gridx++; sd[i++]=s40;
        JLabel s50=new JLabel(Integer.toString(da[0][3]));p.add(s50,c);c.gridx++; sd[i++]=s50;
        JLabel s60=new JLabel(Integer.toString(da[0][4]));p.add(s60,c);c.gridx++; sd[i++]=s60;
        JLabel s70=new JLabel(Integer.toString(da[0][5]));p.add(s70,c);c.gridx++; sd[i++]=s70;
        JLabel s80=new JLabel(Integer.toString(da[0][6]));p.add(s80,c);c.gridx++; c.gridx=0;c.gridy++;sd[i++]=s80;  
        JLabel s90=new JLabel(Integer.toString(da[1][0]));p.add(s90,c);c.gridx++;sd[i++]=s90;
        JLabel s100=new JLabel(Integer.toString(da[1][1]));p.add(s100,c);c.gridx++; sd[i++]=s100;
        JLabel s110=new JLabel(Integer.toString(da[1][2]));p.add(s110,c);c.gridx++; sd[i++]=s110;
        JLabel s120=new JLabel(Integer.toString(da[1][3]));p.add(s120,c);c.gridx++;sd[i++]=s120;
        JLabel s130=new JLabel(Integer.toString(da[1][4]));p.add(s130,c);c.gridx++;sd[i++]=s130;
        JLabel s140=new JLabel(Integer.toString(da[1][5]));p.add(s140,c);c.gridx++; sd[i++]=s140;
        JLabel s150=new JLabel(Integer.toString(da[1][6]));p.add(s150,c);c.gridx++; c.gridx=0;c.gridy++;sd[i++]=s150;   
        JLabel s160=new JLabel(Integer.toString(da[2][0]));p.add(s160,c);c.gridx++; sd[i++]=s160;
        JLabel s170=new JLabel(Integer.toString(da[2][1]));p.add(s170,c);c.gridx++; sd[i++]=s170;
        JLabel s180=new JLabel(Integer.toString(da[2][2]));p.add(s180,c);c.gridx++;sd[i++]=s180;
        JLabel s190=new JLabel(Integer.toString(da[2][3]));p.add(s190,c);c.gridx++;sd[i++]=s190;
        JLabel s200=new JLabel(Integer.toString(da[2][4]));p.add(s200,c);c.gridx++;sd[i++]=s200;
        JLabel s210=new JLabel(Integer.toString(da[2][5]));p.add(s210,c);c.gridx++;sd[i++]=s210;
        JLabel s220=new JLabel(Integer.toString(da[2][6]));p.add(s220,c);c.gridx++; c.gridx=0;c.gridy++;sd[i++]=s220;  
        JLabel s230=new JLabel(Integer.toString(da[3][0]));p.add(s230,c);c.gridx++;sd[i++]=s230;
        JLabel s240=new JLabel(Integer.toString(da[3][1]));p.add(s240,c);c.gridx++;sd[i++]=s240;
        JLabel s250=new JLabel(Integer.toString(da[3][2]));p.add(s250,c);c.gridx++;sd[i++]=s250;
        JLabel s260=new JLabel(Integer.toString(da[3][3]));p.add(s260,c);c.gridx++;sd[i++]=s260;
        JLabel s270=new JLabel(Integer.toString(da[3][4]));p.add(s270,c);c.gridx++;sd[i++]=s270;
        JLabel s280=new JLabel(Integer.toString(da[3][5]));p.add(s280,c);c.gridx++;sd[i++]=s280;
        JLabel s290=new JLabel(Integer.toString(da[3][6]));p.add(s290,c);c.gridx++; c.gridx=0;c.gridy++;sd[i++]=s290;  
        JLabel s300=new JLabel(Integer.toString(da[4][0]));p.add(s300,c);c.gridx++;sd[i++]=s300;
        JLabel s310=new JLabel(Integer.toString(da[4][1]));p.add(s310,c);c.gridx++;sd[i++]=s310;
        JLabel s320=new JLabel(Integer.toString(da[4][2]));p.add(s320,c);c.gridx++;sd[i++]=s320;
        JLabel s330=new JLabel(Integer.toString(da[4][3]));p.add(s330,c);c.gridx++;sd[i++]=s330;
        JLabel s340=new JLabel(Integer.toString(da[4][4]));p.add(s340,c);c.gridx++;sd[i++]=s340;
        JLabel s350=new JLabel(Integer.toString(da[4][5]));p.add(s350,c);c.gridx++;sd[i++]=s350;
        JLabel s360=new JLabel(Integer.toString(da[4][6]));p.add(s360,c);c.gridx++; c.gridx=0;c.gridy++;sd[i++]=s360;  
        JLabel s370=new JLabel(Integer.toString(da[5][0]));p.add(s370,c);c.gridx++;sd[i++]=s370;
        JLabel s380=new JLabel(Integer.toString(da[5][1]));p.add(s380,c);c.gridx++;sd[i++]=s380;
        JLabel s390=new JLabel(Integer.toString(da[5][2]));p.add(s390,c);c.gridx++;sd[i++]=s390;
        JLabel s400=new JLabel(Integer.toString(da[5][3]));p.add(s400,c);c.gridx++;sd[i++]=s400;
        JLabel s410=new JLabel(Integer.toString(da[5][4]));p.add(s410,c);c.gridx++;sd[i++]=s410;
        JLabel s420=new JLabel(Integer.toString(da[5][5]));p.add(s420,c);c.gridx++;sd[i++]=s420;
        JLabel s430=new JLabel(Integer.toString(da[5][6]));p.add(s430,c);c.gridx++; c.gridx=0;c.gridy++;sd[i++]=s430;

        //sd[]={s20,s30,s40,s50,s60,s70,s80,s90,s100,s110,s120,130,s140,s150,s160,s170,s180,s190,s200,s210,s220,s230,s240,s250,s260,s270,s280,s290,s300,s310,s320,s330,s340,s350,s360,s370,s380,s390,s400,s410,s420,s430};
        /*
        JLabel s440=new JLabel(Integer.toString(da[6][0]));p.add(s370,c);c.gridx++;
        JLabel s450=new JLabel(Integer.toString(da[6][1]));p.add(s380,c);c.gridx++;
        JLabel s460=new JLabel(Integer.toString(da[6][2]));p.add(s390,c);c.gridx++;
        JLabel s470=new JLabel(Integer.toString(da[6][3]));p.add(s400,c);c.gridx++;
        JLabel s480=new JLabel(Integer.toString(da[6][4]));p.add(s410,c);c.gridx++;
        JLabel s490=new JLabel(Integer.toString(da[6][5]));p.add(s420,c);c.gridx++;
        JLabel s500=new JLabel(Integer.toString(da[6][6]));p.add(s430,c);c.gridx++; c.gridx=0;c.gridy++;  
         */
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

    public static void man(int i1,int i2)
    {
        Calender ob1=new Calender();
        //int i1=2019,i2=2;
        int i3=2;
        int i=0,h=0,j=0;
        String s1="";

        for(i=0;i<6;i++)
            for(j=0;j<7;j++)

                da[i][j]=0;
        for(i=1;i<=31;i++)
        {
            i3=i;
            ob1.day(i1,i2,i3);
            s1=ob1.s; 

            if(s1=="Monday"){
                da[h][0]=i3;}

            if(s1=="Tuesday"){
                da[h][1]=i3;}

            if(s1=="Wednesday"){
                da[h][2]=i3;}

            if(s1=="Thursday"){
                da[h][3]=i3;}

            if(s1=="Friday"){
                da[h][4]=i3;}

            if(s1=="Saturday"){
                da[h][5]=i3;}

            if(s1=="Sunday"){
                da[h][6]=i3;++h;}
            System.out.println("/////day is "+i3+" from s1 is "+s1 );
        }
        System.out.println("Array is" );
        for(i=0;i<6;i++)
        {    
            for(j=0;j<7;j++)
            {
                if(da[i][j]<10)
                    System.out.print(da[i][j]+"  ");
                else
                    System.out.print(da[i][j]+" ");
            }
            System.out.println();
        }
    }
}
