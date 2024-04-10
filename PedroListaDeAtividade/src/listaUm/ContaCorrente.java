package listaUm;

public class ContaCorrente {
	private int numConta;
	private double saldo;
	
	public ContaCorrente(int n, double s) {
		this.numConta = n;
		this.saldo = s;
	}
	public int getNumConta() {
		return numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setNumConta(int n) {
		this.numConta = n;
	}
	public void setSaldo(double s) {
		this.saldo = s;
	}
	public double depositar(double quantidadeDeposito) {
		return this.saldo += quantidadeDeposito;
	}
	public double sacar(double quantidadeSaque) {
		return this.saldo -= quantidadeSaque;
	}
	public String toString() {
		return "Conta: " + numConta + "\nSaldo: R$ " + saldo;
	}
}