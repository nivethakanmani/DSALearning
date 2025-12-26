public class Recursion {
    public static void main(String[]args){
        function(5);

    }

   static void function(int n){
        if(n==0){
            return;
        }
        else{
           System.out.println(n);
           function(n-1);
        }
    }

}
// use recusion more complex in simple steps we can solve 
//when we use repeative problem we can recursion also we solve in iteration problem 
//
// how to solve a recusion problem
// break down into  the small problem .then  start build the logic   behind the small problem 
//find the recusive step  once we found the recusion step use the base condition or find the base condition 
// build the recusive tree 
// we took example n*fact(n-1)
//how it call  n=5 means 5*faact(4) util go to one 