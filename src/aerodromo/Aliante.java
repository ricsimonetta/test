package aerodromo;

public class Aliante extends Aeromobile {
	private int efficienza;
	
	public Aliante(String id, int eff) {
		super(id);
		this.efficienza = eff;
	}
	
	public int getEfficienza() {
		return this.efficienza;
	}
	
	
	@Override
	public boolean CMP(Aeromobile a) {
		
		if (a == null)
			return false;
		if (a.getClass() != this.getClass()) {
            return false;
        }
		if (!(a instanceof Aliante)) {
            return false;
        }
		final Aliante other = (Aliante) a;
		
		if(this.getEfficienza() > other.getEfficienza() )
			return true;
		else
			return false;
		
	}
	
	
	@Override
	public String  toString() {
		return("Id: " +this.getId() + "\n"+ " Efficienza: "+ this.getEfficienza());
	}
	@Override
	public boolean equals(Object a) {
		if (a == null)
			return false;
		if (a.getClass() != this.getClass()) {
            return false;
        }
		final Aliante other = (Aliante) a;
		
		if(this.getId() != other.getId() || this.getEfficienza() != other.getEfficienza() )
			return false;
		return true;
	}
}
