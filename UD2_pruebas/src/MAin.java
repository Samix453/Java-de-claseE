import java.util.Scanner;

public class MAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//constantes
		final int max = 20;
		
		//variables
		int n =1;
		int dato;
		int eleccion;
		
		//for para hacer que cuente hasta 20================
		while (n <= max) {
			System.out.println(n);
			n = n + 1;
		}
		
		//for para hacerlo postivo==========================
		System.out.println("inserta un dato: ");
		dato = teclado.nextInt();
		
		while (dato <= 0) {
			if (dato <= 0 ) {
				System.out.println("inserta un dato: ");
				dato = teclado.nextInt();
			} else {
				break;
			}
		}
		
		//menú hasta elejir 0
			
		System.out.println("======Calculadora premium======");
		System.out.println("===        1. suma          ===");
		System.out.println("===       2. resta          ===");
		System.out.println("===  3. multiplicacion      ===");
		System.out.println("=== 0. compra versión full  ===");
		System.out.println("===============================");
		eleccion = teclado.nextInt();
		
		while (eleccion < 0 || eleccion > 0) {
			System.out.println("");
			System.out.println("debes comprar la versión full. ");
			System.out.println("");
			System.out.println("======Calculadora premium======");
			System.out.println("===        1. suma          ===");
			System.out.println("===       2. resta          ===");
			System.out.println("===  3. multiplicacion      ===");
			System.out.println("=== 0. compra versión full  ===");
			System.out.println("===============================");
			eleccion = teclado.nextInt();
		}
		System.out.println("inserte su numero de banco, DNI, correo electrónico, foto de la cara, dirección de la casa, cuándo sales de casa y quien se queda dentro, de que a qué hora no hay nadie dentro de casa...");
	}

}
