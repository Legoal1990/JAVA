import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	private JTextField textfield1;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	private JButton boton1;

	String texto=""; //variable para alojar temporalmente un texto
	
	public Formulario(){
		setLayout(null); //metodo que permita trabajar con coordenadas dentro de la interfaz grafica
		textfield1=new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);

		boton1=new JButton("Agregar");
		boton1.setBounds(250,10,100,30);
		add(boton1);
		boton1.addActionListener(this);

		textarea1=new JTextArea();
		scrollpane1=new JScrollPane(textarea1);	
		scrollpane1.setBounds(10,50,400,300);
		add(scrollpane1);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boton1){
			texto+=textfield1.getText() + "\n"; //variable de tipo acumulador //Salto de linea	
			textarea1.setText(texto);  //Colocar� el texto dentro del componente
			textfield1.setText("");//Limpiar lo que se escribi� y pasarlo al textArea
		}
	}

	public static void main(String args[]){
		Formulario formulario1=new Formulario();
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}