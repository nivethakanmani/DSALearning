public class CountaddValues {
    public static void main(String[]args){
        int [] arr={2,4,8,19,20};
        //increment by 5
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=arr[i]+5;
        // }
        // for(int i=0;i<arr.length;i++){
        //      System.out.println(arr[i]);
        // }

        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }

      System.out.println("even:"+even+" "+
"odd "+odd);
    }

}
