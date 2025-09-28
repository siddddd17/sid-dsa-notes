package basicrecursion;

public class SumOfFirstNNumbers {
    int sum = 0 ;
    int ctr = 0;
    int sumOfFirstNNumbers(int n,int ctr, int sum){
        if ( ctr > n ) return sum;
        sum = sum + ctr;
        ctr ++ ;
        return sumOfFirstNNumbers(n, ctr, sum);
    }

    public static void main(String[] args) {
        System.out.println(new SumOfFirstNNumbers().sumOfFirstNNumbers(3, 0, 0));
    }
}
