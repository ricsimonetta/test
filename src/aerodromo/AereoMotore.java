package aerodromo;

public class AereoMotore extends Aeromobile {
	private double potenza;
	public AereoMotore(String id, double pow) {
		super(id);
		this.potenza = pow;
	}
	public double getPotenza() {
		return this.potenza;
	}
	@Override
	public String  toString() {
		return("Id: " +this.getId() + "\n"+"Potenza: "+ this.potenza);
	}
	
	
	@Override
	public boolean CMP(Aeromobile a) {
		
		if (a == null)
			return false;
		if (a.getClass() != this.getClass()) {
            return false;
        }
		final AereoMotore other = (AereoMotore) a;
		
		if(this.getPotenza() > other.getPotenza() )
			return true;
		else
			return false;
		
	}
	
	
	
	
	@Override
	public boolean equals(Object a) {
		if (a == null)
			return false;
		if (a.getClass() != this.getClass()) {
            return false;
        }
		final AereoMotore other = (AereoMotore) a;
		
		if(this.getId() != other.getId() || this.getPotenza() != other.getPotenza() )
			return false;
		return true;
	}
}
