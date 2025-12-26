public class FibonnaciSeries {

    public static void main(String[]args){
        int n=4;
fibonic fb=new fibonic();

     
        for (int i = 0; i < n; i++) {
            System.out.print(fb.function(i) + " ");
        }

    }



}

class fibonic{

    int function(int n){
        if(n==0){
            return n;
        }
        if(n==1){
            return 1;
        }
        return function(n-1)+function(n-2);

    }
}

//zoho wise preparation 
// public class FibonacciSeries {

//     public static void main(String[] args) {
//         int n = 5;
//         printFib(0, 1, n);
//     }

//     static void printFib(int a, int b, int n) {
//         if (n == 0) return;

//         System.out.print(a + " ");
//         printFib(b, a + b, n - 1);
//     }
// }
// | Variable | Meaning                        |
// | -------- | ------------------------------ |
// | `a`      | current Fibonacci number       |    //0 1 1
// | `b`      | next Fibonacci number          |
// | `n`      | how many numbers left to print |

// printfib(0,1,5)
//line40 no base going to print 0 
//return cal (1,2,4)
//print 1
//return(2,3,4) here print -->1
//print 1
//return(3,4,3) look like(1,2,3)
//print 011
//(1,1+2,2)
//(1,3,2) print 
