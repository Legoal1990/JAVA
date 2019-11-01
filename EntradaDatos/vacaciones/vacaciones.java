import java.util.Scanner;
public class vacaciones{
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		String nombre="";
		int clave=0, antiguedad=0;		
		
		System.out.println("Bienvenido al sistema vacacional de Coca-Cola Company");
		System.out.println("¿Cuál es el nombre del trabajador?");
		nombre=entrada.nextLine();
		System.out.println("");

		System.out.println("¿Cuántos años de servicio tiene el trabajador?");
		antiguedad=entrada.nextInt();
		System.out.println("");

		System.out.println("¿Cuál es la clave de su departamento?");
		clave=entrada.nextInt();
		System.out.println("");
		
		if (clave==1){
			if(antiguedad==1){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " años de servicio y merece 6 días de vacaciones");
			}
			else if(antiguedad>=2&&antiguedad<=6){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " años de servicio y merece 14 días de vacaciones");
			}
			else if((antiguedad>=7)){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " años de servicio y merece 20 días de vacaciones");
			}else{
				System.out.println("Aún no tiene derecho a vacaciones");
			}
		}else if(clave==2){
			if(antiguedad==1){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " años de servicio y merece 7 días de vacaciones");
			}
			else if(antiguedad>=2&&antiguedad<=6){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " años de servicio y merece 15 días de vacaciones");
			}
			else if((antiguedad>=7)){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " años de servicio y merece 22 días de vacaciones");
			}else{
				System.out.println("Aún no tiene derecho a vacaciones");
			}
		}else if(clave==3){
			if(antiguedad==1){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " años de servicio y merece 10 días de vacaciones");
			}
			else if(antiguedad>=2&&antiguedad<=6){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " años de servicio y merece 20 días de vacaciones");
			}
			else if((antiguedad>=7)){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " años de servicio y merece 30 días de vacaciones");
			}else{
				System.out.println("Aún no tiene derecho a vacaciones");
			}
		}else{
			System.out.println("Error, la clave del departamento no existe");
		}
	}	
}