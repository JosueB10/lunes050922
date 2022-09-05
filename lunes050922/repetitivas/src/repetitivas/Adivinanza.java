package repetitivas;
import java.util.Scanner;
public class Adivinanza {


	public static void main (String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		long num = Math.round(Math.random() *10);
		System.out.println("Adivine un numero entre 0 y 10: ");
		int resp = lector.nextInt();
		
		int intentos = 1;
		
		while (num != resp) {
			
			System.out.println("Lo siento, numero equivocado. Vuelve a intentarlo");
			System.out.println("Adivine un numero entre 0 y 10: ");
			resp = lector.nextInt();
			intentos++;
			
			if(intentos ==3) {
				System.out.println("Ha agotado todos sus intentos ");
				System.exit(intentos);
					
				}
				}
				
				System.out.println("Fin del juego");
				System.out.println("Has ganado, la respuesta es: "+num);
				
		lector.close();	
			} 
			
		}
	
	
		

	
	

	
	




