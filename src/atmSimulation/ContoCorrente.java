package atmSimulation;

public class ContoCorrente {

	private long numeroConto;
	
	private int denaro;
	
	public void setDenaro(int denaro) {
		this.denaro = denaro;
	}
	
	public int getSaldo() {
		return this.denaro;
	}
	
	public long getNumeroConto() {
		return this.numeroConto;
	}
	
	public void deposita(int denaro) {
		int saldo = this.getSaldo();
		this.setDenaro(saldo+denaro);
		System.out.println("Hai versato: "+denaro+" euro");
	}
	
	public void preleva() {
		int saldo = this.getSaldo();
		this.setDenaro(saldo-denaro);
		System.out.println("Hai ritirato: "+denaro+" euro");
	}
	
	public int estrattoConto() {
		return getSaldo();
	}
	
	public ContoCorrente(long numeroConto, int denaroIniziale) {
		this.numeroConto=numeroConto;
		this.denaro = denaroIniziale;
	}
	
}
