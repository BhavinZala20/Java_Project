import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javafx.stage.WindowEvent;
import java.lang.*;

public class family_policy extends JFrame
{
	JButton plans,back;
	
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15, lbl16, lbl17, lbl18, lbl19, lbl20;

    ImageIcon img;

    MyActionListener1 ml = new MyActionListener1(this);

    family_policy()
    {
        setLayout(null);
        setBounds(0,0,1600,1000);

        img = new ImageIcon("p8.JPG");
		lbl20 = new JLabel(img);
		lbl20.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		lbl20.setVisible(true);

        lbl1 = new JLabel("Family Insuarances");

        lbl2 = new JLabel("The current policy interest in families and relationships has built arguably both in ");
        lbl3 = new JLabel("response to growing awareness of the importance of family for childrens outcomes");
        lbl4 = new JLabel("and also, in a context of continuing austerity, the pressure to reduce the costs to the");
        lbl5 = new JLabel("state associated with the negative impacts of poor quality relationships and");
        lbl6 = new JLabel("relationship breakdown.");
        
        lbl7 = new JLabel("Research has increasingly demonstrated that poor quality family relationships and");
        lbl8 = new JLabel("fractious family separations can have detrimental impacts on childrens wellbeing, ");
        lbl9 = new JLabel("which in some cases can last in the long term. For example, it is now well-established");
        lbl10 = new JLabel("that, although most children whose parents separate or divorce do not experience.");
        lbl11 = new JLabel("adverse outcomes, poor outcomes such as behavioural difficulties are around twice as ");
        lbl12 = new JLabel("likely for these children as they are for children whose parents remain together (Pryor");
        lbl13 = new JLabel("and Rodgers, 2001). Policy-makers have therefore increasingly come to see the ");
        lbl14 = new JLabel("importance of supporting family relationships to reduce rates of family breakdown");
        lbl15 = new JLabel("and/or mitigate the harm to children. The Coalition Government made family");
        lbl16 = new JLabel("breakdown one of the five pathways to poverty and increased the investment from the");
        lbl17 = new JLabel("state into relationship support, which the subsequent Conservative Government had");
        lbl18 = new JLabel("promised to double (Cameron, 2016)");
		
		plans= new JButton("get Plans");
        back= new JButton("go Back");

        Font f1 = new Font("Arial",Font.ITALIC,25);	
        
        lbl1.setFont(f1);
		lbl2.setFont(f1);
		lbl3.setFont(f1);
		lbl4.setFont(f1);
		lbl5.setFont(f1);

		lbl6.setFont(f1);
        lbl7.setFont(f1);
		lbl8.setFont(f1);
        lbl9.setFont(f1);
		lbl10.setFont(f1);

		lbl11.setFont(f1);
		lbl12.setFont(f1);
		lbl13.setFont(f1);
        lbl14.setFont(f1);
		lbl15.setFont(f1);
		lbl16.setFont(f1);
        lbl17.setFont(f1);
        lbl18.setFont(f1);

        back.setFont(f1);
        plans.setFont(f1);

        add(lbl1);
		add(lbl2);
		add(lbl3);
		add(lbl4);
		add(lbl5);

		add(lbl6);
		add(lbl7);
		add(lbl8);
        add(lbl9);
		add(lbl10);

        add(lbl11);
		add(lbl12);
		add(lbl13);
		add(lbl14);
		add(lbl15);
		add(lbl16);
        add(lbl17);
        add(lbl18);
        add(lbl20);

		add(back);
        add(plans);

        lbl1.setBounds(100,50,1500,25);

		lbl2.setBounds(100,100,1500,25);
		lbl3.setBounds(100,130,1500,25);
		lbl4.setBounds(100,160,1500,25);
		lbl5.setBounds(100,190,1500,25);
        lbl6.setBounds(100,220,1500,25);

        lbl7.setBounds(100,270,1500,25);
		lbl8.setBounds(100,300,1500,25);
        lbl9.setBounds(100,330,1500,25);
		lbl10.setBounds(100,360,1500,25);
        lbl11.setBounds(100,390,1500,25);
		lbl12.setBounds(100,420,1500,25);
		lbl13.setBounds(100,450,1500,25);
		lbl14.setBounds(100,480,1500,25);
		lbl15.setBounds(100,510,1500,25);
        lbl16.setBounds(100,540,1500,25);
        lbl17.setBounds(100,570,1500,25);
        lbl18.setBounds(100,600,1500,25);

		
		back.setBounds(300,700,200,65);
        plans.setBounds(500,700,200,65);
		
		back.addActionListener(ml);
        plans.addActionListener(ml);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                setVisible(false);
            }
        });
    }
}
