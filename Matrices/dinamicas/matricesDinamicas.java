import java.util.Scanner;

public class matricesDinamicas{
	public static void main(String args[]){
		int filas=0, columnas=0;
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce el número de filas que deseas tenga la matriz:");
		filas=entrada.nextInt();

		System.out.print("Introduce el número de columnas que deseas tenga la matriz:");
		columnas=entrada.nextInt();

		int numeros[][]=new int[filas][columnas];

		for(int i=0; i<filas; i++){
			for(int j=0; j<columnas; j++){
				System.out.print("Introduce el valor para la posición: ["+i+"]"+"["+j+"]:");
				numeros[i][j]=entrada.nextInt();
			}
		}
		for(int i=0; i<filas; i++){
			for(int j=0; j<columnas; j++){
				System.out.print("["+numeros[i][j]+"]");
			}
			System.out.println("");
		}

	}
}