class Human {
    String name;
    int age;

   boolean hasMobile(boolean input){
     return input;
   }
   static String walk(){
        return "Human is walking";
   }
}
public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "Alice";
        human1.age = 30;
        

        Human human2 = new Human();
        human2.name = "Bob";
        human2.age = 25;

        System.out.println("Human 1: Name = " + human1.name + ", Age = " + human1.age);
        System.out.println("Human 2: Name = " + human2.name + ", Age = " + human2.age);
        System.out.println(Human.walk());
    }
}
//class -->blueprint or template for your object 
 // object -->instance of class means copy
 //access modifier --> to set visibility of class, method, variable
//  public --> visible to all
//  private --> visible to only within class
//  protected --> visible to package and subclass
//static --> belongs to class rather than instance of class
// instance variable --> variable defined in class but outside method