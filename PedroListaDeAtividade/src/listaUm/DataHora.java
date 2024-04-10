package listaUm;

public class DataHora {
	Data data;
	Hora hora;
	public DataHora(Data d, Hora h) {
		this.data = d;
		this.hora = h;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data novaData) {
		this.data = novaData;
	}
	public Hora getHora() {
		return hora;
	}
	public void setHora(Hora novaHora) {
		this.hora = novaHora;
	}
	public String imprimirDataHora() {
		return "Data: " + data.imprimirData() + "\nHora: " + hora.imprimirHora();
	}
}
