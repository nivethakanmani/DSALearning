public class Print1toN {
    public static void main(String []args){
        int a=5;
        function(5);
    }

  static  void function(int a){
       if(a==0){
        return;
       }
       //System.out.print(a);
       function(a-1);
       System.out.print(a);
    }

}
