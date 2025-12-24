public class LargestElement {
    public static void main(String[] args ){  
        //Logic -->
       // take a box   compare with each other 
       //going to each box if that box have high value compare with other suppose that is small we skip keep high value

        int [] arr={1001,1079,900,897};
        int largest=arr[0]; //max

        for(int i=1;i<arr.length;i++){
                if(arr[i]>largest){
                    largest=arr[i];
                }   //i=0 j=1 i value 1001 >1079

            }

             System.out.println(largest);

            
        }

      

    }


