import javax.swing.*;
import java.awt.*;//Que importe todos los componentes de dise�o que tiene entre ellos el color
import java.awt.event.*;//Que importe todos los eventos disponibles

public class Formulario extends JFrame implements ActionListener{
	private JLabel label1, label2, label3;
	private JComboBox combo1, combo2, combo3;
	private JButton boton1;

	public Formulario(){
		setLayout(null);
		//Rojo
		label1=new JLabel("Rojo:");
		label1.setBounds(10,10,100,10);
		add(label1);

		combo1=new JComboBox();
		combo1.setBounds(120,10,50,30);
			for(int i=0; i<=255; i++){
				combo1.addItem(String.valueOf(i)); //Para convertir la variable int a String esta es otra forma de hacer Parse
			}
		add(combo1);
		//Verde
		label2=new JLabel("Verde:");
		label2.setBounds(10,50,100,10);
		add(label2);

		combo2=new JComboBox();
		combo2.setBounds(120,50,50,30);
			for(int i=0; i<=255; i++){
				combo2.addItem(String.valueOf(i)); //Para convertir la variable int a String esta es otra forma de hacer Parse
			}
		add(combo2);
		//Azul
		label3=new JLabel("Azul:");
		label3.setBounds(10,100,100,10);
		add(label3);

		combo3=new JComboBox();
		combo3.setBounds(120,100,50,30);
			for(int i=0; i<=255; i++){
				combo3.addItem(String.valueOf(i)); //Para convertir la variable int a String esta es otra forma de hacer Parse
			}
		add(combo3);

		//Dise�o del boton

		boton1=new JButton("Fijar color");
		boton1.setBounds(10,130,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boton1){
			//Para seleccionar los datos que el usuario ha seleccionado del comboBox
			String cad1=combo1.getSelectedItem().toString();
			String cad2=combo2.getSelectedItem().toString();
			String cad3=combo3.getSelectedItem().toString();
			
			//Convertir a entero para lo RGB
			int rojo=Integer.parseInt(cad1);
			int verde=Integer.parseInt(cad2);
			int azul=Integer.parseInt(cad3);

			//Crear objeto de tipo color
			Color color1=new Color(rojo, verde, azul);

			//Poner el fondo al boton
			boton1.setBackground(color1);
		}
	}

	public static void main(String args[]){
		Formulario formulario1=new Formulario();		
		formulario1.setBounds(0,0,190,400);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}