package listaUm;

public class Empresa {
	private String nome;
	private String cnpj;
	
	public Empresa(String n, String c) {
		this.nome = n;
		this.cnpj = c;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nNome) {
		this.nome = nNome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String nCnpj) {
		this.cnpj = nCnpj;
	}
	
}
