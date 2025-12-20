
import java.util.Scanner;
public class FirstProblem {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        int num= scan.nextInt();
        scan.nextLine(); // to consume the newline character after the integer input
        String str= scan.next();
    
        char ch=scan.next().charAt(0);
        System.out .println(ch);
        System.out .println(num);
        System.out .println(str);



    }

    }


//Prob 1 : Write a program that takes an integer, then a string, 
// then a char from the user and prints them in the screen.