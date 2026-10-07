import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String sigma;
		System.out.println("Inserte un comando: ");
		sigma = teclado.next();
		
		switch (sigma){
		case "crear":
			System.out.println("que quieres crear ");
			break;
		case "listar":
			System.out.println("que quieres listar ");
			break;
		case "salir":
			System.out.println("saliendo... ");
			break;
		default:
			System.out.println("opcion invalida");

		}
	}

}
