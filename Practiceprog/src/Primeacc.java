
abstract class Primeacc extends Shopacc {
	
	private boolean isprime;
	private float delivarycharges;
	
	public void setPrime(boolean y) {
		isprime = y;
	}
	
	public boolean getprime() {
		return isprime;
	}
	
	public void setdelivary(float z) {
		delivarycharges = z;
	}
	public float getdelivary() {
		return delivarycharges;
	}
	
	abstract public void bookProduct();
	abstract public String toString();

	public String toString1() {
		// TODO Auto-generated method stub
		return null;
	}

	}
	
		
	
	
		
	

