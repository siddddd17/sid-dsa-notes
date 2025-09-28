package basicrecursion;

public class PrintNTo1 {
    void printNTo1(int curr, int n){
        if ( curr < 1) return ;
        System.out.println(curr);
        curr--;
        printNTo1(curr, n);
    }
    public static void main(String[] args) {
        new PrintNTo1().printNTo1(10, 10);
    }
}
