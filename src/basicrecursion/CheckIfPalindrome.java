package basicrecursion;

public class CheckIfPalindrome {
//    boolean isPalindrome(String str, int start, int end){
//        if ( start >= end ) return true;
//        if ( str.charAt(start) != str.charAt(end)) return false;
//        return isPalindrome(str, start + 1, end - 1);
//    }

    boolean isPalindrome(String s, int i){
        if ( i >= s.length()/ 2 ) return true;
        if( s.charAt(i) != s.charAt(s.length()- i - 1 )) return false;
        return isPalindrome(s, i + 1) ;

        //f("madam", 0) -> f("madam", 1) -> f("madam", 2) -> f("madam", 3) -> return true
    }

    public static void main(String[] args) {
        System.out.println(  new CheckIfPalindrome().isPalindrome("madamm", 0));
    }

}
