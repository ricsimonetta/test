package ex12;

public class S extends OD{
	private double altezza;
	private double larghezza;
	private double profondita;
	
	public S(String t, String a, double altezza, double larghezza, double profondita) {
		super(t,a);
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
				
	}
	
	public double getProfondita() {
		return profondita;
	}
	public double getAltezza() {
		return altezza;
	}
	public double getLarghezza() {
		return larghezza;
	}
	
	
	public double printingombro() {
		
		return this.getAltezza()*this.getLarghezza()*this.getProfondita();		
	}
	
	@Override
	 public boolean equals(Object o) {
		if (o == null)
				return false;
		if (o.getClass() != this.getClass()) {
	            return false;
	    }
		final S other = (S) o;
			
		if(this.getArtista() == other.getArtista() && this.getTitolo() == other.getTitolo() && this.getAltezza() == other.getAltezza()
				&& this.getLarghezza() == other.getLarghezza() && this.getProfondita() == other.getProfondita())
			return true;
		else
			return false;
		 
	 }
	@Override
	public String toString() {
		return("Titolo: " + super.titolo +"\nArtista: "+ super.artista + "\nAltezza: " + this.getAltezza() + "\n Larghezza: " + this.getLarghezza() + "\n Profondita: "+ this.getProfondita());
	}
	
	
}
