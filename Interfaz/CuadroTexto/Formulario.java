import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{  
	
	//Indicar los componentes a utilizar
	private JTextField textfield1;
	private JLabel label1;
	private JButton boton1;

	public Formulario(){  //Diseño de cada componente y para eso usamos el constructor
		setLayout(null);
		label1=new JLabel("Usuario:");
		label1.setBounds(10, 10, 100, 30);
		add(label1);

		textfield1=new JTextField();
		textfield1.setBounds(120,17,150,20);
		add(textfield1);

		//El boton se programa en dos partes en una el diseño y en otro el evento
		boton1=new JButton("Aceptar");
		boton1.setBounds(10, 80,100,30);
		add(boton1);
		boton1.addActionListener(this); //Mas adelante le vamos a poner evento a este botón
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boton1){
			String texto=textfield1.getText(); //Recuperar el texto que el usuario escribió dentro del componente Textfile1
			setTitle(texto); //Para poner el titulo de la interfaz
		}
	}

	//Escribir nuestro metodo Main y hacer el diseño de la interfaz gráfica
	public static void main(String args[]){
		Formulario formulario1=new Formulario();
		formulario1.setBounds(0,0,300,150); //Hay que indicar las dimensiones
		formulario1.setVisible(true);
		formulario1.setResizable(false); //Para que no se modifique el tamaño por el usuario
		formulario1.setLocationRelativeTo(null); //Para que aparezca al centro de la pantalla
	}
}