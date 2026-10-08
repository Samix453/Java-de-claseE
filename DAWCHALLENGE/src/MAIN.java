import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//declarar constantes
		
		//declarar variables insertadas
		String name;
		String code;
		int prog;
		int log;
		int teamWork;
		int months;
		boolean rules;
		boolean auth = false;
		boolean penalty;
		int itinerary;
		
		//variables
		double index;
		int trueFalse;
		int yearsOld;
		int indexComp;
		boolean techRequirements = false;
		
		//pedir los datos
		System.out.println("Inserte el nombre: ");
		name = teclado.next();
		System.out.println("Inserte el codgio: ");
		code = teclado.next();
		System.out.println("Inserte nota programacion: ");
		prog = teclado.nextInt();
		System.out.println("Inserte nota lógica: ");
		log = teclado.nextInt();
		System.out.println("Inserte nota trabajo en equipo: ");
		teamWork = teclado.nextInt();
		System.out.println("Inserte meses haciendo programación: ");
		months = teclado.nextInt();
		System.out.println("Has aceptado las normas de participacion?: ");
		System.out.println("1 = si ; 0 = no");
		trueFalse = teclado.nextInt();
		if (trueFalse == 1) {
			rules = true;
		} else {
			rules = false;
		}
		System.out.println("Años del alumno: ");
		yearsOld = teclado.nextInt();
		if (yearsOld < 16) {
			System.out.println("debes tener al menos 16 años");
		} else if (yearsOld >= 16 && yearsOld < 18) {
			System.out.println("debes tener permiso por tus padres. ");
			System.out.println("tienes el permiso?: ");
			System.out.println("1 = si ; 0 = no");
			trueFalse = teclado.nextInt();
			if (trueFalse == 1) {
				auth = true;
			} else {
				auth = false;
			}
		} else {
			System.out.println("no necesitas autorización");
		}
		System.out.println("tienes alguna penalización?: ");
		System.out.println("1 = si ; 0 = no");
		trueFalse = teclado.nextInt();
		if (trueFalse == 1) {
			penalty = true;
		} else {
			penalty = false;
		}
		System.out.println("itinerario solicitado: ");
		System.out.println("1 = Desarrollo web ; 2 = Datos ; 3 = Ciberseguridad ");
		itinerary = teclado.nextInt();
		switch (itinerary) {
		case 1:
			System.out.println("desarrollo web seleccionado");
		case 2:
			System.out.println("datos seleccionado");
		case 3:
			System.out.println("Ciberseguridad seleccionado");
		}
		
		//calculo indice
		index = (2 * prog + 2 * log + teamWork) / 5;
		System.out.println("Este es el índice de seleccion: " + index);
		indexComp = (2 * prog + 2 * log + teamWork) / 5;
		System.out.println("Este es el índice de seleccion redondeado: " + indexComp);
		
		//requisito técnico
		if (prog < 60 && log < 60) {
			System.out.println("no has cumplido el requisito técnico.");
			techRequirements = false;
		} else if (prog >= 60 && log >= 60) {
			System.out.println("Has cumplido el requisito de admisión");
			techRequirements = true;
		} else if (indexComp >= 75 && teamWork >= 85) {
			System.out.println("Has cumplido el requisito de admisión");
			techRequirements = true;
		}
		//justificar resultado de no admisión
		
		if (penalty = true) {
			System.out.println("RESULTADO NO ADMITIDO:");
			System.out.println("MOTIVO: Sanción activa");
		} else if (rules = false) {
			System.out.println("RESULTADO NO ADMITIDO:");
			System.out.println("MOTIVO: Normas NO aceptadas");
		} else if (yearsOld < 18){
			if (yearsOld < 16 ) {
				System.out.println("RESULTADO NO ADMITIDO:");
				System.out.println("MOTIVO: Menor de edad");
			}
			if (auth == false) {
				System.out.println("RESULTADO NO ADMITIDO:");
				System.out.println("MOTIVO: Menor de edad y autorización no aceptada por padres.");
				}
		} else if (techRequirements == false) {
			System.out.println("RESULTADO NO ADMITIDO:");
			System.out.println("MOTIVO: nivel técnico no admitido.");
		} else {
			System.out.println("RESULTADO ADMITIDO:");
		}
	}

}
