public class FirstandSecondSmallests {
    //smallest and second smmalest everthing seems same wnat to give -1 also 
    //firstSmallest= we check with i if smallest put into second smallest 
    //secondSmallest=

  public static void main(String[]args){


    int [] arr={ 4, 3, 2,5, 6};
    int firstSmallest=arr[0];
    int secondSmallest=Integer.MAX_VALUE;

    for(int i=1;i<arr.length;i++){

        if(arr[i]<firstSmallest){
            secondSmallest=firstSmallest;
            firstSmallest=arr[i];
        }
        else if (arr[i] < secondSmallest && arr[i] != firstSmallest) {
        secondSmallest = arr[i];
    }

    }
    System.out.println("First Smallest: " + firstSmallest);
    System.out.println("Second Smallest: " + secondSmallest);


    }//f= 3           s=  4  3     i=

    






















    //Output: [2, 3] 


}
