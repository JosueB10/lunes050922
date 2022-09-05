package repetitivas;
import java.util.Scanner;

public class EstructurasRepetitivas {

	public static void main(String[] args) {
		
		Scanner lector =new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		int  edad=lector.nextInt();

		//int contador=0;
		
		while(edad< 0){ 
			System.out.println("Edad Incorrecta\t");
			System.out.println("Ingrese su edad: ");
			edad = lector.nextInt();
	  
		
		}
		
		
		
System.out.println("Fin del programa");
	}

}
