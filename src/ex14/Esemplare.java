package ex14;

public abstract class Esemplare {
	protected int id;
	protected int eta;

	public int getId() {
		return id;
	}
	
	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Esemplare(int id, int eta) {
		this.id = id;
		this.eta = eta;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Id: " + this.id + "\n Eta: " + this.eta);
	}
}
