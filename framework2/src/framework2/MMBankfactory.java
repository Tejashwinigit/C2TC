package framework2;

public class MMBankfactory  extends Bankfactory {
	public void getnewsavingacc() {
		
	}
public void getnewcurrentacc() {
	
}
@Override
public Primeacc getnewprimeacc() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Bankacc getnewnormalacc() {
	// TODO Auto-generated method stub
	return null;
}
}

abstract public class Bankacc{
	abstract public Primeacc
	getnewprimeacc();

	abstract public Bankacc
	getnewnormalacc();
}
public static void main(String[]args) {
}
}