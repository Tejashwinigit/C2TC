class A
{
   public void methodA()
   {
     System.out.println("Base class method");
   }
}

class Simple extends A
{
   public void methodB()
   {
     System.out.println("Child class method");
   }
   public static void main(String args[])
   {
     Simple obj = new Simple();
     obj.methodA(); //calling super class method
     obj.methodB(); //calling local method
  }
}