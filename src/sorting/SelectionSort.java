package sorting;

import java.util.Arrays;

// find the minimum element in the unsorted array and swap it with the element at the beginning
// { (4, 3, 2, 1) } -> { 1,( 3, 2, 4 )} -> { 1, 2, (3, 4) } -> { 1, 2, 3, 4}
public class SelectionSort {

    void selectionsort(int[] unsortedArr){
        for (int i = 0 ; i < unsortedArr.length ; i++) {
            int minIndex = i;
            for (int j = i + 1; j < unsortedArr.length; j++) {
                if (unsortedArr[j] < unsortedArr[minIndex]) {
                    minIndex = j;
                }
            }
            unsortedArr = swap(unsortedArr, i, minIndex);
        }
        System.out.println(Arrays.toString(unsortedArr));
    }
        int[] swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            return arr;
        }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        new SelectionSort().selectionsort(arr);
    }
}
