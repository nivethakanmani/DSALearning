public class Pattern1 {
     public static void main(String[] args){

        // Write a program to print the following pattern
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //i=1 j=1  * j=2 * j=3 * j=4 * j=5 *
        //i=2 j=1  * j=2 * j=3 * j=4 * j=5 *
        //i=3 j=1  * j=2 * j=3 * j=4 * j=5 *
        //i=4 j=1  * j=2 * j=3 * j=4 * j=5 *
        //i=5 j=1  * j=2 * j=3 * j=4 * j=5 *    

}
}
// 