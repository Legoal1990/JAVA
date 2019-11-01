import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener{
	private JLabel label1, label2, label3, label4;
	private JTextField textfield1;
	private JButton boton1;
	public static String texto=""; //Declarar una variable para guardar datos del usuario

	public Bienvenida(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(255,0,0)); 
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());//Cambiar el icono

		ImageIcon imagen=new ImageIcon("images/logo-coca.png"); //Logo Coca Cola al centro
		label1=new JLabel(imagen);
		label1.setBounds(25,15,300, 150);
		add(label1);

		label2=new JLabel("Sistema de Control Vacacional");
		label2.setBounds(35,135,300, 30);
		label2.setFont(new Font("Andale Mono", 3, 18));
		label2.setForeground(new Color(255,255,255)); //Color del texto
		add(label2);

		label3=new JLabel("Ingrese el nombre del usuario:");
		label3.setBounds(45,212,200, 30);
		label3.setFont(new Font("Andale Mono",1, 12));
		label3.setForeground(new Color(255,255,255)); //Color del texto
		add(label3);

		label4=new JLabel("© 2017 The Coca-Cola Company");
		label4.setBounds(85,375,300, 30);
		label4.setFont(new Font("Andale Mono", 1, 12));
		label4.setForeground(new Color(255,255,255)); //Color del texto
		add(label4);
		
		textfield1=new JTextField();
		textfield1.setBounds(45,240, 255, 25);
		textfield1.setBackground(new Color(224, 224, 224)); //Para que el cuadro de texto se vea gris
		textfield1.setFont(new Font("Andale Mono", 1, 14));
		textfield1.setForeground(new Color(255,0,0)); //Color del texto
		add(textfield1);

		boton1=new JButton("Ingresar");
		boton1.setBounds(125,280,100, 30);
		boton1.setBackground(new Color(255, 255, 255)); //Para que el cuadro de texto se vea gris
		boton1.setFont(new Font("Andale Mono", 1, 14));
		boton1.setForeground(new Color(255,0,0)); //Color del texto
		boton1.addActionListener(this);		
		add(boton1);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boton1){
			texto=textfield1.getText().trim(); //Recuperar el texto que esta dentro de un componente //.trim() borrar espacios y lo guarda sin espacios dentro de la variable
			if(texto.equals("")){ //verifique que lo que esta dentro de la variable texto y si esta vacia debe decir lo siguiente
				JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
			}
			else{ //Para enviar a la siguiente interfaz
				Licencia licencia1=new Licencia();
				licencia1.setBounds(0,0,600,360);
				licencia1.setVisible(true); //Para que se vea la interfaz que quiero mostrar pero no quiero se vea la interfaz binvenida agrego this.setVisible(false);
				licencia1.setResizable(false);
				licencia1.setLocationRelativeTo(null);	
				this.setVisible(false);
			}	
		}	
	}

	public static void main(String args[]){
		Bienvenida bienvenida=new Bienvenida();
		bienvenida.setBounds(0,0,350,450);
		bienvenida.setVisible(true);
		bienvenida.setResizable(false);
		bienvenida.setLocationRelativeTo(null);
	}
}
