package framework2;
abstract class Bankacc {
	private int accno;
	private String accname;
	private float accbal;
	
	public void setno(int i) {
		accno=i;
		
	}
	public int getno()
	{
	return accno;
	}
	
	public void setname(String j) {
		accname=j;
	}
	public String getname() {
		return accname;
	}
	
	public void setbal(int z) {
		accbal=z;
	}
	public float getbal() {
		return accbal;
	}
	
	abstract public void withdraw();
	
	public void deposit()
	{
	}
	
	abstract public String toString();
}
		
		
	
