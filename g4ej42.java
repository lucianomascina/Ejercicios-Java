package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class g4ej42 extends JFrame implements ActionListener,ListSelectionListener{

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEdad;
	JButton btnAñadir;
	JButton btnEliminar;
	JList<Persona> list;
	private DefaultListModel<Persona> modelo=new DefaultListModel<Persona>();
	JLabel lblNombre;
	JLabel lblApellido;
	JLabel lblEdad;
	
	boolean buscar(Persona p)
	{
		for(int i=0;i<modelo.getSize();i++)
		{
			if(modelo.getElementAt(i).equals(p))
				return true;
		}
		return false;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					g4ej42 frame = new g4ej42();
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
	public g4ej42() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agregar Persona:");
		lblNewLabel.setBounds(10, 11, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(20, 36, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(86, 36, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido:");
		lblNewLabel_2.setBounds(20, 67, 100, 14);
		contentPane.add(lblNewLabel_2);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(86, 64, 86, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Edad:");
		lblNewLabel_3.setBounds(33, 98, 100, 14);
		contentPane.add(lblNewLabel_3);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(86, 95, 86, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.setBounds(213, 42, 89, 23);
		contentPane.add(btnAñadir);
		btnAñadir.addActionListener(this);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(213, 93, 89, 23);
		contentPane.add(btnEliminar);
		btnEliminar.addActionListener(this);
		
		list = new JList<Persona>(modelo);
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(335, 23, 89, 131);
		contentPane.add(list);
		list.addListSelectionListener(this);
		
		JLabel lblNewLabel_4 = new JLabel("Informaci\u00F3n:");
		lblNewLabel_4.setBounds(10, 140, 100, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre:");
		lblNewLabel_5.setBounds(20, 165, 100, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Apellido:");
		lblNewLabel_6.setBounds(20, 193, 100, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Edad:");
		lblNewLabel_7.setBounds(33, 218, 100, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNombre = new JLabel("");
		lblNombre.setBounds(96, 165, 100, 14);
		contentPane.add(lblNombre);
		
		lblApellido = new JLabel("");
		lblApellido.setBounds(96, 193, 100, 14);
		contentPane.add(lblApellido);
		
		lblEdad = new JLabel("");
		lblEdad.setBounds(96, 218, 100, 14);
		contentPane.add(lblEdad);
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		int op=list.getSelectedIndex();
		if(op==-1)
		{
			this.lblApellido.setText("...");
			this.lblNombre.setText("...");
			this.lblEdad.setText("...");
		}
		else
		{
			Persona p=modelo.getElementAt(op);
			this.lblNombre.setText(p.getNombre());
			this.lblApellido.setText(p.getApellido());
			this.lblEdad.setText(String.valueOf(p.getEdad()));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAñadir)
		{
			Persona p=new Persona(this.txtApellido.getText(),Integer.parseInt(this.txtEdad.getText()),this.txtNombre.getText());
			if(buscar(p))
			{
				JOptionPane.showMessageDialog(null, "persona repetida");
			}
			else
			{
				modelo.addElement(p);
				this.txtApellido.setText("");
				this.txtEdad.setText("");
				this.txtNombre.setText("");
			}
		}
		if(e.getSource()==btnEliminar)
		{
			int op=list.getSelectedIndex();
			if(op==-1)
			{
				JOptionPane.showMessageDialog(null, "no ha seleccionado nada");
			}
			else
			{
				modelo.remove(op);
			}
		}
			
	}
}
