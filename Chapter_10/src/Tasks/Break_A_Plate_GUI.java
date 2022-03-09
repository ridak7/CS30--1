package Tasks;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Break_A_Plate_GUI {
 
	private JFrame frame;
	
	
	/**
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					Break_A_Plate_GUI window = new Break_A_Plate_GUI();
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
	public Break_A_Plate_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon pHolder = new ImageIcon("/Chapter_10_Real/Images/placeholder.gif");
		ImageIcon plates1 = new ImageIcon("/Chapter_10_Real/Images/plates_all_broken.gif");
		ImageIcon plates2 = new ImageIcon("/Chapter_10_Real/Images/plates_two_broken.gif");
		ImageIcon plates3 = new ImageIcon("/Chapter_10_Real/Images/plates.gif");
		ImageIcon sticker = new ImageIcon("/Chapter_10_Real/Images/sticker.gif");
		ImageIcon tiger = new ImageIcon("/Chapter_10_Real/Images/tiger_plush.gif");

		frame = new JFrame();
		frame.setBounds(100, 100, 442, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 426, 407);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel plates = new JLabel("");
		plates.setHorizontalAlignment(SwingConstants.CENTER);
		plates.setBounds(45, 50, 335, 95);
		panel.add(plates);
		
		JLabel PrizeWon = new JLabel("");
		PrizeWon.setHorizontalAlignment(SwingConstants.CENTER);
		PrizeWon.setBounds(10, 269, 404, 127);
		panel.add(PrizeWon);
		
		plates.setIcon(plates1);
		PrizeWon.setIcon(pHolder);
		
		
		JButton play = new JButton("Play");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				// pick four random integers, each 1-3
				int playGame = 1 + (int)( 2 * Math.random() );
				
				
				if (playGame == 1)
				{
					plates.setIcon(plates2);
					PrizeWon.setIcon(sticker);
					play.setText("Play Again");
					
				}
				
				else if (playGame == 2)
				{
					plates.setIcon(plates3);
					PrizeWon.setIcon(tiger);
					play.setText("Play Again");
				}
			}
		});
		play.setBounds(45, 156, 335, 100);
		panel.add(play);
		
		JLabel title = new JLabel("BREAK A PLATE GAME");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(0, 11, 426, 35);
		panel.add(title);
	}
}
