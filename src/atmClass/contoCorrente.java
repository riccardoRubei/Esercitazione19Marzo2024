package atmClass;

public class contoCorrente {
	
	private int numeroConto;
	
	private int saldo;

	public int getNumeroConto() {
		return numeroConto;
	}

	public void setNumeroConto(int numeroConto) {
		this.numeroConto = numeroConto;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public contoCorrente(int numeroConto, int saldoIniziale) {
		this.numeroConto=numeroConto;
		this.saldo=saldoIniziale;
	}
	
	public int getEstrattoConto(){
		return this.getSaldo();
	}
	
	public void versamento(int denaro){
		int saldoAttuale = this.getSaldo();
		saldoAttuale = saldoAttuale+denaro;
		this.setSaldo(saldoAttuale);
	}

	public void prelievo(int denaro){
		int saldoAttuale = this.getSaldo();
		saldoAttuale = saldoAttuale-denaro;
		this.setSaldo(saldoAttuale);
	}
	
}
