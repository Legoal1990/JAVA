import java.util.Scanner;
public class vacaciones{
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		String nombre="";
		int clave=0, antiguedad=0;		
		
		System.out.println("Bienvenido al sistema vacacional de Coca-Cola Company");
		System.out.println("�Cu�l es el nombre del trabajador?");
		nombre=entrada.nextLine();
		System.out.println("");

		System.out.println("�Cu�ntos a�os de servicio tiene el trabajador?");
		antiguedad=entrada.nextInt();
		System.out.println("");

		System.out.println("�Cu�l es la clave de su departamento?");
		clave=entrada.nextInt();
		System.out.println("");
		
		if (clave==1){
			if(antiguedad==1){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " a�os de servicio y merece 6 d�as de vacaciones");
			}
			else if(antiguedad>=2&&antiguedad<=6){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " a�os de servicio y merece 14 d�as de vacaciones");
			}
			else if((antiguedad>=7)){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " a�os de servicio y merece 20 d�as de vacaciones");
			}else{
				System.out.println("A�n no tiene derecho a vacaciones");
			}
		}else if(clave==2){
			if(antiguedad==1){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " a�os de servicio y merece 7 d�as de vacaciones");
			}
			else if(antiguedad>=2&&antiguedad<=6){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " a�os de servicio y merece 15 d�as de vacaciones");
			}
			else if((antiguedad>=7)){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " a�os de servicio y merece 22 d�as de vacaciones");
			}else{
				System.out.println("A�n no tiene derecho a vacaciones");
			}
		}else if(clave==3){
			if(antiguedad==1){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " a�os de servicio y merece 10 d�as de vacaciones");
			}
			else if(antiguedad>=2&&antiguedad<=6){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " a�os de servicio y merece 20 d�as de vacaciones");
			}
			else if((antiguedad>=7)){
				System.out.println(nombre +" con clave " + clave + " tiene "+ antiguedad + " a�os de servicio y merece 30 d�as de vacaciones");
			}else{
				System.out.println("A�n no tiene derecho a vacaciones");
			}
		}else{
			System.out.println("Error, la clave del departamento no existe");
		}
	}	
}