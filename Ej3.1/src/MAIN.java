import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner teclado = new Scanner(System.in);
				int codigo;
				System.out.println("Introduce el codigo");
				codigo = teclado.nextInt();
				
				if (codigo >= 200 && codigo <= 299){
					System.out.println("Correcto");
				} else if (codigo >= 400 && codigo <= 499) {
					System.out.println("Error del cliente");
				} else if (codigo >= 500 && codigo <= 599) {
					System.out.println("Error del servidor");
				} else {
					System.out.println("Otro estado");
				}
	}

}
