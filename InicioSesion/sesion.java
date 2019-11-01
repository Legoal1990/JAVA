import java.util.Scanner;

public class sesion{
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		String usuario="Legoal", contraseña="Macuspana123";
		String user="", pass="";
	
		System.out.println("Por favor ingresa el nombre del usuario:");
		user=entrada.nextLine();	

		System.out.println("Por favor ingresa la contraseña");
		pass=entrada.nextLine();
	
		if(user.equals(usuario) && pass.equals(contraseña)){
			System.out.println("Inicio de sesión correcto");
		}else{
			System.out.println("El nombre del usuario y contraseña son incorrectos");
		}
	}
}