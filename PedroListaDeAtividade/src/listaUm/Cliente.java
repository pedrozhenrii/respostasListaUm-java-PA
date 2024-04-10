package listaUm;

public class Cliente {
	private String nome;
	private String cpf;
	private Data dataNascimento;
	
	public Cliente(String n, String c, Data d) {
		this.nome = n;
		this.cpf = c;
		this.dataNascimento = d;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data novaDataNascimento) {
		this.dataNascimento = novaDataNascimento;
	}

	public String imprimirDados() {
		return "Nome:" + nome + "\nCpf:" + cpf + "\nDataNascimento:" + dataNascimento.imprimirData();
	}
	
}
