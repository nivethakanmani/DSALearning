import java.util.*;
public class PalindromeArray {
    public static void main(String [] args ){

        int [] arr ={1, 2, 3, 1,1};
        boolean flag=false;

        int n=arr.length;
       ArrayList<Integer> al=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
          al.add(arr[i]);

        }
        System.out.println(al);
        for(int i=0;i<arr.length;i++){
        if(arr[i]==al.get(i)){
            flag=true;
           
        }
        
            //ystem.out.println(flag);

    }
     System.out.println(flag);


}}
