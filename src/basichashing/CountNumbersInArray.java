package basichashing;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class CountNumbersInArray {

    //first approach : using frequency array, but this approach is very inefficient if the max element is very large
    //TC: O(N)
    //SC: O(max(arr))
//    int[] precompute(int[] arr) {
//        int max = Integer.MIN_VALUE;
//        for ( int num : arr) {
//            if (num > max) {
//                max = num;
//            }
//        }
//        int[] freqArray = new int[max + 1];
//        for ( int num : arr ) {
//            freqArray[num]++;
//        }
//        return freqArray;
//    }
//
//    int findFreq(int n , int[] arr){
//        if ( n < 0 || n >= arr.length) return 0;
//        else {
//            return arr[n];
//        }
//    }

    //second approach : using hashing
    //TC = O(N) + O(1) for each query
    //SC = O(N)
    Map<Integer, Integer> precompute(int[] arr){
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return freqMap;
    }

    int findFreq(int n , Map<Integer, Integer> map){
        return map.getOrDefault(n, 0);
    }
    public static void main(String[] args) {
        int[] arr = {1,1, 2, 1, 2, 2, 3, 4, 5, 1};
        CountNumbersInArray obj = new CountNumbersInArray();
        System.out.println(obj.findFreq(1, obj.precompute(arr)));
    }
}
