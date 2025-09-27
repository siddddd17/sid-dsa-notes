package basicmath;


// TC : O(sqrt(N))
// sc : O(1)
public class CheckPrime {
    boolean isPrime(int number){
        int counter = 0 ;
        for ( int i = 1 ; i*i <= number ; i ++){
            if(number % i == 0 ){
                counter ++ ;
                if(number/ i != i){
                    counter ++ ;
                }
            }
        }
        return 2 == counter;
    }

    public static void main(String[] args) {
    System.out.println(new CheckPrime().isPrime(29) );}
    }


