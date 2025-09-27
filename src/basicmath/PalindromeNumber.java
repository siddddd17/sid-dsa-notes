package basicmath;

//Problem Statement: Given an integer N, return true if it is a palindrome else return false.
//
//A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.
//
//Examples
public class PalindromeNumber {
    private boolean isPalindrome(int number){
        return number == new ReverseDigits().reverseDigits(number);
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(12321) );
    }
}
