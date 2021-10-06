package ejercicios;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class g4ej33 extends JFrame {

	private JPanel contentPane;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					g4ej33 frame = new g4ej33();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public g4ej33() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_12 = new JButton("New button");
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("New button");
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("New button");
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("New button");
		panel.add(btnNewButton_15);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_1.add(btnNewButton_3, BorderLayout.NORTH);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_1.add(btnNewButton_4, BorderLayout.WEST);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_1.add(btnNewButton_5, BorderLayout.CENTER);
		
		JButton btnNewButton_6 = new JButton("New button");
		panel_1.add(btnNewButton_6, BorderLayout.EAST);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel_1.add(btnNewButton_7, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_8 = new JButton("New button");
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		panel_2.add(btnNewButton_11);
		
		final JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.WEST);
		panel_3.setPreferredSize(new Dimension(100,100));
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String lay=panel_3.getLayout().toString();
				JOptionPane.showMessageDialog(null,""+lay);
			}
		});
		btnNewButton.setBounds(0, 11, 89, 23);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(10, 68, 89, 23);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(10, 130, 89, 23);
		panel_3.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.EAST);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JButton btnNewButton_19 = new JButton("New button");
		panel_4.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("New button");
		panel_4.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("New button");
		panel_4.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("New button");
		panel_4.add(btnNewButton_22);
		
		JButton btnNewButton_16 = new JButton("New button");
		panel_4.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("New button");
		panel_4.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("New button");
		panel_4.add(btnNewButton_18);
		

	}
}
