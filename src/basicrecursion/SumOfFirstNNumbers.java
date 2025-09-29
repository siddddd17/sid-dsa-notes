package basicrecursion;

public class SumOfFirstNNumbers {
//    int sum = 0 ;
//    int ctr = 0;
//    int sumOfFirstNNumbers(int n,int ctr, int sum){
//        if ( ctr > n ) return sum;
//        sum = sum + ctr;
//        ctr ++ ;
//        return sumOfFirstNNumbers(n, ctr, sum);
//    }

    //parameterised recursion
//    void sumOfFirstNNumbers(int n, int sum){
//        if ( n < 1 ) {
//            System.out.println(sum);
//            return ;
//        }
//        sum += n ;
//        sumOfFirstNNumbers( n - 1, sum);
        //f(3, 0 ) -> f(2, 3) -> f(1, 5) -> f(0, 6) -> print(6)

    //functional recursion
    int sumOfFirstNNumbers(int a) {
        if (a < 1) return 0;

        return a + sumOfFirstNNumbers(a - 1);
    }
    //f(3) -> 3 + f(2) -> 3 + 2 + f(1) -> 3 + 2 + 1 + f(0) -> 3 + 2 + 1 + 0 = 6

    public static void main(String[] args) {
        System.out.println(new SumOfFirstNNumbers().sumOfFirstNNumbers(3));
    }
    }



