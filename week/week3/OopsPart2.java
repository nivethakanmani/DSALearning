public class OopsPart2 {

     public static void main(String[] args){
        Amazon a1=new Amazon();
        Amazon a2=new Amazon(200);
        Amazon a3=new Amazon(300,"nivetha");
        a3.setAmazonPayBalance(500);
        System.out.println(a3.getAmazonPayBalance());

     }

}
//Concepts of constructor
//constructor is special method which is create that complies that knows that create default construtor
//if we dont create any constructor compiler will create default constructor
//if we create parameterized constructor compiler will not create default constructor
//constructor name should be same as class name
//constructor will not have return type
//used to initialize the object
//types of constructor
//1.default constructor
//2.parameterized constructor   
//Encapsulation
//inheritance
//polymorphism
//abstraction
//interface


class Amazon{
    String accountName;
  private  int amazonPayBalance;

     
    public int getAmazonPayBalance(){
        return amazonPayBalance;
    }
    public void setAmazonPayBalance(int amount){
        amazonPayBalance=amount;
    }
    public  Amazon(){
        System.out.println("default constructor");
    }
    public Amazon(int amazonPayBalance){
        this.amazonPayBalance=amazonPayBalance;
        System.out.println("parameterized constructor"+amazonPayBalance);
    }
    
    public Amazon(int amazonPayBalance,String accountName){
        this.amazonPayBalance=amazonPayBalance;
        this.accountName=accountName;
        System.out.println("parameterized constructor"+" "+amazonPayBalance+" "+accountName);
    }
}