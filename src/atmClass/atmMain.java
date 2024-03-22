package atmClass;

import java.util.Scanner;

public class atmMain {

	public static void main(String[] args) {
		
		String[] cc = {"1234", "Riccardo", "10000"};
		
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Seleziona un operazione:");
			System.out.println("1 per il deposito");
			System.out.println("2 per l'estratto conto");
			System.out.println("3 per prelevare");
			System.out.println("4 per uscire");
			
			int decision = keyboard.nextInt();
			if(decision==1) {
				System.out.println("Quanto vuoi versare?");
				int euroVersati = keyboard.nextInt();
				int saldo = Integer.parseInt(cc[2]);
				saldo = saldo+euroVersati;
				cc[2]= String.valueOf(saldo);
			}
			if(decision==2) {
				System.out.println("Saldo sul conto: "+cc[2]);
			}
			
			if(decision==3) {
				System.out.println("Quanto vuoi prelevare?");
				int euroDaPrelevare = keyboard.nextInt();
				int saldo = Integer.parseInt(cc[2]);
				if(euroDaPrelevare>saldo) {
					System.out.println("Non ci sono abbstanza euro");
				}
				else {
					saldo = saldo-euroDaPrelevare;
					cc[2]=String.valueOf(saldo);
				}

				}
			
			if(decision==4) {
				System.out.println("Arrivederci");
				break;
			
				}

			}
		}

}
