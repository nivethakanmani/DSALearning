import java.util.Scanner;
public class Digit {
    public static void main(String[]args){

        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a digit:");
        int n=sc.nextInt();
       int  count=0;
        while(n>0){
            int ld=n%10;
            count++;
            n=n/10;
            if(ld==0){
                System.out.println(ld);
            }

        }

         System.out.println("Number of digits:"+count);

    }

}
