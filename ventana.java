package ejercicios;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class ventana {

	public static void main(String[] args) {
		ventana v=new ventana("Hello world");

	}
	public ventana(String titulo)
	{
		JFrame ven=new JFrame(titulo);
		ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ven.setSize(300,150);
		ven.setVisible(true);
		Image icon=Toolkit.getDefaultToolkit().getImage(getClass().getResource("imagen.png"));
		ven.setIconImage(icon);
		Dimension d=new Dimension();
		ven.setLocation((int)((d.getWidth()/2)+290),100);
		d=Toolkit.getDefaultToolkit().getScreenSize();
		ven.setBounds(0, 0, (int)(d.getHeight()/2), (int)(d.getWidth()/2));;
		
	}

}
