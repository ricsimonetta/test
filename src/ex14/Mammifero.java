package ex14;

public class Mammifero extends Esemplare {
	private int periodo;
	
	public Mammifero(int id, int eta, int periodo) {
		super(id, eta);
		this.periodo = periodo;
	}
	@Override
	public String toString() {
		return super.toString()+ "\n Periodo: " + this.periodo;
	}
}
