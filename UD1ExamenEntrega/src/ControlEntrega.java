import java.util.Scanner;

public class ControlEntrega {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//llamar al Scanner
		Scanner teclado = new Scanner(System.in);
		
		//declarar constantes
		final int porcentajeTotal = 100;
		
		//declarar variables
		String codigo; //codigo de entrega
		int unirec; //unidades recibidas
		int unidev; //unidades devueltas
		//variables calculabls
		int unidis; //unidades disponibles
		double porcentaje; //porcentaje devuelto
		boolean quedan; //todavía quedan disponibles?
		boolean noQuedan; //devolucion total
		
		//Leer y almacenar los datos
		System.out.println("introduce los datos requeridos: ");
		System.out.print("Codigo de entrega: ");
		codigo = teclado.next();
		System.out.print("Unidades recibidas: ");
		unirec = teclado.nextInt();
		System.out.print("Unidades devueltas: ");
		unidev = teclado.nextInt();
		
		//calcular unidades disponibles
		unidis = unirec - unidev;
		//calcular porcentaje
		porcentaje = (double)(unidev * porcentajeTotal) / unirec;
		//quedan unidades?
		quedan = unidis > 0;
		//no quedan?
		noQuedan = unidis == 0;
		
		//bloque final estructurado
		System.out.println("---RESULTADO ENTREGA---");
		System.out.println("CODIGO= " + codigo);
		System.out.println("UNIDADES_DISPONIBLES= " + unidis);
		System.out.println("PORCENTAJE_DEVUELTO= " + porcentaje);
		System.out.println("QUEDAN_UNIDADES= " + quedan);
		System.out.println("DEVOLUCION_TOTAL= " + noQuedan);
		
		
	}

}
