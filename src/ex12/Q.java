package ex12;

public class Q extends OD {
	private double altezza;
	private double larghezza;
	
	
	public Q(String t, String a, double altezza, double larghezza) {
		super(t,a);
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	public double getLarghezza() {
		return larghezza;
	}
	public double getAltezza() {
		return altezza;
	}
	
	@Override
	public String toString() {
		return("Titolo: " + super.titolo +"\nArtista: "+ super.artista + "\nAltezza: " + this.getAltezza() + "\n Larghezza: " + this.getLarghezza());
	}
	
	
	public double printingombro() {
		return this.getAltezza()*this.getLarghezza();
				
	
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
				&& this.getLarghezza() == other.getLarghezza())
			return true;
		else
			return false;
		 
	 }
	
	
}
