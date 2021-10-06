package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class g4ej40 extends JFrame {

	private JPanel contentPane;
	int piso=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					g4ej40 frame = new g4ej40();
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
	public g4ej40() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Piso:");
		lblNewLabel.setBounds(243, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_1.setBounds(220, 96, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		final JLabel lblPiso = new JLabel("0");
		lblPiso.setBounds(293, 40, 46, 14);
		contentPane.add(lblPiso);
		
		final JLabel lblDireccion = new JLabel("x");
		lblDireccion.setBounds(293, 96, 95, 14);
		contentPane.add(lblDireccion);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				piso=Integer.parseInt(lblPiso.getText());
				if(piso<4)
					lblDireccion.setText("Subiendo");
				
				lblPiso.setText("4");
			}
		});
		btn4.setBounds(54, 25, 57, 45);
		contentPane.add(btn4);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				piso=Integer.parseInt(lblPiso.getText());
				if(piso<2)
					lblDireccion.setText("Subiendo");
				else
				{
					lblDireccion.setText("bajando");
				}
				lblPiso.setText("2");
			}
		});
		btn2.setBounds(54, 137, 57, 50);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				piso=Integer.parseInt(lblPiso.getText());
				if(piso<1)
					lblDireccion.setText("Subiendo");
				else
				{
					lblDireccion.setText("bajando");
				}
				lblPiso.setText("1");
			}
		});
		btn1.setBounds(54, 205, 57, 45);
		contentPane.add(btn1);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				piso=Integer.parseInt(lblPiso.getText());
				if(piso<3)
					lblDireccion.setText("Subiendo");
				else
				{
					lblDireccion.setText("bajando");
				}
				lblPiso.setText("3");
			}
		});
		btn3.setBounds(54, 81, 57, 45);
		contentPane.add(btn3);
	}
	

}
