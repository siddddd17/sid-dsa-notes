package basicrecursion;

public class FactorialOfFirstNNos {
    int factorial(int n ){
        if ( n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(new FactorialOfFirstNNos().factorial(3));
    }
}
