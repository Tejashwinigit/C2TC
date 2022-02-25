import java.util.LinkedList;
public class Addatfirst {
   public static void main(String[] args)
   {
      LinkedList<String> l = new LinkedList<String>();
      l.add("Apple");
      l.add("Mango");
      l.add("Pear");
      System.out.println("The LinkedList is: " + l);
      l.addFirst("Orange");
      l.addLast("Guava");
      System.out.println("The LinkedList is: " + l);
   }
}
