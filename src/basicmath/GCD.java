package basicmath;

//Euclidean algorithm to find GCD of two numbers : GCD ( a , b ) = GCD ( b , a % b )
public class GCD {
    int getgcd(int a, int b){
        while (a != 0 && b != 0){
            if ( a > b ) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        System.out.println(new GCD().getgcd(12, 13));
    }
}

