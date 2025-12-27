public class PrimeDeeplearn {
    public static void main(String[]args){
        // prime means divisble by 1and itself
        //other are not prime 
        int n=5;
        int flag=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=0;
            }
        }
            if(flag==1){
                System.out.println("Prime number");
            }
            else{
                System.out.println("It is not a prime number");
            }
        
    }

}
