package sorting;

import java.util.Arrays;

//push the largest element to the end in each iteration
//TC : O(n^2)
public class BubbleSort {

    void bubbleSort(int[] arr){
        for ( int i  = arr.length - 1 ; i > 0 ; i--){
            boolean isSwapped = false;
            for(int j  = 0 ; j < i- 1; j ++){
                if ( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) break ;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        BubbleSort bubsort = new BubbleSort();
        bubsort.bubbleSort(new int[]{64, 34, 25, 12, 22, 11, 90});
    }
}
