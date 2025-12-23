public class Pattern2 {
      public static void main(String[] args){
        int n=4;
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
      }
      //i=1 j=1 1
      //i=2 j=1 1 2
      //i=3 j=1 1 2 3
      //i=4 j=1 1 2 3 4   
}
