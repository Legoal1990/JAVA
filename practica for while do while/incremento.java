public class incremento{
	public static void main(String args[]){
		int i=1, y=99;
		
		System.out.println("Serie con While:");
		System.out.println("");
		while(i<=5){
			if(i<5){
				System.out.print(i + "," + y + ",");
			}else{
				System.out.print(i + "," + y);
				System.out.println("");
			}	
			i++;
			y--;
		}

		System.out.println("Serie con For:");
		System.out.println("");
		i=1; y=99;
		for(i=1; i<=5; i++){
			if(i<5){
				System.out.print(i + ",");
				System.out.print(y + ",");
			}else{
				System.out.print(i + ",");
				System.out.print(y);
				System.out.println("");
			}
			y--;
		}

		System.out.println("Serie con Do-While:");
		System.out.println("");
		i=1; y=99;
		do{
			if(i<5){
				System.out.print(i + ",");
				System.out.print(y + ",");
			}else{
				System.out.print(i + ",");
				System.out.print(y);
				System.out.println("");
			}
			i++; 
			y--;
		}while(i<=5);
	}
}