

class P{  
  void msg(){System.out.println("Hello");}  
}  
//save by B.java  

class Default{  
  public static void main(String args[]){  
   P obj = new P();//Compile Time Error  
   obj.msg();//Compile Time Error  
  }  
}  