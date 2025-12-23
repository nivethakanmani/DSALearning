public class PrimeNumber {
   // public static void main(String[]args){
        //logic prime number means divisible by 1 and itself only
        //eg :N-->1 and N this is prime number
        //eg:5 is divible by 1 and 5 only so prime number
        //eg:6 is divisible by 1,2,3,6 so not prime number
        //n=11 from 1 to 11 what are the prime number  we want to print 
        //1 
        public static void main(String[] args) {
       int n=9;
    for(int x=2;x<=n;x++){
        int flag = 0;
        for(int i=2;i<x;i++){
            if(x%i==0){
                flag = 1;
            }
        }
        if(flag==0){
            System.out.println(x);
        }
    }
    }
}
