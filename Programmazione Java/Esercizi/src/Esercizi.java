import java.util.*;

public class Esercizi {
	
	static Scanner leggi =  new Scanner(System.in);
	
	public static void Converti() {
		String risposta;
		do {
			System.out.println("Inserisci numero da convertire: ");
			String a = leggi.next();
			int res = 0;
			int lenght = a.length();
			int b = 1;
			for(int i = lenght-1; i >= 0; i--) {
				res += (a.charAt(i)-'0')*b;
				b *= 2;
			}
			System.out.println("Il valore convertito è: " + res);
			System.out.println("Vuoi inserire un nuovo numero? (*/n)");
			risposta = leggi.next();
		}while(!risposta.equals("n"));
	}
	
	public static void TuttiPositiviPari() {
		int n;
		System.out.println("Quanti numeri vuoi inserire? ");;
		n = leggi.nextInt();
		boolean tuttipari = true;
		int numero;
		System.out.println("Inserisci i " + n + " numeri: ");
		for(int i = 0; i < n; i++) {
			numero = leggi.nextInt();
			if(numero<0 || numero%2!=0) {
				tuttipari = false;
			}
		}
		if(tuttipari) {
			System.out.println("Tutti positivi e pari");
		}else {
			System.out.println("NO");
		}
	}
	
	public static void ContinuaFino() {
		int n, somma = 0;
		boolean continua = true;
		System.out.println("Inserisci i numeri: ");
		do {
			n = leggi.nextInt();
			if(n<0 && n%2!=0) {
				continua = false;
			}else if(n>=0 && n%3!=0) {
				continua = false;
			}else {
				somma += n;
			}
		}while(continua);
		System.out.println("La somma dei valori inseriti è: " + somma);
	}
	
	public static void PositivoNegativo() {
		int n, nPrec = 0;
		boolean ok = false;
		System.out.println("Inserisci i numeri: ");
		do {
			n = leggi.nextInt();
			if(nPrec == 0) {
				nPrec = n;
			}else {
				if(nPrec >= 0 && n < 0) {
					ok  = true;
				}
				nPrec = n;
			}
		}while(n!=0);
		if(ok) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
	}
	
	public static void MediaMultipliDiTre() {
		int n, n_condizione = 0;
		int somma = 0;
		float media;
		int numero;
		System.out.println("Quanti numeri vuoi inserire? ");
		n = leggi.nextInt();
		System.out.println("Inserisci i numeri: ");
		for(int i = 0; i < n; i++) {
			numero = leggi.nextInt();
			if(numero%3==0) {
				somma += numero;
				n_condizione += 1;
			}
		}
		media = (float)somma/(float)n_condizione;
		System.out.println("La media dei numeri multipli di tre è: " + media);
	}
	
	public static void Ripetizioni() {
		int n = 0;
		String s;
		do {
			System.out.println("Quanti caratteri vuoi inserire? ");
			int ripetizioni = leggi.nextInt();
			for(int i = 0; i < ripetizioni; i++) {
				s = leggi.next();
				System.out.println(s);
			}
			n++;
		}while(n != 5);
	}
	
	public static void Contrario() {
		String a;
		System.out.println("Inserire stringa da convertire: ");
		a = leggi.nextLine();
		String reverse = new String();
		for(int i = a.length()-1; i >= 0; i--) {
			reverse += a.charAt(i);
		}
		System.out.println("Stringa reverse: " +reverse);
	}
	
	public static void SoloVocali() {
		String a;
		a = leggi.nextLine();
		String onlyvowel = new String();
		for(int i = 0; i < a.length(); i++) {
			switch(a.charAt(i)) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				onlyvowel += a.charAt(i);
				break;
			default:
			}
		}
		System.out.println("Parola solo vocali: " + onlyvowel);
	}
	
	public static void Lunghezze() {
		String s = new String();
		int somma = 0;
		do {
			s = leggi.next();
			if(s.equals("END")) {
			}else if(s.charAt(0)>='A'&&s.charAt(0)<='Z') {
				somma += s.length();
			}
		}while(!s.equals("END"));
		System.out.println("Somma: " + somma);
	}
	
	public static void Punteggiatura() {
		String s = new String();
		int n = 0;
		do {
			s = leggi.nextLine();
			if(s.equals("END")) {
				
			}else {
				for(int i = 0; i < s.length(); i++) {
					switch(s.charAt(i)) {
					case '.':
					case ',':
					case ';':
					case ':':
					case '!':
					case '?':
						n++;
						break;
					default:
					}
				}
			}
		}while(!s.equals("END"));
		System.out.println("Numero di caratteri di punteggiatura: " + n);
	}
	
	public static void SpaziVocali() {
		String s = new String();
		int n = 0;
		s = leggi.nextLine();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				switch(s.charAt(i+1)) {
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
					n++;
					break;
				default:
				}
			}
		}
		System.out.println("Numero di spazi con successive vocali: " + n);
	}
	
	public static void Concatena() {
		String s = new String();
		String finale = new String();
		for(int i = 0; i < 3; i++) {
			s = leggi.next();
			if(i+1<3) {
				finale += s + "*";
			}else {
				finale += s;
			}
			
		}
		System.out.println(finale);
	}

	public static void StampaZigZag() {
		int [] array =  new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = (int)(Math.random()*100+1);
		}
		System.out.println("Stampa normale");
		for(int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println("Stampa Zig Zag");
		int i = 0;
		int j = 9;
		while(i<j) {
			System.out.print(array[i] + " ");
			System.out.print(array[j] + " ");
			i++;
			j--;
		}
	}
	
	public static void SommaPariDispari() {
		int [] v = new int[10];
		int sommaPari = 0;
		int sommaDispari = 0;
		for(int i = 0; i < 10; i++) {
			v[i] = (int)(Math.random()*10+1);
			System.out.print(v[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < 10; i++) {
			if(i%2==0) {
				sommaPari += v[i];
			}else {
				sommaDispari += v[i];
			}
		}
		if(sommaPari==sommaDispari) {
			System.out.println("Pari e dispari uguali");
		}else {
			System.out.println("Pari e dispari diversi");
		}
	}
	
	public static void SecondoArray() {
		int [] v =  new int[10];
		int n_max = 0;
		System.out.println("Inserire i 10 numeri: ");
		for(int i = 0; i < 10; i++) {
			v[i] = leggi.nextInt();
			if(v[i]>=0) {
				n_max++;
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
		int [] v2 =  new int[n_max];
		int j = 0;
		for(int i = 0; i < 10; i++) {
			if(v[i]>=0) {
				v2[j] = v[i];
				System.out.print(v2[j] + " ");
				j++;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		///Converti();
		//TuttiPositiviPari();
		//ContinuaFino();
		//PositivoNegativo();
		//MediaMultipliDiTre();
		//Ripetizioni();
		//Contrario();
		//SoloVocali();
		//Lunghezze();
		//Punteggiatura();
		//SpaziVocali();
		//Concatena();
		//StampaZigZag();
		//SommaPariDispari();
		//SecondoArray();
	}

}
