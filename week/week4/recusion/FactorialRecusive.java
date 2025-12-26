public class FactorialRecusive {
    public static void main(String [] args){
        function(5);
    }
    static void function(int n){
        if(n==1){
            return;
        }
        System.out.println(n);
        function(n*(n-1));
    }

}
