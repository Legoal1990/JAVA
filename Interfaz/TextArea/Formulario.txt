import javax.swing.*; //Solo Diseñar

public class Formulario extends JFrame{
	private JTextField textfield1;
	private JTextArea textarea1;

	//Crear un constructor para programar el diseño de los componentes
	public Formulario(){
		setLayout(null);
		textfield1 = new JTextField(); //Para que se muestre en blanco si quiero tenga texto lo coloco dentro de los ()
		textfield1.setBounds(10,10,200,30);
		add(textfield1);
	
		textarea1=new JTextArea(); //Solo para que aparezca el campo //permite escribir multiples lineas dentro de el.
		textarea1.setBounds(10, 50, 400,300);
		add(textarea1); //Todo el diseño anterior se debe alojar dentro de textarea1

	}

	//Pasamos al diseño de la interfaz grafica
	public static void main(String args[]){
		Formulario formulario1=new Formulario();
		formulario1.setBounds(0, 0, 540, 400);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}