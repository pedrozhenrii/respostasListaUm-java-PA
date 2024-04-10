package listaUm;

public class Disciplina {
	private String nome;
	private int codigo;
	public Disciplina(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nNome) {
		this.nome = nNome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int nCodigo) {
		this.codigo = nCodigo;
	}
	
}
