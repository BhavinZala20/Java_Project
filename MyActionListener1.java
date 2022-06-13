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

	MyActionListener1(Home m)
	{
		this.mf2 = m;
	}

	MyActionListener1(home_policy m)
	{
		this.mf2_1;
	}

	
	public void actionPerformed(ActionEvent e)
	{

		// For List Frame (List of Insuarance)
		if(e.getActionCommand().equals("Start"))
		{
            ls=new List();
			this.ls.setVisible(true);
		}
		
		// For Main Frame
		if(e.getActionCommand().equals("< Back"))
		{
			
			ls.setVisible(false);
			this.mf.setVisible(true);
		}
		
        if(e.getActionCommand().equals("Health insurances"))
		{
			mf1=new Health();
			this.mf1.setVisible(true);
		}

		if(e.getActionCommand().equals("<"))
		{
			this.mf1.setVisible(false);
			this.ls.setVisible(true);
		}

		// for Home Insuarance
		if(e.getActionCommand().equals("Home insurances"))
		{
           	mf2_i=new Home();
			this.mf2_i.setVisible(true);
		}
		if(e.getActionCommand().equals("<-"))
		{
			this.mf2.setVisible(false);
			this.ls.setVisible(true);
		}
    }
}
