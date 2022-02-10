class Human{
	   //Overridden method
	   public void eat()
	   {
	      System.out.println("Human is eating");
	   }
	}
	class H extends Human{
	   //Overriding method
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	   public static void main( String args[]) {
	      H obj = new H();
	      //This will call the child class version of eat()
	      obj.eat();
	   }
	}