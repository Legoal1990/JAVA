import java.util.Scanner;

public class sustraer{
	public static void main(String args[]){

		String cadena_original="", cadena_substraccion="";
		int num_caracteres=0, desde =0, hasta =0;
		Scanner entrada=new Scanner(System.in);

		System.out.println("Escriba una cadena de caracteres");
		cadena_original=entrada.nextLine();

		num_caracteres=cadena_original.length(); //Para saber la longitud de la cadena original

		System.out.println("La cadena de caracteres" + cadena_original +"posee" + num_caracteres +"caracteres");

		System.out.println("¿Desde que caracter deseas obtener la nueva cadena?");
		desde=entrada.nextInt();

		System.out.println("¿Hasta que caracter deseas obtener la nueva cadena?");
		hasta=entrada.nextInt();

		cadena_substraccion = cadena_original.substring(desde, hasta);
		System.out.println("La nueva cadena es:"+cadena_substraccion);
	}
}