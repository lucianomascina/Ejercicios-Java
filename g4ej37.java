package ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class g4ej37 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	JButton btnSumar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					g4ej37 frame = new g4ej37();
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
	public g4ej37() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número 1:");
		lblNewLabel.setBounds(111, 51, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número 2:");
		lblNewLabel_1.setBounds(111, 96, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(181, 48, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(181, 93, 86, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		btnSumar = new JButton("Sumar");
		btnSumar.setBounds(153, 164, 89, 23);
		contentPane.add(btnSumar);
		btnSumar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSumar)
		{
			String s= String.valueOf(Integer.parseInt(txtNum1.getText())+Integer.parseInt(txtNum2.getText()));
			this.setTitle(s);
		}
		
	}

}
