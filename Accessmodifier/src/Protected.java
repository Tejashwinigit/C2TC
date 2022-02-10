 class C{  
protected void msg(){System.out.println("Hello");}  
}  
 

class Protected extends C{  
  public static void main(String args[]){  
   Protected obj = new Protected();  
   obj.msg();  
  }  
}  