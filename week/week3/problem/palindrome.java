public class palindrome {
    //5335  -->palendrome true because same from left and right
    //logic we know ones place and ten's place and hundred's place
    //10*0=0 -->ones
    //10*1=10  -->tens
    //10*10=100 -->hundred
    //10*10*10=1000 -->thousand
    //let we number 5423 lesson this not a palendrome why then how we check in code 
    //step1: get the reverse of the number
    //step2: compare the original number and reversed number if both are same then it is
    //5423 --> in last digit n%10 we get last digit right 10*0+3=3,10*3+2=32,10*32+4=324,10*324+5=3245  
    // in between number how come means in variable sum we store then we get 3245
    public static void main(String[]args){
        int n=5423;
        int sum=0;
        while(n>0){
            int ld=n%10;//last digit 
            sum=sum*10+ld;
            n=n/10;//removing last digit 

        }
        if(sum==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        System.out.println(sum);

}}
