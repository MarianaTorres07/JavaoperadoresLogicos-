package operadoresLogicos;

public class ejerciciosOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Los operadores lógicos se utilizan para cambiar valores booleanos y nos devuelven un resultado verdadero, falso o nullo.
		 
		 // && and (Y)
		 // || or (O)
		 // ! not (no)
		 
		 */
		
		int a = 5;
		int b = 3;
		
		System.out.println(a == b || a > b);
		

		
		/* Ejercicio de Par Y Impar
		 * */
		
		int num = 6;
		
		//boolean resultado = (num%2 == 0);
		
		if (num%2 == 0) {
			System.out.println("El numero es par");
			
		}else {
			System.out.println("El numero es impar");
		}
	}
	
	

}
