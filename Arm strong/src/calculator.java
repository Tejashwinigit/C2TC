
import java.io.*;
class Calculator{
 public static void main(String args[])throws Exception
 {
  int n1,n2;
  String choice;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
  System.out.println("Enter number1:");
  n1=Integer.parseInt(br.readLine());
  
  System.out.println("press \n + for addition \n - for subtraction \n * for multiplication \n /  for division: ");
  choice=br.readLine();
  
  System.out.println("Enter number2:");
  n2=Integer.parseInt(br.readLine());
  switch(choice)
  {
   case "+":   System.out.println("Addition: "+n1+"+"+n2+" is:"+(n1+n2));
      break;
   case "-":    System.out.println("Subtraction:"+n1+"-"+n2+" is:"+(n1-n2));
      break;
   case "*":   System.out.println("Multiplication:"+n1+"*"+n2+" is:"+(n1*n2));
      break;
   case "/":  if(n2==0)
            System.out.println("Division by zero is not possible");
     else
            System.out.println("Division:"+n1+"/"+n2+" is:"+(n1/n2));
     break;
  }
 }
}

