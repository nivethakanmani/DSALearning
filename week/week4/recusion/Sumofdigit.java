public class Sumofdigit {
    public static void main(String[]args){
        int n=349;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        else {
            return (n%10)+sum(n/10);
        }
    }

}//
