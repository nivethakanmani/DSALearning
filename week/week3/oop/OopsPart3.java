public class OopsPart3 {
    public static void main(String[] args) {
   ElectricBicyle eb=new ElectricBicyle("KA-01-AB-1234","v1.0");  
   System.out.println(eb.getNumberPlate());
   eb.horn();     
    eb.increaseSpeed();
    eb.increaseSpeed(10);

    }

}
//Encapsulation --> binding the data members and methods together in a single unit
//polymorphism --> method overloading and method overriding
//inheritance means acquaring the properties of parent class to child class
//Abstraction means hiding the implementation details and showing only functionality
//abstract class--> a class which is declared with abstract keyword is known as abstract class
//we cannot create the object of abstract class
//we can have abstract methods and non-abstract methods in abstract class
//abstract method--> a method which is declared with abstract keyword and does not have method body
//if a class have abstract method then the class must be declared as abstract class
//if a child class inherits the abstract class then the child class must implement all the abstract methods of parent abstract class    
//interface--> is a collection of abstract methods
//we can achieve abstraction by interface
//we can implement multiple inheritance using interface    -->interface is used to achieve multiple inheritance in java -->interface can have only abstract methods and final variables-->interface default voids may if you that allow 
  
//parent class

abstract class Bicycle{

    abstract void hasbasket();

    private String numberPlate;
   
    public Bicycle(String numberPlate){
        this.numberPlate=numberPlate;
    }
    public String getNumberPlate(){
        return numberPlate;
    }
    public void horn(){
        System.out.println("bicycle horn");
    }
}
class ElectricBicyle extends Bicycle{
   // private String nuberPlate;
    private String version;

    public ElectricBicyle(String numberPlate,String version){
        super(numberPlate);
        this.version=version;
    }
    //method overloading means same method name with different parameters
    public void increaseSpeed(){
        System.out.println("increass");
    }

     public void increaseSpeed(int increment){
        System.out.println(increment+" electric bicycle speed is increased");
    }
    @Override
     public void horn(){
        System.out.println("electric bicycle horn");
    }
}



class pedalBicyle extends Bicycle {
   // private String nuberPlate;
    // public void horn(){
    //     System.out.println("peadal bicycle horn");
    // }

    public pedalBicyle(String numberPlate,String version){
        super(numberPlate);
        this.version=version;
    }

    public void faster(){
        System.out.println("pedal bicycle is faster");
    }

}
