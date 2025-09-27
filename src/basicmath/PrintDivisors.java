package basicmath;

import java.util.ArrayList;
import java.util.List;

//Problem Statement: Given an integer N, return all divisors of N.
//
//A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.
// TC: O(sqrt(N))
// SC: O(sqrt(N))
public class PrintDivisors {
    List<Integer> printdivisors(int number){
        List<Integer> divisors = new ArrayList<>();
        for ( int i = 1; i <= Math.sqrt(number); i ++){
            if ( number % i == 0){
                divisors.add(i);
                if(i != number / i){
                    divisors.add(number/i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        System.out.println(new PrintDivisors().printdivisors(36) );
    }
}
