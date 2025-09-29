package basicrecursion;

public class FactorialOfFirstNNos {
    //functional
//    int factorial(int n ){
//        if ( n == 0 || n == 1) return 1;
//        return n * factorial(n-1);
//    }
    //f(5) -> 5 * f(4) -> 5 * 4 * f(3) -> 5 * 4 * 3 * f(2) -> 5 * 4 * 3 * 2 * f(1) -> 5 * 4 * 3 * 2 * 1 = 120


    //parameterised
    void factorial(int i, int fact, int n){
        if ( i > n ){
            System.out.println(fact);
            return;
        }
        fact = fact * i ;
        factorial ( i + 1, fact, n );
    }
// factorial(1, 1, 5) -> factorial(2, 1*1, 5) -> factorial(3, 2*1, 5) -> factorial(4, 3*2*1, 5) -> factorial(5, 4*3*2*1, 5) -> factorial(6, 5*4*3*2*1, 5) -> print(120)

    public static void main(String[] args) {
        new FactorialOfFirstNNos().factorial(1, 1, 5);
    }
}
