public class Factorial {
    //logic  first factorial means let n=5 1*2*3*4*5=120  in code where i234.... happens in i right 
    public static void main(String[]args){
        int n=5;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }

}
