import javax.swing.*; //Importando todos los elementos de la librería swing

public class Formulario extends JFrame{ //heredamos la clase JFrame a la clase Formulario
	
	public Formulario(){  //Costructor contiene elementos que voy a poner en mi interfaz
		setLayout(null); //metodo para indicar al programa que usaremos coordenadas para colocar la intefaz le decimos que no haga nada al colocar null y que espere la instruccion sino lo colocara donde quiera la interfaz		
	}

	public static void main(String args[]){
		Formulario formulario1=new Formulario();
		formulario1.setBounds(350, 100, 400, 1000);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null); //Para que siempre aparezca al centro sin importar las coordenadas
		formulario1.setResizable(false); //Para que no se edite el tamaño o dimensiones
	}
}

