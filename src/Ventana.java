import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setVisible(true);//
		this.setSize(500,500);//atributo para modificar el tamano
		this.setLocationRelativeTo(null);//atributo para centrar, relative to sirve para colocar en una ubicacion especifica de otro objeto, pero como no hay objeto, pues lo centramos con null
		
		this.setTitle("Inicio de sesion"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false); si quiero que sea redimensionable le coloco true

		this.setMaximumSize(new Dimension (800,400));
		this.setMinimumSize(new Dimension(400,400));
		
		this.add(this.login());//add permite agregar todo lo que queremos dentrod e la ventana, entonces estamos pidiendo agregar el objeto login a Ventana
	
		this.repaint();
	}
	
	public JPanel login() {// aqui le agregamos un panel a nuestra ventana, y login es una funcion 
		
		JPanel mipanel = new JPanel ();
		
		mipanel.setBackground(Color.WHITE);
		mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el background 
		mipanel.setSize(500,500);// comom panel es un objeto, tiene algunas caractetisticas como la ventana 
		mipanel.setLocation(0,0);
		mipanel.setLayout(null);
		
		
		
		JLabel etiqueta1=new JLabel ("¡Bienvenido!");
		etiqueta1.setSize(100,30);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta1.setLocation(40,30);
		//etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Nunito",Font.BOLD,16));
		mipanel.add(etiqueta1);
		
		JLabel etiqueta2=new JLabel ("Ingresa tu correo");
		etiqueta2.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta2.setLocation(40,120);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta2.setFont(new Font("Nunito",Font.BOLD,14));
		mipanel.add(etiqueta2);
		
		JTextField email=new JTextField();
		email.setSize(300,40);
		email.setLocation(40,150);
		email.setFont(new Font("Nunito",Font.BOLD,14));
		mipanel.add(email);
		
		JLabel etiqueta3=new JLabel ("Ingresa tu contraseña");
		etiqueta3.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta3.setLocation(40,220);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta3.setFont(new Font("Nunito",Font.BOLD,14));
		mipanel.add(etiqueta3);
		
		JTextField contrasena=new JTextField();
		contrasena.setSize(300,40);
		contrasena.setLocation(40,250);
		contrasena.setFont(new Font("Nunito",Font.BOLD,14));
		mipanel.add(contrasena);
		
		JButton recordar=new JButton();
		recordar.setSize(12,12);
		recordar.setLocation(40,323);
		//recordar.setFont(new Font("Nunito",Font.BOLD,14));
		mipanel.add(recordar);
		
		JLabel recordar1=new JLabel ("Recordar mis credenciales");
		recordar1.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		recordar1.setLocation(55,310);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		recordar1.setFont(new Font("Nunito",Font.BOLD,9));
		mipanel.add(recordar1);
		
		
		JLabel recordar2=new JLabel ("¿Olvidaste tu contraseña?");
		recordar2.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		recordar2.setLocation(215,280);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		recordar2.setFont(new Font("Nunito",Font.BOLD,9));
		mipanel.add(recordar2);
		
		
		JTextField ingresar=new JTextField();
		ingresar.setSize(12,12);
		ingresar.setLocation(40,323);
		ingresar.setFont(new Font("Nunito",Font.BOLD,14));
		mipanel.add(recordar);
		
		
		JButton boton=new JButton("Iniciar sesión");
		boton.setBackground(Color.RED);
		boton.setSize(200,40);
		boton.setLocation(40,365);
        boton.setLayout(null);
        boton.setVisible(true);
        mipanel.add(boton);
		return mipanel;// aqui retornamos un panel que se va a mostrar en la ventana
		
		
	}

}
