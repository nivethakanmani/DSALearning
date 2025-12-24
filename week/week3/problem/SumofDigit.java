public class SumofDigit {
     public static void main(String[]args){
        int n=12345;
        //int sum=0;
        int ld=0;
        int last=n%10;
        while(n>0){
             ld=n%10; 
            if(n==ld){
                System.out.println(ld);
            }
            n=n/10;
            
           
        }


        int sum=last+ld;
        System.out.println("Sum of last digit:"+sum);
        
    }
}
