import java.util.Scanner;   
public class problem2 {
//     Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.

// If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.
public static void main(String[]args){
    Scanner in=new Scanner(System.in);

    System.out.println("Enter the first angle:");
    int angle1=in.nextInt();
    System.out.println("Enter the second angle:");
    int angle2=in.nextInt();
    System.out.println("Enter the third angle:");
    int angle3=in.nextInt();

    int sum=angle1+angle2+angle3;
    if(sum==180){
        System.out.println("Triangle can be formed");
    }else{
        System.out.println("Triangle cannot be formed");
    }

}

}
