package atmSimulation;

import java.util.Scanner;

import atmClass.contoCorrente;

public class myAtm {

	public static void main(String[] args) {
		contoCorrente cc = new contoCorrente(1234,50000);
		//System.out.println(cc.getSaldo());
		Scanner keyboard = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("Seleziona un operazione:");
			System.out.println("1 per il deposito");
			System.out.println("2 per l'estratto conto");
			System.out.println("3 per prelevare");
			System.out.println("4 per uscire");
			
			int decision = keyboard.nextInt();
//			String decision = keyboard.next();
			
			if(decision==1) {
				System.out.println("Quanto vuoi versare?");
				int money = keyboard.nextInt();
				// per mostrare la differenza con la versione procedurale
//				int euroVersati = keyboard.nextInt();
//				int saldo = Integer.parseInt(cc[2]);
//				saldo = saldo+euroVersati;
//				cc[2]= String.valueOf(saldo);
				cc.versamento(money);
				System.out.println(cc.getEstrattoConto());
				
			}
			if(decision==2) {
				System.out.println("Saldo: "+cc.getEstrattoConto());
				
			}
			if(decision==3) {
				System.out.println("Quanto vuoi prelevare?");
				int euroRichiesti = keyboard.nextInt();
				cc.prelievo(euroRichiesti);
				System.out.println(cc.getEstrattoConto());
				
			}
			if(decision==4) {
				break;
			}
		}
	}

}
