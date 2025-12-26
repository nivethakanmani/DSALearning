public class MaxandMinProduct {
    public static void main(String [] args){
        int [] arr1={5, 7, 9, 3, 6, 2};
        int [] arr2={1, 2, 6, 1, 9};


        int max=arr1[0];
        int min=arr2[0];

        for (int i = 1; i < arr1.length; i++) {
    if (arr1[i] > max) {
        max = arr1[i];
    }}
        for(int i=1;i<arr2.length;i++){
            if(arr2[i]<min){
                min=arr2[i];

            }
        }

        int result =max*min;
        System.out.println(result);


    }

}
