package atmSimulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		ContoCorrente cc1 = new ContoCorrente(1,10000);
		ContoCorrente cc2 = new ContoCorrente(2,50000);
		ContoCorrente[] listaCC;
		listaCC = new ContoCorrente[2];
		listaCC[0] = cc1;
		listaCC[1] = cc2;
//		System.out.println(cc.estrattoConto());
//		cc.deposita(500);
//		System.out.println(cc.estrattoConto());
		
		
		Scanner keyboard = new Scanner(System.in);

		while(true) {
			System.out.println("Inserisci il numero di conto: ");
			int numeroConto = keyboard.nextInt();
			ContoCorrente ccAttuale = null;
			
			for(int i=0; i<listaCC.length; i++) {
				if(listaCC[i].getNumeroConto()==numeroConto) {
					ccAttuale = listaCC[i];
				}
			}
			if(ccAttuale!= null){
				System.out.println("Seleziona un operazione:");
				System.out.println("1 per il deposito");
				System.out.println("2 per l'estratto conto");
				System.out.println("3 per uscire");
				int decision = keyboard.nextInt();
				if(decision==1) {
					System.out.println("Quanto vuoi versare?");
					int euroVersati = keyboard.nextInt();
					ccAttuale.deposita(euroVersati);
				}
				if(decision==2) {
					System.out.println("Saldo sul conto: "+ccAttuale.estrattoConto());
				}
				if(decision==3) {
					System.out.println("Arrivederci");
					break;
				}
			}
		}
		
	}

}
