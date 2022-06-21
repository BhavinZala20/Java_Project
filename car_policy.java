import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javafx.stage.WindowEvent;
import java.lang.*;

public class car_policy extends JFrame
{
	JButton plans,back;
	
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15, lbl16;

    ImageIcon img;

    MyActionListener1 ml = new MyActionListener1(this);

    car_policy()
    {
        setLayout(null);
        setBounds(0,0,1600,1000);

        img = new ImageIcon("p7.JPG");
		lbl16 = new JLabel(img);
		lbl16.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		lbl16.setVisible(true);
        lbl1 = new JLabel("PRIVATE CAR PACKAGE POLICY");

        lbl2 = new JLabel("Whereas the insured by a proposal and declaration dated as stated in the Schedule which shall be the basis");
        lbl3 = new JLabel("of this contract and is deemed to be incorporated herein has applied to ACKO GENERAL INSURANCE  ");
        lbl4 = new JLabel("LIMITED (hereinafter called the Company) for the insurance hereinafter contained and has paid the premium");
        lbl5 = new JLabel("mentioned in the schedule as consideration for such insurance in respect of accidental loss or damage");


        lbl6 = new JLabel("occurring during the period of insurance.");
        lbl7 = new JLabel("Rate of Depreciation for painting: In the case of painting, the depreciation rate of 50% shall be ");
        lbl8 = new JLabel("applied only on the material cost of total painting charges. In case of a consolidated bill for painting");
        lbl9 = new JLabel("charges, the material component shall be considered as 25% of total painting charges for the");
        lbl10 = new JLabel("purpose of applying the depreciation.");


        lbl11 = new JLabel("In the event of the vehicle being disabled by reason of loss or damage covered under this Policy the");
        lbl12 = new JLabel("Company will bear the reasonable cost of protection and removal to the nearest repairer and redelivery");
        lbl13 = new JLabel("to the insured but not exceeding in all Rs. 1500/- in respect of any one accident.");

        lbl14 = new JLabel("The Insured’s Declared Value (IDV) of the vehicle will be deemed to be the SUM INSURED for the");
        lbl15 = new JLabel("purpose of this policy which is fixed at the commencement of each policy period for the insured vehicle.");
       // lbl16 = new JLabel("part of this contract.");
		
		plans= new JButton("Get Plans");
        back= new JButton("Go Back");

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
	//	lbl16.setFont(f1);

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

		lbl11.setBounds(100,410,1500,25);
		lbl12.setBounds(100,430,1500,25);
		lbl13.setBounds(100,460,1500,25);
		lbl14.setBounds(100,510,1500,25);
		lbl15.setBounds(100,540,1500,25);
    //    lbl16.setBounds(100,620,1500,25);
		
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
