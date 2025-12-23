public class Pattern5 {
     public static void main(String[] args){
       int  n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();//i=1 j=1
        }
     }

}
//i=1
//j=1 check 1<=4-1+1=4  j=1 2 3 4
//i=2
//j=1 check  1<=4-2+1=3 j=1 2 3