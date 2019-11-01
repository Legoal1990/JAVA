import javax.swing.*; //para los componentes
import javax.swing.event.*; //libreria para cada componente que nos permitia crear eventos de jcheckbox
import java.awt.*; //Que importe todos los componentes de diseño que tiene entre ellos el color
import java.awt.event.*; //Que importe todos los eventos disponibles

public class Licencia extends JFrame implements ActionListener, ChangeListener{
	private JLabel label1, label2;
	private JButton boton1, boton2;
	private JCheckBox check1;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	String nombre=""; //declarar la variable nombre que va a alojar lo que tiene la variable texto que es el nombre del usuario que en esta en la clase binevenidad//tiene un espacio reservado en la clase bienvenida pero tambien debe tener un espacio para alojarse en esta clase Después de recuperarse de la clase bienvenida debe tener un espacio para alojarse.

	public Licencia(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de uso");
		getContentPane().setBackground(new Color(224, 224, 224));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenida ventanaBienvenida = new Bienvenida();//objeto indicando a que clase se quiere visitar para obtene un valor que esta en otra clase tiene que llevar el nombre de la clase donde esta el valor
		nombre=ventanaBienvenida.texto;

		label1=new JLabel("TÉRMINOS Y CONDICIONES");
		label1.setBounds(215,5,200,30);
		label1.setFont(new Font("Andale Mono", 1, 14));
		label1.setForeground(new Color(0,0,0)); //Color del texto
		add(label1);
	
		textarea1=new JTextArea();
		textarea1.setEditable(false); //No editar ningun texto dentro del textarea
		textarea1.setFont(new Font("Andale Mono", 0, 9));
		textarea1.setText("\n\n			               TÉRMINOS Y CONDICIONES" +
			            "\n\n A. PRIVACIDAD NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" +
			            "\n A. PRIVACIDAD NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" +
			            "\n A. PRIVACIDAD NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" +
			            "\n A. PRIVACIDAD NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" +
			            "\n A. PRIVACIDAD NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" +
			            "\n A. PRIVACIDAD NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" +
			            "\n A. PRIVACIDAD NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" );
		scrollpane1=new JScrollPane(textarea1); 
		scrollpane1.setBounds(10,40,575,200);
		add(scrollpane1);

		check1= new JCheckBox("Yo " +nombre+" Acepto");
		check1.setBounds(10,250,300,30);
		check1.addChangeListener(this);
		add(check1);

		boton1=new JButton("Continuar");
		boton1.setBounds(10, 290, 100,30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);

		boton2=new JButton("No Acepto");
		boton2.setBounds(120, 290, 100,30);
		boton2.addActionListener(this);
		boton2.setEnabled(true);
		add(boton2);

		ImageIcon imagen=new ImageIcon("images/coca-cola.png");
		label2=new JLabel(imagen);
		label2.setBounds(315, 135, 300, 300);
		add(label2);
	}
		public void stateChanged(ChangeEvent e){
			if(check1.isSelected()==true){
				boton1.setEnabled(true);
				boton2.setEnabled(false);
			}else{
				boton1.setEnabled(false);
				boton2.setEnabled(true);
			}
		}


		public void actionPerformed(ActionEvent e){
			if(e.getSource()==boton1){
				PantallaPrincipal principal=new PantallaPrincipal();
				principal.setBounds(0,0,640,535);
				principal.setVisible(true);
				principal.setResizable(false);
				principal.setLocationRelativeTo(null);
				this.setVisible(false);
			}
			else if(e.getSource()==boton2){
				//System.exit(0); //Indica que debe cerrar la interfaz gráfica
				Bienvenida bienvenida=new Bienvenida();
				bienvenida.setBounds(0,0,350,450);
				bienvenida.setVisible(true);
				bienvenida.setResizable(false);
				bienvenida.setLocationRelativeTo(null);
				this.setVisible(false);
			}
		}
	

		public static void main(String args[]){
			Licencia licencia1=new Licencia();
			licencia1.setBounds(0,0,600,360);
			licencia1.setVisible(true);
			licencia1.setResizable(false);
			licencia1.setLocationRelativeTo(null);
		}
	
}