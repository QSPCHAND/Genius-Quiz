import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener {
	Score(String name,int score){

		setBounds(400,150,750,550);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
		Image iz=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(iz);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 200, 300, 250);
		add(image);

		JLabel heading=new JLabel("Thank you "+ name + " for playing Genius Minds");
		heading.setBounds(45, 30,700, 30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(heading);

		JLabel Tscore=new JLabel("Your Score is "+score);
		Tscore.setBounds(350,200,300, 30);
		Tscore.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(Tscore);

		JButton submit=new JButton("Play Again");
		submit.setBounds(400,270, 120, 30);
		submit.addActionListener(this);
		add(submit);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		setVisible(false);
		new Login();
	}
	public static void main(String[] args)
	{
		new Score("user",0); 
	}

}
