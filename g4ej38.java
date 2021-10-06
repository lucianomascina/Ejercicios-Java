package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class g4ej38 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContraseña;
	JButton btn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					g4ej38 frame = new g4ej38();
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
	public g4ej38() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(88, 49, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1.setBounds(70, 103, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(150, 46, 100, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(150, 100, 100, 20);
		contentPane.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		btn = new JButton("Ingresar");
		btn.setBounds(123, 161, 89, 23);
		contentPane.add(btn);
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn)
		{
			if((txtUsuario.getText().equals("juan")) && (txtContraseña.getText().equals("abc123")))
			{
				JOptionPane.showMessageDialog(null, "Correcto");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Incorrecto");	
			}
		}
		
		
	}
}
