package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class g4ej43 extends JFrame implements ItemListener{

	private JPanel contentPane;
	JComboBox<String> comboPais=new JComboBox<String>();
	JComboBox<String> comboRegion=new JComboBox<String>();	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					g4ej43 frame = new g4ej43();
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
	public g4ej43() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboPais = new JComboBox<String>();
		comboPais.setBounds(145, 55, 100, 20);
		contentPane.add(comboPais);
		comboPais.addItemListener(this);
		comboPais.addItem("argentina");
		comboPais.addItem("españa");
		
		comboRegion = new JComboBox<String>();
		comboRegion.setBounds(145, 119, 100, 20);
		contentPane.add(comboRegion);
		
		JLabel lblNewLabel = new JLabel("Pa\u00EDs:");
		lblNewLabel.setBounds(89, 58, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Regi\u00F3n:");
		lblNewLabel_1.setBounds(73, 122, 46, 14);
		contentPane.add(lblNewLabel_1);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {

		String pais=comboPais.getSelectedItem().toString();

		if(pais.equals("argentina"))
		{
			comboRegion.addItem("buenos aires");
			comboRegion.addItem("la pampa");
			comboRegion.addItem("mendoza");
		}
		if(pais.equals("españa"))
		{
			comboRegion.addItem("catalunia");
			comboRegion.addItem("asturias");
			comboRegion.addItem("andalucia");
		}
	}
}
