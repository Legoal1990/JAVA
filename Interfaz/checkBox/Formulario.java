import javax.swing.*; //para los componentes
import javax.swing.event.*; //libreria para cada componente que nos permitia crear eventos de jcheckbox
import java.awt.event.*; //para eventos de botones
                                                                         //para implementar evento al checkbox implementar un clase que este a la escucha ChangeListener pero si fuera un evento origina por un boton se necesita  ActionListener se puede implementar ms de una clase
public class Formulario extends JFrame implements ActionListener, ChangeListener{
	
	private JLabel label1; //para un mensaje al usuario
	private JCheckBox check1; 
	private JButton boton1;

	public Formulario(){
		setLayout(null);
		label1=new JLabel("Aceptar terminos y condiciones");
		label1.setBounds(10,10,400,30);
		add(label1);

		check1=new JCheckBox("Acepto");
		check1.setBounds(10,50,100,30);
		check1.addChangeListener(this);
		add(check1);

		boton1=new JButton("Continuar");
		boton1.setBounds(10,100,100,30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
}

	//M�todo para disparar los eventos: uno para el checkbox y otro para el boton
	//M�todo para JCheckBox
	public void stateChanged(ChangeEvent e){
		if(check1.isSelected()==true){
			boton1.setEnabled(true);
		}else{
			boton1.setEnabled(false);
		}
	}

	//M�todo para los botones
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boton1){
			System.exit(0); //Indica que debe cerrar la interfaz gr�fica
		}
	}

	public static void main(String args[]){
		Formulario formulario1=new Formulario();
		formulario1.setBounds(0,0,350,200);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}