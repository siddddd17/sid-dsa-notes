package basicmath;

public class ExtractDigits {

    private int countdigits(int number){
//        //bruteforce approach
//        int counter = 0 ;
//        while ( number > 0){
//            number = number /10;
//            counter ++ ;
//        }
//        return counter;

        return (int)(Math.log10(number) + 1);
    }
    public static void main(String[] args) {
        System.out.println(new ExtractDigits().countdigits(123456789) );
    }
}
