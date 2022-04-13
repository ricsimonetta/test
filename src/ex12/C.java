package ex12;

import java.util.ArrayList;

public class C {
	private String nome;
	private String luogo;
	private ArrayList<OD> opere;



	public C(String n, String l, ArrayList<OD> op) {
		this.nome = n;
		this.luogo = l;
		this.opere = op;
	}
	
	
	public void insert(OD o) {
		opere.add(o);
		
	}
	
	public void printCollection() {
		for(OD o: this.opere) {
			System.out.println(o); 
		}
		
		
		
	}
	
	
	
	
	private void printSize(int n) {
		OD o = opere.get(n);
		double d = o.printingombro();
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Q q = new Q("L'urlo", "Munch", 5, 4);
		S s = new S("David", "Michelangelo", 10, 5, 4);
		ArrayList<OD> opere = new ArrayList<OD>();
		C c = new C("Classici", "Milano", opere);
		
		c.insert(s);
		c.insert(q);
		
		c.printCollection();
		c.printSize(0);
		
	}
	
	
	
}


