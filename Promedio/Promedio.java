public class Promedio{
	public static void main(String args[]){
		int matematicas=5;
		int biologia=8;
		int quimica=9;
		int promedio=0;
		
		promedio = (matematicas+biologia+quimica)/3;
		
		if(promedio>=6){
			System.out.println("El alumno aprob� con " + promedio);
		}else{
			System.out.println("El alumno reprob� con " +promedio);
		}
		
	}
}