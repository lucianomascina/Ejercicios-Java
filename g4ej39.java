package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class g4ej39 extends JFrame{

	private JPanel contentPane;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					g4ej39 frame = new g4ej39();
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
	public g4ej39() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("label 1");
		lbl1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txt.setText("apretaste label 1");
			}
		});
		lbl1.setBounds(61, 32, 46, 14);
		contentPane.add(lbl1);
		
		
		JLabel lbl2 = new JLabel("label 2");
		lbl2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText("apretaste label 2");
			}
		});
		lbl2.setBounds(120, 32, 46, 14);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("label 3");
		lbl3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText("apretaste label 3");
			}
		});
		lbl3.setBounds(182, 32, 46, 14);
		contentPane.add(lbl3);
		
		JButton btn1 = new JButton("boton 1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText("apretaste boton 1");
			}
		});
		btn1.setBounds(32, 74, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("boton 2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText("apretaste boton 2");
			}
		});
		btn2.setBounds(139, 74, 89, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("boton 3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt.setText("apretaste boton 3");
			}
		});
		btn3.setBounds(250, 74, 89, 23);
		contentPane.add(btn3);
		
		txt = new JTextField();
		txt.setBounds(139, 148, 120, 20);
		contentPane.add(txt);
		txt.setColumns(10);
		
		contentPane.setFocusable(true);
		contentPane.addKeyListener(new KeyListener(){	@Override
			public void keyPressed(KeyEvent arg0) {
			txt.setText(""+arg0.getKeyChar());
			requestFocusInWindow();
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		});
	}


}
