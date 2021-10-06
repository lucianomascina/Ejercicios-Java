package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class g4ej41 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPatente;
	ArrayList<String> lista=new ArrayList<String>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					g4ej41 frame = new g4ej41();
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
	public g4ej41() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Patente:");
		lblNewLabel.setBounds(113, 53, 60, 14);
		contentPane.add(lblNewLabel);
		
		txtPatente = new JTextField();
		txtPatente.setBounds(178, 50, 86, 20);
		contentPane.add(txtPatente);
		txtPatente.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String patente=txtPatente.getText();
				boolean existe=false;
				
				for(String p:lista)
				{
					if(p.equals(patente))
					{
						existe=true;
						break;
					}
				}
				if(existe)
					JOptionPane.showMessageDialog(null, "patente ya existe");
				else
				{
					lista.add(patente);
					JOptionPane.showMessageDialog(null, "guardado");
				}
			}
		});
		btnAgregar.setBounds(142, 117, 89, 23);
		contentPane.add(btnAgregar);
		
	}
}
