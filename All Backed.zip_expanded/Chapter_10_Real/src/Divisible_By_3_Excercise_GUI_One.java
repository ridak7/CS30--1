import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Divisible_By_3_Excercise_GUI_One {

	private JFrame frame; 
	private JTextField Text;
	private JTextField Display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					Divisible_By_3_Excercise_GUI_One window = new Divisible_By_3_Excercise_GUI_One();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Divisible_By_3_Excercise_GUI_One() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 380, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel EnterInt = new JLabel("Enter A Integer:");
		EnterInt.setBounds(24, 68, 146, 47);
		frame.getContentPane().add(EnterInt);
		
		JLabel EnterIntf = new JLabel("Chicken");
		EnterInt.setBounds(24, 68, 146, 47);
		frame.getContentPane().add(EnterInt);
	
		Text = new JTextField();
		Text.setBounds(123, 74, 195, 34);
		frame.getContentPane().add(Text);
		Text.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(123, 76, 207, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Check = new JButton("Check");
		Check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			int num; //Declare (Num#) Variable 
			num = Integer.parseInt(Text.getText());//get text from the field
			
			if(num%3==0) //Factor-or for Finding if Number is divisible by 3
				   
			{
				    
				Display.setText("The Integer Is Divisible By 3 :)");    
				//If number is divisible by 3, displays this
				   
			}
				   
			else
				   
			{
				    
				Display.setText("The Integer Is Not Divisible By 3 :(");   
				//If number is not divisible by 3, displays this
				   
			}
				
			}
		});
		
		Check.setBounds(20, 145, 93, 23);
		frame.getContentPane().add(Check);
		
		Display = new JTextField();
		Display.setBounds(123, 145, 207, 23);
		frame.getContentPane().add(Display);
		Display.setColumns(10);
	}
}
