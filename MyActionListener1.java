import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.InternalFrameListener;
import java.lang.*;

public class MyActionListener1 implements ActionListener
{
	Main_Frame mf;
	List ls;
	Health mf1;
	Home mf2;
	home_policy mf2_1;
	health_policy mf1_1;

	MyActionListener1(Main_Frame m)
    {
		this.mf = m;
	}
	
	MyActionListener1(List m)
    {
		this.ls = m;
	}

    MyActionListener1(Health m)
	{
		this.mf1 = m;
	}

	MyActionListener1(health_policy m)
	{
		this.mf1_1 = m;
	}

	MyActionListener1(Home m)
	{
		this.mf2 = m;
	}

	MyActionListener1(home_policy m)
	{
		this.mf2_1 = m;
	}

	
	public void actionPerformed(ActionEvent e)
	{

		// For List Frame (List of Insuarance)
		if(e.getActionCommand().equals("Start"))
		{
            ls=new List();
			this.ls.setVisible(true);
			this.mf.setVisible(false);
		}
		
		// For Main Frame
		if(e.getActionCommand().equals("back"))
		{
			mf = new Main_Frame();
			this.mf.setVisible(true);
			ls.setVisible(false);
		}
		
		// For Health 
        if(e.getActionCommand().equals("health insurances"))
		{
			mf1_1=new health_policy();
			this.mf1_1.setVisible(true);
			ls.setVisible(false);
		}

		if(e.getActionCommand().equals("Get plans"))
		{
			mf1 = new Health();
			this.mf1.setVisible(true);
			this.mf1_1.setVisible(false);
		}

		if(e.getActionCommand().equals("<|"))
		{
			ls = new List();
			this.mf1_1.setVisible(false);
			this.ls.setVisible(true);
		}

		if(e.getActionCommand().equals("Save"))
		{
			String member_name = this.mf1.txt1.getText();
			String dob = this.mf1.txt3.getText();
			String age = this.mf1.txt4.getText();
			String phoneno = this.mf1.txt5.getText();

			String gender = (String)this.mf1.cmb1.getSelectedItem();
			

			Modle md = new Modle(member_name,gender,dob,age,phoneno);

			try
			{
				md.saveObject("customer.txt");
			}
			catch(Exception ef)
			{
				System.out.println(ef);
			}
			/*Modle md1 = new Modle();
			try
			{
				md1.readObject("customer.txt");
			}
			catch(Exception efd)
			{
				System.out.println(efd);
			}*/

			
		}
		
		if(e.getActionCommand().equals("Clear"))
		{
			this.mf1.txt1.setText("");
			this.mf1.txt3.setText("");
			this.mf1.txt4.setText("");
			this.mf1.txt5.setText("");
		}

		if(e.getActionCommand().equals("<"))
		{
			mf1_1 = new health_policy();
			this.mf1_1.setVisible(true);
			this.mf1.setVisible(false);
		}
		


		// for health_policy
		if(e.getActionCommand().equals("<|"))
		{
			this.mf1_1.setVisible(false);
			this.ls.setVisible(true);
		}

		
		// for Home Insuarance
		/*if(e.getActionCommand().equals("home insurances"))
		{
		    mf2_1 = new home_policy();
			this.mf2_1.setVisible(true);
			ls.setVisible(false);
		}
		if(e.getActionCommand().equals("<-"))
		{
			this.mf2.setVisible(false);
			this.ls.setVisible(true);
		}*/
    }

	
}
