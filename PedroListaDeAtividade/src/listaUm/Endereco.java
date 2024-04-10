package listaUm;

public class Endereco {
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public Endereco(String r, int n, String c, String b, String ci, String e,
			String ce) {
		this.rua = r;
		this.numero = n;
		this.complemento = c;
		this.bairro = b;
		this.cidade = ci;
		this.estado = e;
		this.cep = ce;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String nRua) {
		this.rua = nRua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int nNumero) {
		this.numero = nNumero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String nComplemento) {
		this.complemento = nComplemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String nBairro) {
		this.bairro = nBairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String nCidade) {
		this.cidade = nCidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String nEstado) {
		this.estado = nEstado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String nCep) {
		this.cep = nCep;
	}

}
