public class CountZero {
    public static void main(String[]args){
        int n=203009;
        System.out.println(countzeros(n));
    }

    static int countzeros(int n){
        if(n==0){
            return 0;
        }

        int digit =n%10;
        if(digit==0){
            return 1 + countzeros(n/10);
        }
        else{
           return countzeros(n/10);
        }
    }

}
