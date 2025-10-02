package sorting;

import java.util.Arrays;

// take the element and put it in the correct position in the sorted array
public class InsertionSort {

    //{4, 3, 2, 1} -> { (4, 3), 2, 1} -> { (3, 4), 2, 1} -> { (2, 3, 4), 1} -> { (1, 2, 3, 4)}
    void insertionSort(int arr[]){
        for ( int i = 0 ; i < arr.length; i ++){
            int j = i;
            while( j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(new int[]{4, 3, 2, 1});
    }
}
