import java.util.Arrays;
import java.util.ArrayList;

public class Alternates {
    public static void main(String[]args){
     int [] arr={1,2,3,4};
     Alter a=new Alter();
    ArrayList<Integer> result=a.change(arr);

   System.out.println(result);

    // for(int var:result){
    //     System.out.println(var);
    // }


    }

}
class Alter{
   
    // int[] change(int [] arr){
    //     int [] result=new int[(arr.length+1)/2];
    //     int index=0;
        
    //  for(int i=0;i<arr.length;i++){
    //     if(i%2==0){
    //      result[index++]=arr[i];
    //     }
    //  }
    //  return result;

    // }
    ArrayList<Integer> change(int[] arr){
    ArrayList<Integer> a=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        if(i%2==0){
            a.add(arr[i]);
        }

    }
    return a;
}
    
}
