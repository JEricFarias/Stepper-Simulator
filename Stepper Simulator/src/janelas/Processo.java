package janelas;

public class Processo {
	private int id;
	private int prioridade;
	private int tempoDeChegada;
	private int tempoDeExeculcao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public int getTempoDeChegada() {
		return tempoDeChegada;
	}
	public void setTempoDeChegada(int tempoDeChegada) {
		this.tempoDeChegada = tempoDeChegada;
	}
	public int getTempoDeExeculcao() {
		return tempoDeExeculcao;
	}
	public void setTempoDeExeculcao(int tempoDeExeculcao) {
		this.tempoDeExeculcao = tempoDeExeculcao;
	}

}
