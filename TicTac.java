import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
//import java.awt.Insets;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.UIManager;

public class TicTac {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTac window = new TicTac();
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
	public TicTac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 400, 551, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnNewButton = new JButton("0, 0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(new Color(153, 204, 204));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("0, 1");
		button.setBackground(new Color(153, 204, 204));
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("0, 2");
		button_1.setBackground(new Color(153, 204, 204));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("1, 0");
		button_2.setBackground(new Color(153, 204, 204));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("1, 1");
		button_3.setBackground(new Color(153, 204, 204));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("1, 2");
		button_4.setBackground(new Color(153, 204, 204));
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("2,0");
		button_5.setBackground(new Color(153, 204, 204));
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("2, 1");
		button_6.setBackground(new Color(153, 204, 204));
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("2, 2");
		button_7.setBackground(new Color(153, 204, 204));
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button_7);
	}

}
