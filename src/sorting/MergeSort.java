package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//todo: learn this better: revise
public class MergeSort {
    void mergeSort(int[] arr, int low, int high) {
        if ( low >= high) return ;
        int mid = (low + high ) / 2 ;
        mergeSort(arr, low, mid) ;
        mergeSort(arr, mid+1, high) ;
        merge(arr, low, mid, high);
        System.out.println(Arrays.toString(arr));
    }

    int[] merge(int[] arr, int low, int mid, int high) {
        int s1 = low;
        int s2 = mid + 1;
        int k = 0;
        int[] temp = new int[high - low + 1];
        while (s1 <= mid && s2 <= high) {
            if (arr[s1] < arr[s2]) {
                temp[k++] = arr[s1++];
            } else {
                temp[k++] = arr[s2++];
            }
        }
        while (s1 <= mid) {
            temp[k++] = arr[s1++];
        }

        while (s2 <= high) {
            temp[k++] = arr[s2++];
        }
        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
        return arr;
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(new int[]{38, 27, 43, 3, 9, 82, 10}, 0, 6);
    }
}
