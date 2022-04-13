package ex12;

public abstract class OD {
	protected String titolo;
	protected String artista;
	
	
	public OD(String t, String a ) {
		this.titolo= t;
		this.artista = a;
	}
	
	
	 public abstract double printingombro();
	 
	 public String getArtista() {
		return artista;
	}
	 public String getTitolo() {
		return titolo;
	}
	 @Override
	 public boolean equals(Object o) {
		if (o == null)
				return false;
		if (o.getClass() != this.getClass()) {
	            return false;
	    }
		final OD other = (OD) o;
			
		if(this.getArtista() == other.getArtista() && this.getTitolo() == other.getTitolo() )
			return true;
		else
			return false;
		 
	 }
	
}
