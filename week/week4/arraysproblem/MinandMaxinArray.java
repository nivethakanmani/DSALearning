public class MinandMaxinArray {
    public static void main(String[]args){
        int [] arr={4,1 ,3, -5, -4, 8, 6};
        int max=arr[0];
        int min=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                // min=max;
                max=arr[i];
            }else if(arr[i]<min && arr[i]!=max){
                min=arr[i];
            }
            
            
        }
        System.out.println("Min value :" + min +" "+"Max value "+max);
    }


  //i=1 min=     max=
}
