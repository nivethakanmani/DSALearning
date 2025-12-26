public class SumofNnumber {
    public static void main(String[]args){
        int a=3;
        int result=function(a);
        System.out.println(result);
    }

    static int function(int a){
        if(a==1){
            return 1;
        }
        return a+function(a-1);
    }

}
