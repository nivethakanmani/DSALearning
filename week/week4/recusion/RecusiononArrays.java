public class RecusiononArrays {
    public static void main(String[]args){

        int[] arr={11,22,34,49,55};
       int  n=arr.length;
        recursionarray(arr,n,0);}

     static  void recursionarray(int arr[],int n,int i){
        if(i>=n){
            return;
        }
        System.out.println(arr[i]);
        recursionarray(arr,n,i+1);

      }

    }



