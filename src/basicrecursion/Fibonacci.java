package basicrecursion;

public class Fibonacci {
     void fibonacci(int n, int fibNo1, int fibNo2,  int sum  ) {
        if (fibNo1 > n) return;
        System.out.println(fibNo1);
        sum = fibNo1 + fibNo2;
        fibNo1 = fibNo2;
        fibNo2 = sum;
        fibonacci(n, fibNo1, fibNo2, sum);
    }
    public static void main(String[] args) {
        new Fibonacci().fibonacci(10, 0, 1, 0);
    }

}
