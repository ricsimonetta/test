package ex14;

import java.util.List;

public class Vasca {
	private String nome;
	private List<Esemplare> esemplari;
	
	
	public Vasca(String nome, List<Esemplare> esemplari) {
		this.nome = nome;
		this.esemplari = esemplari;
	}
	
	public List<Esemplare> getEsemplari() {
		return esemplari;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Vasca [nome=" + nome + ", esemplari=" + esemplari + "]";
	}
	
	
}
