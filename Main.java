/*
 * Activity 1.2.5
 */
public class Main
{
  public static void main(String[] args)
  {
  String name; 
    Dog d = new Dog("Duke");
    
    d.getName();
    name = d.getName();
    System.out.print(name);
    System.out.println(", He is a " + d.isGoodDog() + " good dog.");
    System.out.println(name + " has a new " + d.getToy() +".");
    System.out.println(d.getName()+ " has a new " + d.getToy() +".");
  }
}