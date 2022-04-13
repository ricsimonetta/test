// EX 2c: potenza del 2
package Exercises;

public class Power {
	private int num;
	private final int exp = 2;
	
	public Power(int n) {
		this.num = n;
	}
	
	public void cambiobase(int n) {
		this.num = n;
	}
	
	public void pow() {
		System.out.println("Potenza di "+ this.num + ": " +  Math.pow(this.num, this.exp));
	}
	
	
	public static void main(String[] args) {
		
		Power p = new Power(5);
		p.pow();
		p.cambiobase(16);
		p.pow();
		
	}
}
