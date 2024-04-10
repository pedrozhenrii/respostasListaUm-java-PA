package listaUm;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicacao;
	public Livro(String t, String a, String e, int ap) {
		this.titulo = t;
		this.autor = a;
		this.editora = e;
		this.anoPublicacao = ap;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String nTitulo) {
		this.titulo = nTitulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String nAutor) {
		this.autor = nAutor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String nEditora) {
		this.editora = nEditora;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int nAnoPublicacao) {
		this.anoPublicacao = nAnoPublicacao;
	}
	
	
}
