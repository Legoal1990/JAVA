import java.util.Scanner;

public class sesion{
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		String usuario="Legoal", contrase�a="Macuspana123";
		String user="", pass="";
	
		System.out.println("Por favor ingresa el nombre del usuario:");
		user=entrada.nextLine();	

		System.out.println("Por favor ingresa la contrase�a");
		pass=entrada.nextLine();
	
		if(user.equals(usuario) && pass.equals(contrase�a)){
			System.out.println("Inicio de sesi�n correcto");
		}else{
			System.out.println("El nombre del usuario y contrase�a son incorrectos");
		}
	}
}