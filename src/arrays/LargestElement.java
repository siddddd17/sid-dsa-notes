package arrays;

public class LargestElement {
    //{2,5,1,9,6}
    //bruteforce would be to sort the array and return the last element
    //tc: o(nlogn)
    //sc : o(nlogn)


    //tc : o(n)
    //sc : o(1)
    int largestElement(int[]arr){
        int largest = Integer.MIN_VALUE;
        for( int i : arr){
            if ( i> largest){
                largest = i ;
            }
        }
        return largest;
    }
}
