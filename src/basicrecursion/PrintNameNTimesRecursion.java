package basicrecursion;

public class PrintNameNTimesRecursion {

    static final int n = 0;
    void printName(int n, String name){
        if ( n == 5) return ;
        System.out.println(name);
        n++;
        printName(n, name);
    }

    public static void main(String[] args) {
        new PrintNameNTimesRecursion().printName(n, "Hello");
    }
}
