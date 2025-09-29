package basicrecursion;

public class Fibonacci {
//     void fibonacci(int n, int fibNo1, int fibNo2,  int sum  ) {
//        if (fibNo1 > n) return;
//        System.out.println(fibNo1);
//        sum = fibNo1 + fibNo2;
//        fibNo1 = fibNo2;
//        fibNo2 = sum;
//        fibonacci(n, fibNo1, fibNo2, sum);
//    }

    int fibonacci(int n) {
        if ( n <= 1 ) return n ;
        int f1 = fibonacci(n - 1);
        int f2 = fibonacci(n - 2);
        return f1 + f2 ;
    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci(6));
    }

}
