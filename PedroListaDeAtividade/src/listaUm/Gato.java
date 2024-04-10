package listaUm;

public class Gato {
	private String nome;
	private String raca;
	private int idade;
	public Gato(String n, String r, int i) {
		this.nome = n;
		this.raca = r;
		this.idade = i;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nNome) {
		this.nome = nNome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String nRaca) {
		this.raca = nRaca;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int nIdade) {
		this.idade = nIdade;
	}
	public String miar() {
		return "Miau!";
	}
}
