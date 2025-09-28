package basicrecursion;

public class Print1ToN {
//    void print1ToN(int curr, int n ){
//        if ( curr >  n) return ;
//        System.out.println(curr);
//        curr++;
//        print1ToN(curr, n);
//    }

    void print1ToN(int curr){
        if( curr < 1) return;
        print1ToN(curr - 1 );
        System.out.println(curr);
    }
    public static void main(String[] args) {
        new Print1ToN().print1ToN(5);
    }
}
