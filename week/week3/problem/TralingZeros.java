public class TralingZeros {
    public static void main(String[]args){
        int n=5;
        int fact=1;
        int count=0;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
        while(fact>0){
        int ld=fact%10;
        if(ld==0)
            count++;
            fact=fact/10;
        }
        System.out.println("Trailing zeros in "+n+"! is "+count);
    }

}
