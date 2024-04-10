package listaUm;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	public Aluno(String n, String m, String c) {
		this.nome = n;
		this.matricula = m;
		this.curso = c;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nNome) {
		this.nome = nNome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String nMatricula) {
		this.matricula = nMatricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String nCurso) {
		this.curso = nCurso;
	}
	
}
