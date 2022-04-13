package aerodromo;

public abstract class Aeromobile implements CMP {
	private String identifier;
	
	public Aeromobile(String id) {
		this.identifier = id;
	}

	
	public String getId() {
		return this.identifier;
	}

	@Override
	public String toString() {
		return ("Id: " + this.identifier);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o.getClass() != this.getClass()) {
            return false;
        }
		final Aeromobile other = (Aeromobile) o;
		if(this.getId() == other.getId())
			return true;
		return false;
	}
	

}
