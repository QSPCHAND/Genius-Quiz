import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
	JButton rules,back;
	JTextField tfname;
	Login(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/geniusMind.jpg"));
		Image iz=i1.getImage().getScaledInstance(640,480,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(iz);
		JLabel image=new JLabel(i3);
		//JLabel image=new JLabel(i1);
		add(image);
		image.setBounds(0, 0, 600, 500);
		//image.setSize(900, 500);

		JLabel heading=new JLabel("Genius Minds");
		heading.setBounds(750,60, 300, 50);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		heading.setForeground(Color.BLUE);
		add(heading);

		JLabel name=new JLabel("Enter Your Name");
		name.setBounds(810,150, 300,20);
		name.setFont(new Font("Monglian baiti",Font.BOLD,18));
		name.setForeground(Color.BLUE);
		add(name);

		tfname=new JTextField();
		tfname.setBounds(735, 200, 300, 25);
		tfname.setFont(new Font("Times New Romon",Font.BOLD,20));
		add(tfname);

		rules=new JButton("Rules");
		rules.setBounds(735, 270, 120, 25);
		rules.addActionListener(this);
		add(rules);

		back=new JButton("Back");
		back.setBounds(915, 270, 120, 25);
		back.addActionListener(this);
		add(back);

		setSize(1200,500);
		setLocation(200, 150);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==rules)
		{
			String name=tfname.getText();
			setVisible(false);
			new Rules(name);
		}
		else if(ae.getSource()==back)
		{
			setVisible(false);
		}
	}
	public static void main(String[] args)
	{
		new Login();
	}

}
