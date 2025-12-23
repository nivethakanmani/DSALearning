public class Pattern10 {
    public static void main(String[] args){
    int n=4;
    for(int i=1;i<=n;i++){ //i=2
        for(int j=1;j<=n-i;j++){//j=1 j=123 
            System.out.print(" ");
        }

        for(int j=1;j<=2*i-1;j++){ 
        //j=1  j<=n*2-1  1 4*2-1=7 
        System.out.print("*");
    }
       System.out.println();

    }
}
}
