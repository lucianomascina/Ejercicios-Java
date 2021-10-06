package ejercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class g4ej31 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					g4ej31 frame = new g4ej31();
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
	public g4ej31() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel col1=new JLabel("ROJO"); 
		col1.setForeground(Color.red);
		
		JLabel col2=new JLabel("AZUL"); 
		col2.setForeground(Color.blue);
		
		JLabel col3=new JLabel("VERDE"); 
		col3.setForeground(Color.green);
		
		JPanel vertical=new JPanel();
		vertical.setLayout(new FlowLayout());
		contentPane.add(vertical, BorderLayout.NORTH);
		vertical.add(col1);
		vertical.add(col2);
		vertical.add(col3);

	}
}
