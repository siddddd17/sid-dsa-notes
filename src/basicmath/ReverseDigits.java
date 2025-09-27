package basicmath;

//"""
//Problem Statement: Given an integer N return the reverse of the given number.
//
//Note: If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

// TC: O(log10(N))
// SC: O(1)
//"""
public class ReverseDigits {
   int  reverseDigits(int number){
       int rev = 0 ;
       while(number > 0 ){
           int rem = number % 10 ;
           rev = rem + rev * 10 ;
           number = number / 10 ;
       }
       return rev;
   }

    public static void main(String[] args) {
        System.out.println(new ReverseDigits().reverseDigits(123490000) );
    }
}
