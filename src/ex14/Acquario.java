package ex14;

import java.util.ArrayList;


public class Acquario {
	private Vasca[] vasche;
	
	
	public Acquario( Vasca[] v) {
		this.vasche = v;
	
	}
	
	public void delete(int id) {
		for(int i = 0; i < 2; i++) {
			for(Esemplare e: vasche[i].getEsemplari())
				if(id == e.getId())
					vasche[i].getEsemplari().remove(e);
		}
	}
	
	public void insert(Esemplare e, int n) {
		vasche[n].getEsemplari().add(e);
		
	}

	public void print() {
		for(int i = 0; i < 2; i++) {
			System.out.println("Vasca: " + (i+1));
			for(Esemplare e: vasche[i].getEsemplari())
				System.out.println(e);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		// Vasca 1 con due esemplari
		Pesce p = new Pesce(1, 12, 55);
		Mammifero m = new Mammifero(2, 30, 2);
		ArrayList<Esemplare> e = new ArrayList<Esemplare>();
		e.add(p);
		e.add(m);
		Vasca v = new Vasca("Vasca1", e);
		
		// Vasca 2 con due esemplari
		Pesce pp = new Pesce(11, 13, 25);
		Mammifero mm = new Mammifero(12, 35, 3);
		ArrayList<Esemplare> ee = new ArrayList<Esemplare>();
		ee.add(pp);
		ee.add(mm);
		
		Vasca vv = new Vasca("Vasca2", ee);
		
		Vasca[] vasche = new Vasca[2];
		vasche[0] = v;
		vasche[1] = vv;
		
		
		Acquario a = new Acquario(vasche);
		System.out.println("Lista esemplari nell'acquario");
		a.print();
		
		Mammifero m2 = new Mammifero(15, 25, 4);
		System.out.println("INSERISCO NUOVO ESEMPLARE IN UNA VASCA SPECIFICA");
		a.insert(m2, 1);
		System.out.println("Lista esemplari nell'acquario");
		a.print();
		
		
		System.out.println("ELIMINO UN ESEMPLARE DALLA PRIMA VASCA");
		a.delete(1);
		System.out.println("Lista esemplari nell'acquario");
		a.print();
		
	}
	
	
	
}
