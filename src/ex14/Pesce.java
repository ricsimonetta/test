package ex14;

import java.util.ArrayList;
import java.util.List;

public class Pesce extends Esemplare {
	private int profondita;

	public Pesce() {
		super(1, 1);
	}
	public Pesce(int id, int eta, int profondita) {
		// TODO Auto-generated constructor stub
		super(id, eta);
		this.profondita = profondita;
		super.getEta();
		
		List<Pesce> pesci=new ArrayList<>();
		pesci.add(new Pesce(1,2,3));
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n profondita: " + this.profondita;
	}
	
	
	
	public static void main (String[] args) {
		Pesce pesce= new Pesce();
		
		final Pesce pesce1= pesce;
		//NO pesce1=new Pesce();
		
		Pesce pesce2= pesce;
		pesce2=new Pesce();
		
		String string1= new String("abc");
		String string2=string1.concat("def"); // string1=abc  string2=abcdef
		
		metodo1(string1);
		metodo2(pesce);
	}
	
	public static void metodo1(String stringa) {
		
	}
	
	public static void metodo2(Pesce pesce) {
		pesce.setEta(1);
	}
	
}
