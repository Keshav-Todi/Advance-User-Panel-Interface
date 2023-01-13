
package Graphics;
import  Calculator.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class user_action
{
    int go=0;
    public void uso()
    {
        dinasour ob=new dinasour();
        GridBagConstraints c=new GridBagConstraints();
        JPanel p=new JPanel(new GridBagLayout());
        JLabel l2=new JLabel();
        JLabel l3=new JLabel();
        p.setBackground(Color.WHITE);
        JFrame f=new JFrame();
        c.insets=new Insets(0,0,0,0);
        c.gridx=-5;
        c.gridy=1;
        f.setSize(200,125);
        f.setVisible(true);
        f.setTitle("Scientific Calculator");
        JLabel l=new JLabel("Hi I am Label");
        JLabel l4=new JLabel("This is a calculator");
        JButton b=new JButton(" = ");
        ImageIcon i1=new ImageIcon(getClass().getResource("action.jpg")); 
        JLabel l1=new JLabel(i1);
        p.add(l1,c);
        ImageIcon i3=new ImageIcon(getClass().getResource("obstacle.jpg")); 

        ImageIcon i2=new ImageIcon(getClass().getResource("background.jpg"));c.gridx++; 
        JLabel l20=new JLabel(i2);p.add(l20,c);c.gridx++; 
        JLabel l30=new JLabel(i2);p.add(l30,c);c.gridx++; 
        JLabel l40=new JLabel(i2);p.add(l40,c);c.gridx++; 
        JLabel l50=new JLabel(i2);p.add(l50,c);c.gridx++; 
        JLabel l60=new JLabel(i2);p.add(l60,c);c.gridx++; 
        JLabel l70=new JLabel(i2);p.add(l70,c);c.gridx++; 
        JLabel l80=new JLabel(i2);p.add(l80,c);c.gridx++;
        JLabel l90=new JLabel(i2);p.add(l90,c);c.gridx++;
        JLabel l100=new JLabel(i2);p.add(l100,c);c.gridx++; 
        JLabel l110=new JLabel(i2);p.add(l110,c);c.gridx++; 
        JLabel l120=new JLabel(i2);p.add(l120,c);c.gridx++;
        JLabel l130=new JLabel(i2);p.add(l130,c);c.gridx++;
        JLabel l140=new JLabel(i2);p.add(l140,c);c.gridx++; 
        JLabel l150=new JLabel(i2);p.add(l150,c);c.gridx++; 
        JLabel l160=new JLabel(i2);p.add(l160,c);c.gridx++; 
        JLabel l170=new JLabel(i2);p.add(l170,c);c.gridx++; 
        JLabel l180=new JLabel(i2);p.add(l180,c);c.gridx++;
        JLabel l190=new JLabel(i2);p.add(l190,c);c.gridx++;
        JLabel l200=new JLabel(i2);p.add(l200,c);c.gridx++;
        JLabel l210=new JLabel(i2);p.add(l210,c);c.gridx++;
        JLabel l220=new JLabel(i2);p.add(l220,c);c.gridx++;
        JLabel l230=new JLabel(i2);p.add(l230,c);c.gridx++;
        JLabel l240=new JLabel(i2);p.add(l240,c);c.gridx++;
        JLabel l250=new JLabel(i2);p.add(l250,c);c.gridx++;
        JLabel l260=new JLabel(i2);p.add(l260,c);c.gridx++;
        JLabel l270=new JLabel(i2);p.add(l270,c);c.gridx++;
        JLabel l280=new JLabel(i2);p.add(l280,c);c.gridx++;
        JLabel l290=new JLabel(i2);p.add(l290,c);c.gridx++;
        JLabel l300=new JLabel(i2);p.add(l300,c);c.gridx++;
        JLabel l310=new JLabel(i2);p.add(l310,c);c.gridx++;
        JLabel l320=new JLabel(i2);p.add(l320,c);c.gridx++;
        JLabel l330=new JLabel(i2);p.add(l330,c);c.gridx++;
        JLabel l340=new JLabel(i2);p.add(l340,c);c.gridx++;
        JLabel l350=new JLabel(i2);p.add(l350,c);c.gridx++;
        JLabel l360=new JLabel(i2);p.add(l360,c);c.gridx++;
        JLabel l370=new JLabel(i2);p.add(l370,c);c.gridx++;
        JLabel l380=new JLabel(i2);p.add(l380,c);c.gridx++;
        JLabel l390=new JLabel(i2);p.add(l390,c);c.gridx++;
        JLabel l400=new JLabel(i2);p.add(l400,c);c.gridx++;
        JLabel l410=new JLabel(i2);p.add(l410,c);c.gridx++;
        JLabel l420=new JLabel(i2);p.add(l420,c);c.gridx++;
        JLabel l430=new JLabel(i2);p.add(l430,c);c.gridx++;
        JLabel l440=new JLabel(i2);p.add(l440,c);c.gridx++;
        JLabel l450=new JLabel(i2);p.add(l450,c);c.gridx++;
        c.gridx=-5;
        c.gridy=0;
        ImageIcon i5=new ImageIcon(getClass().getResource("dinosky.jpg"));
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ImageIcon i4=new ImageIcon(getClass().getResource("sky.jpg")); c.gridx++; 
        JLabel s20=new JLabel(i4);p.add(s20,c);c.gridx++; 
        JLabel s30=new JLabel(i4);p.add(s30,c);c.gridx++; 
        JLabel s40=new JLabel(i4);p.add(s40,c);c.gridx++; 
        JLabel s50=new JLabel(i4);p.add(s50,c);c.gridx++; 
        JLabel s60=new JLabel(i4);p.add(s60,c);c.gridx++; 
        JLabel s70=new JLabel(i4);p.add(s70,c);c.gridx++; 
        JLabel s80=new JLabel(i4);p.add(s80,c);c.gridx++;
        JLabel s90=new JLabel(i4);p.add(s90,c);c.gridx++;
        JLabel s100=new JLabel(i4);p.add(s100,c);c.gridx++; 
        JLabel s110=new JLabel(i4);p.add(s110,c);c.gridx++; 
        JLabel s120=new JLabel(i4);p.add(s120,c);c.gridx++;
        JLabel s130=new JLabel(i4);p.add(s130,c);c.gridx++;
        JLabel s140=new JLabel(i4);p.add(s140,c);c.gridx++; 
        JLabel s150=new JLabel(i4);p.add(s150,c);c.gridx++; 
        JLabel s160=new JLabel(i4);p.add(s160,c);c.gridx++; 
        JLabel s170=new JLabel(i4);p.add(s170,c);c.gridx++; 
        JLabel s180=new JLabel(i4);p.add(s180,c);c.gridx++;
        JLabel s190=new JLabel(i4);p.add(s190,c);c.gridx++;
        JLabel s200=new JLabel(i4);p.add(s200,c);c.gridx++;
        JLabel s210=new JLabel(i4);p.add(s210,c);c.gridx++;
        JLabel s220=new JLabel(i4);p.add(s220,c);c.gridx++;
        JLabel s230=new JLabel(i4);p.add(s230,c);c.gridx++;
        JLabel s240=new JLabel(i4);p.add(s240,c);c.gridx++;
        JLabel s250=new JLabel(i4);p.add(s250,c);c.gridx++;
        JLabel s260=new JLabel(i4);p.add(s260,c);c.gridx++;
        JLabel s270=new JLabel(i4);p.add(s270,c);c.gridx++;
        JLabel s280=new JLabel(i4);p.add(s280,c);c.gridx++;
        JLabel s290=new JLabel(i4);p.add(s290,c);c.gridx++;
        JLabel s300=new JLabel(i4);p.add(s300,c);c.gridx++;
        JLabel s310=new JLabel(i4);p.add(s310,c);c.gridx++;
        JLabel s320=new JLabel(i4);p.add(s320,c);c.gridx++;
        JLabel s330=new JLabel(i4);p.add(s330,c);c.gridx++;
        JLabel s340=new JLabel(i4);p.add(s340,c);c.gridx++;
        JLabel s350=new JLabel(i4);p.add(s350,c);c.gridx++;
        JLabel s360=new JLabel(i4);p.add(s360,c);c.gridx++;
        JLabel s370=new JLabel(i4);p.add(s370,c);c.gridx++;
        JLabel s380=new JLabel(i4);p.add(s380,c);c.gridx++;
        JLabel s390=new JLabel(i4);p.add(s390,c);c.gridx++;
        JLabel s400=new JLabel(i4);p.add(s400,c);c.gridx++;
        JLabel s410=new JLabel(i4);p.add(s410,c);c.gridx++;
        JLabel s420=new JLabel(i4);p.add(s420,c);c.gridx++;
        JLabel s430=new JLabel(i4);p.add(s430,c);c.gridx++;
        JLabel s440=new JLabel(i4);p.add(s440,c);c.gridx++;
        JLabel s450=new JLabel(i4);p.add(s450,c);c.gridx++;
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        p.add(l1,c);
        b.addActionListener(new action());
        f.add(p);
        c.gridx=10;
        c.gridy=2;
        p.add(b,c);
        char a[]=new char[100];
        long j=0;
        int k=0,h=0;
        ob.dino();
        String s=ob.s;
        int ld=0;
        char c2=' ';
        int os[]=new int[200];
        int ot[]=new int[200];
        ld=s.length();
        int z=0;
        for(z=0;z<ld;z++)
        {
            c2=s.charAt(z);
            ot[z]=c2;
            if(c2=='5')
                os[h++]=z;
        }
        z=0;
        ld=ot.length;
        System.out.println(s);
        c.gridx=0;
        c.gridy=1;
        //String lt[]=new String[100];
        String lt[]={"l20","l30","l40","l50","l60","l70","l80","l90"};
        //JLabel ffd[]=new JLabel[100];
        JLabel ffd[]={l20,l30,l40,l50,l60,l70,l80,l90,l100,l110,l120,l130,l140,l150,l160,l170,l180,l190,l200,l210,l220,l230,l240,l250,l260,l270,l280,l290,l300,l310,l320,l330,l340,l350,l360,l370,l380,l390,l400,l410,l420,l430,l440,l450};
        String fd[]={"l110","l30","l130","l40","l50","l160","l170","l180","l190","l200","l210","l220","l230","l240","l250","l260","l270","l280","l290","l300","l310","l320","l330","l340","l350","l360","l370","l380","l390","l400","l410","l420","l430","l440","l450"};
        JLabel gd[]={l110,l30,l130,l40,l50,l160,l170,l180,l190,l200,l210,l220,l230,l240,l250,l260,l270,l280,l290,l300,l310,l320,l330,l340,l350,l360,l370,l380,l390,l400,l410,l420,l430,l440,l450};
        JLabel sd[]={s110,s30,s130,s40,s50,s160,s170,s180,s190,s200,s210,s220,s230,s240,s250,s260,s270,s280,s290,s300,s310,s320,s330,s340,s350,s360,s370,s380,s390,s400,s410,s420,s430,s440,s450};
        int ln=gd.length;
        int lf=ffd.length;
        int x=0;
        z=-5;
        int ca[]=new int[100];
        int cn[]=new int[100];
        for(x=0;x<lf;x++)
            ca[x]=++z;
        for(x=0;x<ln;x++)
        {
            for(z=0;z<lf;z++)
            {
                if(ffd[z]==gd[x])
                    cn[x]=ca[z];
            }

        }
        System.out.println("Before ");
        for(x=0;x<lf;x++)
            System.out.print(", "+ca[x]);
        System.out.println("After ");
        for(x=0;x<ln;x++)
            System.out.print(", "+cn[x]);    
        z=0;
        c.gridy=1;
        //k=1;
        int over=0;
        for(int i=0;i<10000;i++)
        {
            try
            {
            //gd[k].setIcon(i1);
            for(j=1;j<=678888880;j++)
            {
            }

            for(x=0;x<ln;x++)
            {

                sd[x].setIcon(i4);
            }
            b.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e)
                    {
                        go=1;
                    }

                });
            z=0;

            if(go==0)
            {	
                System.out.print("");
                gd[k].setIcon(i1);
            }
            else
            {
                System.out.print("1");
                

                //c.gridx++;
                //p.add(l1,c);
                /*
                if(k==0)
                l20.setIcon(i1);
                if(k==1)
                l30.setIcon(i1);
                if(k==2)
                l40.setIcon(i1);
                if(k==3)
                l50.setIcon(i1);
                if(k==4)
                l60.setIcon(i1);
                if(k==5)
                l70.setIcon(i1);
                if(k==6)
                l80.setIcon(i1);
                if(k==7)
                l90.setIcon(i1);
                if(k==8)
                l100.setIcon(i1);
                if(k==9)
                l110.setIcon(i1);
                 */
                int cx=cn[k];
                c.gridx=cx;
                c.gridy=3;

                //gd[k].setIcon(i1);
                //p.add(gd[k],c);
                sd[k].setIcon(i5);
                /*
                if(k==0)
                l70.setIcon(i1);
                if(k==1)
                l80.setIcon(i1);
                if(k==2)
                l90.setIcon(i1);//
                if(k==3)
                l100.setIcon(i1);
                if(k==4)
                l110.setIcon(i1);
                if(k==5)
                l120.setIcon(i1);//
                if(k==6)
                l130.setIcon(i1);
                if(k==7)
                l40.setIcon(i1);
                if(k==8)
                l160.setIcon(i1);
                if(k==9)
                l170.setIcon(i1);
                if(k==10)
                l180.setIcon(i1);
                if(k==11)
                l190.setIcon(i1);
                if(k==12)
                l200.setIcon(i1);
                if(k==13)
                l210.setIcon(i1);
                if(k==14)
                l220.setIcon(i1);
                if(k==15)
                l230.setIcon(i1);
                if(k==16)
                l240.setIcon(i1);
                if(k==17)
                l250.setIcon(i1);
                if(k==18)
                l260.setIcon(i1);
                if(k==19)
                l270.setIcon(i1);
                if(k==20)
                l280.setIcon(i1);
                if(k==21)
                l290.setIcon(i1);
                if(k==22)
                l300.setIcon(i1);
                if(k==23)
                l310.setIcon(i1);
                if(k==24)
                l320.setIcon(i1);
                if(k==25)
                l330.setIcon(i1);
                if(k==26)
                l340.setIcon(i1);
                if(k==27)
                l350.setIcon(i1);
                if(k==28)
                l360.setIcon(i1);
                if(k==29)
                l370.setIcon(i1);
                if(k==30)
                l380.setIcon(i1);
                if(k==31)
                l390.setIcon(i1);
                if(k==32)
                l400.setIcon(i1);
                if(k==33)
                l410.setIcon(i1);
                if(k==34)
                l420.setIcon(i1);
                if(k==35)
                l430.setIcon(i1);
                if(k==36)
                l440.setIcon(i1);
                if(k==37)
                l450.setIcon(i1);
                 */
                System.out.println("Printed "+fd[k]);
                //int x=0;

                k++;
                //gd[k-1].setIcon(i1);
            }

            for(x=0;x<ln;x++)
            {
                if(x!=k)
                    gd[x].setIcon(i2);
            }
            for(x=0;x<ln;x++)
            {
                if(x!=k-1)
                    sd[x].setIcon(i4);
                if(k!=0)
                    gd[k-1].setIcon(i2);
            }

            for(x=0;x<h;x++)
            {
                if(os[x]<ln)
                {   
                gd[os[x]].setIcon(i3);
                if(k!=0)
                    if((gd[os[x]]==gd[k-1])&&go!=1)
                    {
                        JOptionPane.showMessageDialog(null,"Collision");
                        i=0;
                        k=0;
                        //over=1;
                    }
                }
            }
            if(over==1)
            break;
            for (x = 0; x < ld-1; x++) 
            {                
                ot[x] = ot[x+1];
            }
            for (x = 0; x < h; x++) 
            {                
                os[x] = os[x]-1;
            }
            ld--;
            for(x=0;x<ld;x++)
            {
                if(ot[x]=='5')
                    os[z++]=x;
            }  
            go=0;
            //System.out.println(" i is "+i);
        }
            catch(ArrayIndexOutOfBoundsException e)
            {
                JOptionPane.showMessageDialog(null,"You Won");
                break;
            }
        }
        user_action ob1=new user_action();
        uso();
    }

    public static void main()
    {
        user_action ob=new user_action();
        ob.uso();
    }
}
