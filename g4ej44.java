package ejercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class g4ej44 extends JFrame implements ActionListener{

	private JPanel contentPane;
	JComboBox<Integer> comboRojo=new JComboBox<Integer>();
	JComboBox<Integer> comboVerde=new JComboBox<Integer>();
	JComboBox<Integer> comboAzul=new JComboBox<Integer>();
	JButton btn;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					g4ej44 frame = new g4ej44();
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
	public g4ej44() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rojo:");
		lblNewLabel.setBounds(116, 38, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Verde:");
		lblNewLabel_1.setBounds(116, 90, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Azul:");
		lblNewLabel_2.setBounds(116, 136, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		comboRojo = new JComboBox<Integer>();
		comboRojo.setBounds(192, 35, 50, 20);
		contentPane.add(comboRojo);
		
		comboVerde = new JComboBox<Integer>();
		comboVerde.setBounds(192, 87, 50, 20);
		contentPane.add(comboVerde);
		
		comboAzul = new JComboBox<Integer>();
		comboAzul.setBounds(192, 133, 50, 20);
		contentPane.add(comboAzul);

		for(int i=0;i<255;i++)
		{
			comboRojo.addItem(i);
			comboVerde.addItem(i);
			comboAzul.addItem(i);
		}
		
		btn = new JButton("Fijar color");
		btn.setBounds(153, 194, 89, 23);
		contentPane.add(btn);
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setBackground(new Color(comboRojo.getSelectedIndex(),comboAzul.getSelectedIndex(),comboVerde.getSelectedIndex()));
	}
	
}
