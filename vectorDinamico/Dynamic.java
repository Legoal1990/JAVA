import java.util.Scanner;

public class Dynamic{
	public static void main(String args[]){
	
	int longitudVector=0;
	Scanner entrada=new Scanner(System.in);
	
	System.out.println("¿Cuántos numeros deseas ingresar:?");
	longitudVector=entrada.nextInt();
	
	int vector[]=new int[longitudVector];
		
	for(int i=0; i<vector.length; i++){
		System.out.println("Introduce el valor para la posición vector["+(i+1)+"]");
		vector[i]=entrada.nextInt();
	}
	
	for(int i=0; i<vector.length; i++){
		if(i<vector.length-1){
			System.out.print("["+vector[i] +"],");
		}else{
			System.out.print("["+vector[i] +"]");
		}
	}
   }
}