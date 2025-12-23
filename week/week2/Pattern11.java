public class Pattern11 {
     public static void main(String[] args){
        int n=4;
        // i    Star  space (getget how much we less)   2*n      formula   

        // 1    7      0           1                    8         spaces (i-1)

        // 2    5      1           3                    8         2*n-(2*i-1)

        // 3    3      2           5                   8

        // 4    1      3           7                   8

        // spaces (i-1)

        // Stars 
        // 4*2-1=7 but 2*i=2   2*i-1=3  //2*i-1=1 2*2-1=3 2*3-1=5 2*4-1=7
        //2*i-1=1 n=8-1  // 2*n(i-1) 8-1=7 8-2=6 8-3=5 8-4=1  


        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
        for(int j=1;j<=2*n-(2*i-1);j++){
            System.out.print("*");
        }
        System.out.println();
    }
     }

}
