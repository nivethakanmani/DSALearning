public class Pattern7 {
      public static void main(String[] args){
       int  n=4;
       for(int i=1;i<=n;i++){
        for(int j=n-i+1;j>=1;j--){ //i=1 j=3 2 1 i=2  j=2
            System.out.print(j+" ");
        }
        System.out.println();
       }
    }

}
