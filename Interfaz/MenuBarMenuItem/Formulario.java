import javax.swing.*;
import java.awt.*; //Para trabajar con colores
import java.awt.event.*;  //Para trabajar con eventos

public class Formulario extends JFrame implements ActionListener{ //Eventos para botones o menus ActionListener a diferencia de JScrollPane que se usa la clase ItemListener

	private JMenuBar menubar; //Solo una 
	private JMenu menu1; //Para varias pesta�as del men�
	private JMenuItem menuitem1, menuitem2, menuitem3; //Crear un componente por opci�n

	public Formulario(){
		setLayout(null);
		menubar=new JMenuBar();
		//Indicar al programa que va a colocar una barra dentro de la interfaz
		setJMenuBar(menubar); //no es necesario ponerle dimensiones ni coordenadas por que automaticamente JAVA los coloca en la parte superior y adaptables al tama�o y resoluci�n de la interfaz
		
		menu1=new JMenu("Opciones");           //Programar las pesta�as desplegables	que solo tenemos una
		menubar.add(menu1); 		//Indicar que lo debe colocar en la barra
		
		//Hay que introducir las dem�s opciones y programar las pesta�as desplegables
		
		menuitem1=new JMenuItem("Rojo");  
		menuitem1.addActionListener(this); //indica que le voy a crear un evento
		menu1.add(menuitem1); //Agregarlo al men� opciones

		menuitem2=new JMenuItem("Verde");  
		menuitem2.addActionListener(this); //indica que le voy a crear un evento
		menu1.add(menuitem2); //Agregarlo al men� opciones

		menuitem3=new JMenuItem("Azul");  
		menuitem3.addActionListener(this); //indica que le voy a crear un evento
		menu1.add(menuitem3); //Agregarlo al men� opciones
	}
	
		//Ahora hay que programar los eventos
		public void actionPerformed(ActionEvent e){
			//Recurrir a la librer�a awt y usar un Container porque el fondo de la interfaz no es el cambia no es el JFrame sino el cotenedor
			Container fondo = this.getContentPane(); //Para que el fondo se adapte a la interfaz gr�fica por eso se usa this y al usar getContentPane es para que obtenga todas las dimensiones y caracteristicas de la interfaz y se guarde en fondo y si el usuario cambia el tama�o de la interfaz tambi� la demas de cambiar el contenedor
			//Ahora hay que crear estructuras condicionales
			if(e.getSource()==menuitem1){
				fondo.setBackground(new Color(255,0,0)); //modifcar el color del fondo del contenedor a el siguiente color
			}if(e.getSource()==menuitem2){
				fondo.setBackground(new Color(0,255,0)); 
			}if(e.getSource()==menuitem3){
				fondo.setBackground(new Color(0,0,255)); 
			}
		}
		//Dise�o de la interfaz gr�fica

		public static void main(String args[]){
			Formulario formulario1 =new Formulario();
			formulario1.setBounds(0,0,400,300);
			formulario1.setVisible(true);
			//No se coloc� el formulario1.setResizable para que el usuario pueda editar las dimensiones
			formulario1.setLocationRelativeTo(null);
	
		}
}