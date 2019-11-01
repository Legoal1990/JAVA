import javax.swing.*; //Librería que pemrite importar los componentes es decir crear el diseño de la interfaz grafica
import java.awt.event.*; //Permite importar todas las Funcionalidades que podemos agregar a nuestro compornente o evento libreria permite controlar los eventos de los componentes que tendra la interfaz

public class Formulario extends JFrame implements ActionListener{//Sirven para decirle al programa que debe estar atento al momento que se ejecute un evento
	JButton boton1;
	public Formulario(){
		setLayout(null);
		boton1=new JButton("Cerrar"); //Diseño
		boton1.setBounds(300,250,100,30); //Diseño
		add(boton1);
		boton1.addActionListener(this); //La clase ActionListener va a estar a la espera del evento que genere este botón
	}

	//Funcionalidad
	public void actionPerformed(ActionEvent e){ //Para capturar el evento antes de que lo ejecute ActionListener se tiene que guardar primero aquí
		if(e.getSource()==boton1){ //e es el espacio de memoria donde se guardo temporalmente el evento que se ejecuta al presionar un boton  //getSource contiene el objeto donde se origino el evento y es un metodo de la clase ActionEvent
			System.exit(0); // El evento a ejecutar es que cierre la interfaz gráfica
			
		}
	}

	//Ahora hay que empezar interfaz gráfica
	public static void main(String args[]){
		Formulario formulario1=new Formulario();
		formulario1.setBounds(0,0,450,350);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}