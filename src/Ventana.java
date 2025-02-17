import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setVisible(true);//
		this.setSize(500,500);//atributo para modificar el tamano
		this.setLocationRelativeTo(null);//atributo para centrar, relative to sirve para colocar en una ubicacion especifica de otro objeto, pero como no hay objeto, pues lo centramos con null
		
		this.setTitle("Inicio de sesion"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setMaximumSize(new Dimension (800,400));
		this.setMinimumSize(new Dimension(400,400));
		
	}
	
	public JPanel login() {
		
		JPanel mipanel = new JPanel ();
		
		mipanel.setBackground(Color.GRAY);
		mipanel.setOpaque(true);
		mipanel.setSize(500,500);
		mipanel.setLocation(0,0);
		
		JLabel etiqueta1=new JLabel("Bienvenido");
		etiqueta1.setSize(100,100);
		etiqueta1.setOpaque(true);
		
		return mipanel;
		
		
	}

}
