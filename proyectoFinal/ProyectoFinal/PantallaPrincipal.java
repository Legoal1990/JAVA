import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PantallaPrincipal extends JFrame implements ActionListener{
	private JMenuBar menubar;
	private JMenu menuOpciones, menuCalcular, menuAcerca, menuColorFondo;
	private JMenuItem menuitemNuevo, menuitemSalir, menuitemVacaciones, menuitemCreador, menuitemRojo, menuitemNegro, menuitemMorado;
	private JLabel lbBienvenido, lbLogo, lbLeyenda, lbNombre, lbApellidoM, lbApellidoP,  lbDepartamento, lbAntiguedad, lbResultado, lbPiePagina;
	private JTextField txtNombre, txtApellidoM, txtApellidoP;
	private JTextArea txaCalculo;
	private JScrollPane scrollpane1;
	private JComboBox comboDepartamento, comboAntiguedad;
	String nombreAdministrador="";

	public PantallaPrincipal(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(255, 0, 0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenida ventanaBienvenida= new Bienvenida();
		nombreAdministrador =ventanaBienvenida.texto; //para recuperar la variable

		menubar=new JMenuBar();
		menubar.setBackground(new Color(255, 0, 0));
		setJMenuBar(menubar);
		
		menuOpciones = new JMenu("Opciones");
		menuOpciones.setBackground(new Color(255, 0, 0));
		menuOpciones.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.setForeground(new Color(255, 255, 255)); //Color de letra
		menubar.add(menuOpciones);

		menuColorFondo=new JMenu("Color de Fondo");
		menuColorFondo.setBackground(new Color(224, 224, 224));
		menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.setForeground(new Color(255, 0, 0)); //Color de letra
		menuOpciones.add(menuColorFondo);

		menuitemRojo=new JMenuItem("Rojo");
		menuitemRojo.setBackground(new Color(224, 224, 224));
		menuitemRojo.setFont(new Font("Andale Mono", 1, 14));
		menuitemRojo.setForeground(new Color(255, 0, 0)); //Color de letra
		menuColorFondo.add(menuitemRojo);
		menuitemRojo.addActionListener(this);

		menuitemNegro=new JMenuItem("Negro");
		menuitemNegro.setBackground(new Color(224, 224, 224));
		menuitemNegro.setFont(new Font("Andale Mono", 1, 14));
		menuitemNegro.setForeground(new Color(255, 0, 0)); //Color de letra
		menuColorFondo.add(menuitemNegro);
		menuitemNegro.addActionListener(this);

		menuitemMorado=new JMenuItem("Morado");
		menuitemMorado.setBackground(new Color(224, 224, 224));
		menuitemMorado.setFont(new Font("Andale Mono", 1, 14));
		menuitemMorado.setForeground(new Color(255, 0, 0)); //Color de letra
		menuColorFondo.add(menuitemMorado);
		menuitemMorado.addActionListener(this);

		menuitemNuevo = new JMenuItem("Nuevo");
		menuitemNuevo.setBackground(new Color(224, 224, 224));
		menuitemNuevo.setFont(new Font("Andale Mono", 1, 14));
		menuitemNuevo.setForeground(new Color(255, 0, 0)); //Color de letra
		menuOpciones.add(menuitemNuevo);
		menuitemNuevo.addActionListener(this);

		menuitemSalir = new JMenuItem("Salir");
		menuitemSalir.setBackground(new Color(224, 224, 224));
		menuitemSalir.setFont(new Font("Andale Mono", 1, 14));
		menuitemSalir.setForeground(new Color(255, 0, 0)); //Color de letra
		menuOpciones.add(menuitemSalir);
		menuitemSalir.addActionListener(this);

		menuCalcular=new JMenu("Calcular");
		menuCalcular.setBackground(new Color(255, 0, 0));
		menuCalcular.setFont(new Font("Andale Mono", 1, 14));
		menuCalcular.setForeground(new Color(255, 255, 255)); //Color de letra
		menubar.add(menuCalcular);
	
		menuitemVacaciones=new JMenuItem("Vacaciones");
		menuitemVacaciones.setBackground(new Color(224, 224, 224));
		menuitemVacaciones.setFont(new Font("Andale Mono", 1, 14));
		menuitemVacaciones.setForeground(new Color(255, 0, 0)); //Color de letra
		menuCalcular.add(menuitemVacaciones);
		menuitemVacaciones.addActionListener(this);
		
		menuAcerca=new JMenu("Acerca de");
		menuAcerca.setBackground(new Color(255, 0, 0));
		menuAcerca.setFont(new Font("Andale Mono", 1, 14));
		menuAcerca.setForeground(new Color(255, 255, 255)); //Color de letra
		menubar.add(menuAcerca);
		
		menuitemCreador = new JMenuItem("El Creador");
		menuitemCreador.setBackground(new Color(224, 224, 224));
		menuitemCreador.setFont(new Font("Andale Mono", 1, 14));
		menuitemCreador.setForeground(new Color(255, 0, 0)); //Color de letra
		menuAcerca.add(menuitemCreador);
		menuitemCreador.addActionListener(this);

		lbBienvenido=new JLabel("Bienvenido " +nombreAdministrador);
		lbBienvenido.setBounds(280, 30, 300, 50);
		lbBienvenido.setFont(new Font("Andale Mono", 1, 32));
		lbBienvenido.setForeground(new Color(255, 255, 255));
		add(lbBienvenido);

		ImageIcon imagen=new ImageIcon("images/logo-coca.png");
		lbLogo=new JLabel(imagen);
		lbLogo.setBounds(30, 30, 300, 50);
		add(lbLogo);

		lbLeyenda= new JLabel("Datos del trabajador para el cálculo de vacaciones");
		lbLeyenda.setBounds(45, 140, 900, 25);
		lbLeyenda.setFont(new Font("Andale Mono", 0, 24));
		lbLeyenda.setForeground(new Color(255, 255, 255));
		add(lbLeyenda);

		lbNombre=new JLabel("Nombre completo:");
		lbNombre.setBounds(25, 188, 180, 25);
		lbNombre.setFont(new Font("Andale Mono", 1, 12));
		lbNombre.setForeground(new Color(255, 255, 255));
		add(lbNombre);

		txtNombre= new JTextField();
		txtNombre.setBounds(25,213, 150, 25);
		txtNombre.setBackground(new Color(224, 224, 224)); 
		txtNombre.setFont(new Font("Andale Mono", 1, 14));
		txtNombre.setForeground(new Color(255,0,0)); 
		add(txtNombre);

		lbApellidoM=new JLabel("Apellido Materno:");
		lbApellidoM.setBounds(25, 308, 180, 25);
		lbApellidoM.setFont(new Font("Andale Mono", 1, 12));
		lbApellidoM.setForeground(new Color(255, 255, 255));
		add(lbApellidoM);

		txtApellidoM=new JTextField();
		txtApellidoM.setBounds(25,334, 150, 25);
		txtApellidoM.setBackground(new Color(224, 224, 224)); 
		txtApellidoM.setFont(new Font("Andale Mono", 1, 14));
		txtApellidoM.setForeground(new Color(255,0,0)); 
		add(txtApellidoM);
		
		lbApellidoP=new JLabel("Apellido Paterno:");
		lbApellidoP.setBounds(25, 248, 180, 25);
		lbApellidoP.setFont(new Font("Andale Mono", 1, 12));
		lbApellidoP.setForeground(new Color(255, 255, 255));
		add(lbApellidoP);  

		txtApellidoP=new JTextField();
		txtApellidoP.setBounds(25,273, 150, 25);
		txtApellidoP.setBackground(new Color(224, 224, 224)); 
		txtApellidoP.setFont(new Font("Andale Mono", 1, 14));
		txtApellidoP.setForeground(new Color(255,0,0)); 
		add(txtApellidoP);

		lbDepartamento=new JLabel("Selecciona el Departamento:");
		lbDepartamento.setBounds(220, 188, 180, 25);
		lbDepartamento.setFont(new Font("Andale Mono", 1, 12));
		lbDepartamento.setForeground(new Color(255, 255, 255));
		add(lbDepartamento);

		comboDepartamento =new JComboBox();
		comboDepartamento.setBounds(220, 213, 220, 25);
		comboDepartamento.setBackground(new Color(224, 224, 224)); 
		comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
		comboDepartamento.setForeground(new Color(255,0,0)); 
		add(comboDepartamento);

		comboDepartamento.addItem("");
		comboDepartamento.addItem("Atención al cliente");
		comboDepartamento.addItem("Departamento de Logística");
		comboDepartamento.addItem("Departamento de Gerencia");
		//comboDepartamento.addItemListener(this);
		
		lbAntiguedad=new JLabel("Selecciona la Antigûedad:");
		lbAntiguedad.setBounds(220, 248, 180, 25);
		lbAntiguedad.setFont(new Font("Andale Mono", 1, 12));
		lbAntiguedad.setForeground(new Color(255, 255, 255));
		add(lbAntiguedad);

		comboAntiguedad=new JComboBox();
		comboAntiguedad.setBounds(220, 273, 220, 25);
		comboAntiguedad.setBackground(new Color(224, 224, 224)); 
		comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
		comboAntiguedad.setForeground(new Color(255,0,0)); 
		add(comboAntiguedad);

		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 año de servicio");
		comboAntiguedad.addItem("2 a 6 años de servicio");
		comboAntiguedad.addItem("7 años o más de servicio");
		//comboAntiguedad.addItemListener(this);	

		lbResultado=new JLabel("Resultado del Cálculo:");
		lbResultado.setBounds(220, 300, 200, 20);
		lbResultado.setFont(new Font("Andale Mono", 1, 14));
		lbResultado.setForeground(new Color(255, 255, 255));
		add(lbResultado);

		txaCalculo = new JTextArea();
		txaCalculo.setEditable(false);
		txaCalculo.setBackground(new Color(224, 224, 224)); 
		txaCalculo.setFont(new Font("Andale Mono", 1, 11));
		txaCalculo.setForeground(new Color(255,0,0)); 
		txaCalculo.setText("\n Aquí aparece el resultado del cálculo de las vacaciones.");
		scrollpane1= new JScrollPane(txaCalculo);
		scrollpane1.setBounds(220, 333, 385, 90);
		add(scrollpane1);

		lbPiePagina=new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
		lbPiePagina.setBounds(135, 445, 500, 30);
		lbPiePagina.setFont(new Font("Andale Mono", 1, 12));
		lbPiePagina.setForeground(new Color(255, 255, 255));
		add(lbPiePagina);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==menuitemVacaciones){
			String nombreTrabajador =txtNombre.getText();
			String AP=txtApellidoP.getText();
			String AM=txtApellidoM.getText();
			String Departamento=comboDepartamento.getSelectedItem().toString();
			String Antiguedad=comboAntiguedad.getSelectedItem().toString();

			if(nombreTrabajador.equals("")||AP.equals("")||AM.equals("")||Departamento.equals("")||Antiguedad.equals("")){
				JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
			}else{
				if(Departamento.equals("Atención al cliente")){
					if(Antiguedad.equals("1 año de servicio")){
						txaCalculo.setText("\n   El trabajador " +nombreTrabajador+ " " +AP+ " "+AM +
							            "\n  quien labora en "+Departamento+" con "+Antiguedad +
							            "\n  recibe 6 días de vacaciones.");
					}
					if(Antiguedad.equals("2 a 6 años de servicio")){
						txaCalculo.setText("\n   El trabajador " +nombreTrabajador+ " " +AP+ " "+AM +
							            "\n  quien labora en "+Departamento+" con "+Antiguedad +
							            "\n  recibe 14 días de vacaciones.");
					}
					if(Antiguedad.equals("7 años o más de servicio")){
						txaCalculo.setText("\n   El trabajador " +nombreTrabajador+ " " +AP+ " "+AM +
							            "\n  quien labora en "+Departamento+" con "+Antiguedad +
							            "\n  recibe 20 días de vacaciones.");
					}
				}
				if(Departamento.equals("Departamento de Logística")){
					if(Antiguedad.equals("1 año de servicio")){
						txaCalculo.setText("\n   El trabajador " +nombreTrabajador+ " " +AP+ " "+AM +
							            "\n  quien labora en "+Departamento+" con "+Antiguedad +
							            "\n  recibe 7 días de vacaciones.");
					}
					if(Antiguedad.equals("2 a 6 años de servicio")){
						txaCalculo.setText("\n   El trabajador " +nombreTrabajador+ " " +AP+ " "+AM +
							            "\n  quien labora en "+Departamento+" con "+Antiguedad +
							            "\n  recibe 15 días de vacaciones.");
					}
					if(Antiguedad.equals("7 años o más de servicio")){
						txaCalculo.setText("\n   El trabajador " +nombreTrabajador+ " " +AP+ " "+AM +
							            "\n  quien labora en "+Departamento+" con "+Antiguedad +
							            "\n  recibe 22 días de vacaciones.");
					}

				}
				if(Departamento.equals("Departamento de Gerencia")){
					if(Antiguedad.equals("1 año de servicio")){
						txaCalculo.setText("\n   El trabajador " +nombreTrabajador+ " " +AP+ " "+AM +
							            "\n  quien labora en "+Departamento+" con "+Antiguedad +
							            "\n  recibe 10 días de vacaciones.");
					}
					if(Antiguedad.equals("2 a 6 años de servicio")){
						txaCalculo.setText("\n   El trabajador " +nombreTrabajador+ " " +AP+ " "+AM +
							            "\n  quien labora en "+Departamento+" con "+Antiguedad +
							            "\n  recibe 20 días de vacaciones.");
					}
					if(Antiguedad.equals("7 años o más de servicio")){
						txaCalculo.setText("\n   El trabajador " +nombreTrabajador+ " " +AP+ " "+AM +
							            "\n  quien labora en "+Departamento+" con "+Antiguedad +
							            "\n  recibe 30 días de vacaciones.");
					}

				}
			}
		}
		if(e.getSource()==menuitemRojo){
			getContentPane().setBackground(new Color(255, 0, 0));
		}
		if(e.getSource()==menuitemNegro){
			getContentPane().setBackground(new Color(0, 0, 0));			
		}
		if(e.getSource()==menuitemMorado){
			getContentPane().setBackground(new Color(51, 0, 51));	
		}
		if(e.getSource()==menuitemNuevo){
			txtNombre.setText("");
			txtApellidoP.setText("");
			txtApellidoM.setText("");
			comboDepartamento.setSelectedIndex(0); //Restaurar al valor original el combo
			comboAntiguedad.setSelectedIndex(0);
			txaCalculo.setText("\n Aquí aparece el resultado del cálculo de las vacaciones.");
		}
		if(e.getSource()==menuitemSalir){
			Bienvenida ventanabienvenida=new Bienvenida();
			ventanabienvenida.setBounds(0,0,350,450);
			ventanabienvenida.setVisible(true);
			ventanabienvenida.setResizable(false);
			ventanabienvenida.setLocationRelativeTo(null);	
			this.setVisible(false);
		}
		if(e.getSource()==menuitemCreador){
			JOptionPane.showMessageDialog(null, "Desarrollado por Legoal");	
		}
	}

	public static void main(String args[]){
		PantallaPrincipal principal=new PantallaPrincipal();
		principal.setBounds(0,0,640,535);
		principal.setVisible(true);
		principal.setResizable(false);
		principal.setLocationRelativeTo(null);
	}
}