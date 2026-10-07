import java.util.Scanner;

public class ImagenDigital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//llamar al Scanner
		Scanner teclado = new Scanner(System.in);
		
		//declarar constantes
		final int bytesKB = 1024;
		final int KBMB = 1024;
		final double max = 5.0;
		
		//declarar variables
		String codImg; //codigo imagen
		int anch; //anchura en pixeles
		int alt; //altura en pixeles
		int bytes; //bytes utilizados por pixel
		//variables calculadas
		int totalPx;
		int totalBy;
		int KB;
		int KBRest;
		double MB;
		double limite;
		boolean positivo;
		boolean maxAdmitido;
		boolean perfecto;
		
		//Leer y almacenar los datos
		System.out.println("introduce los datos requeridos: ");
		System.out.print("Introduce el código de imagen: ");
		codImg = teclado.next();
		System.out.print("Introduce la anchura en Px: ");
		anch = teclado.nextInt();
		System.out.print("Introduce la altura en Px:");
		alt = teclado.nextInt();
		System.out.print("Introduce los Bytes por Px: ");
		bytes = teclado.nextInt();
		
		//=============================calculos ====================================
		//numero pixeles y numero bytes imagen
		totalPx = anch * alt;
		totalBy = totalPx * bytes;
		//KB completos contiene y bytes restantes
		KB = totalBy / bytesKB;
		KBRest = totalBy % bytesKB;
		//calcular tamaño exacto en MB
		MB = ((double)totalBy / bytesKB) / KBMB;
		//5MB en bytes
		limite = max * KBMB * bytesKB;
		//todos positivos?
		positivo = anch > 0 && alt > 0 && bytes > 0;
		//cabe la imagen?
		maxAdmitido = MB < max;
		//es admisible si cumple una condicion u otra
		perfecto = maxAdmitido == true || positivo == true;
		
		//Bloque final
		System.out.println("---RESULTADO IMAGEN---");
		System.out.println("CODIGO= " + codImg);
		System.out.println("PIXELES= " + totalPx);
		System.out.println("BYTES_TOTALES= " + totalBy);
		System.out.println("KB_COMPLETOS= " + KB);
		System.out.println("BYTES_RESTANTES= " + KBRest);
		System.out.println("TAMAÑO_MB= " + MB);
		System.out.println("LIMITE_BYTES= " + limite);
		System.out.println("DATOS_POSITIVOS= " + positivo);
		System.out.println("CABE_EN_LIMITE= " + maxAdmitido);
		System.out.println("IMAGEN_ADMISIBLE= " + perfecto);
		
		
	}

}
