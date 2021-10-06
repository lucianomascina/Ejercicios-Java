package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class g4ej36 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txt;
	JButton btn;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					g4ej36 frame = new g4ej36();
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
	public g4ej36() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(88, 83,50, 14);
		contentPane.add(lblNewLabel);
		
		btn = new JButton("Ingresar");
		btn.setBounds(126, 147, 89, 23);
		contentPane.add(btn);
		btn.addActionListener(this);
		
		txt = new JTextField();
		txt.setBounds(144, 80,100, 20);
		contentPane.add(txt);
		txt.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn)
		{
			this.setTitle(txt.getText());
		}
	}

}
