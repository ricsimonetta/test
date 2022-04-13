package aerodromo;


public class Main {
	
	
	public static void main(String[] args) {
	
	Aliante a = new Aliante("1", 44);
	Aliante b = new Aliante("2", 55);
	Aliante c = new Aliante("1", 44);
	AereoMotore am = new AereoMotore("1", 44);
	
	boolean risposta=a.CMP(b);
	if (!risposta) {
		System.out.print("oggetti diversi");
	}
	if(a.CMP(b))
		System.out.println("A superiore a B");
	else
		System.out.println("B superiore a A");
	a.CMP(am);
	if(a.equals(c))
		System.out.println("A uguale a C");
	else
		System.out.println("A diverso da C");
	}
}
