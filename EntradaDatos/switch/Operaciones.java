import java.util.Scanner;
public class Operaciones{
	public static void main(String args[]){
		Scanner entrada= new Scanner(System.in);

		int num_uno=0, num_dos=0, resultado=0;
		int parametro=0;
		System.out. println("Introduce el valor del numero uno:");
		num_uno=entrada.nextInt();
		System.out. println("Introduce el valor del numero dos:");
		num_dos=entrada.nextInt();
		
		System.out. println("Introduce el valor de la operación que deseas realizar:");
		parametro=entrada.nextInt();
		
		switch(parametro){
		case 1: resultado =num_uno + num_dos;
			System.out.println("El resultado de la suma es:" + resultado);
			break;
		case 2: resultado =num_uno - num_dos;
			System.out.println("El resultado de la resta es:" + resultado);
			break;
		case 3: resultado =num_uno * num_dos;
			System.out.println("El resultado de la multiplicación es:" + resultado);
			break;
		case 4: resultado =num_uno / num_dos;
			System.out.println("El resultado de la división es:" + resultado);
			break;
		default:System.out.println("Error: Esta opción no existe");
		}
	}
}