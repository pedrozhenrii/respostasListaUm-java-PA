package listaUm;

public class Carro {
	private String modelo;
	private String marca;
	private int ano;
	private String placa;
	public Carro(String m, String ma, int a, String p) {
		this.modelo = m;
		this.marca = ma;
		this.ano = a;
		this.placa = p;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String nModelo) {
		this.modelo = nModelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String nMarca) {
		this.marca = nMarca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int nAno) {
		this.ano = nAno;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String nPlaca) {
		this.placa = nPlaca;
	}
	
}