import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leggi = new Scanner(System.in);
		int valore;
		String risposta = new String();
		Automobile a = new Automobile(0, 0, 0, 0);
		do {
			System.out.println("1 - Inserisci anno macchina");
			System.out.println("2 - Inserisci cilindrata macchina");
			System.out.println("3 - Inserisci velocità macchina");
			System.out.println("4 - Inserisci costo macchina");
			System.out.println("5 - Visualizza macchina attuale");
			System.out.println("q - Termina programma");
			risposta = leggi.next();
			switch(risposta.charAt(0)) {
			case '1':
				System.out.print("Anno macchina: ");
				valore = leggi.nextInt();
				a.setAnno(valore);
				break;
			case '2':
				System.out.print("Cilindrata macchina: ");
				valore = leggi.nextInt();
				a.setCilindrata(valore);
				break;
			case '3':
				System.out.print("Velocità macchina: ");
				valore = leggi.nextInt();
				a.setVelocita(valore);
				break;
			case '4':
				System.out.print("Costo macchina: ");
				valore = leggi.nextInt();
				a.setCosto(valore);
				break;
			case '5':
				a.stampaAttributi();
				break;
			case 'q':
				System.out.println("Chiusura programma");
				break;
			default:
				System.out.println("Scelta sbagliata");
			}
		}while(!risposta.equals("q"));
		
	}

}
