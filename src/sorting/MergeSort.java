package sorting;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//todo: learn this better: revise
public class MergeSort {
    void mergesort(int[ ] arr , int low , int high) {
        if ( low == high ) return ;
        int mid = ( low + high ) / 2 ;
        mergesort(arr, low, mid );
        mergesort(arr, mid + 1 , high );
        merge(arr, low, mid, high ) ;
    }


    void merge(int[] arr, int low, int mid , int high ) {
        int l = low;
        int r = mid + 1;
        int k = 0;
        int[] temp = new int[high - low + 1];
        while (l <= mid && r <= high) {
            if (arr[l] < arr[r]) {
                temp[k++] = arr[l++];
            } else temp[k++] = arr[r++];

        }
        while (l <= mid) {
            temp[k++] = arr[l++];
        }

        while (r <= high) {
            temp[k++] = arr[r++];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i + low] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergesort(new int[]{38, 27, 43, 3, 9, 82, 10}, 0, 6);
    }
//    l = 0 mid = 3, high = 6
//    l = 0 mid = 1, high  = 3
//    temp = high - low + 1
//    arr[l + i ] = temp[i];
//
//    l = 0
//    arr[0] = temp[0]
//    arr[1] =  temp [i]
//    arr[2] = temp[2]
//    arr[3] = temp[3]
//
//
//    l = 4
//    mid = 5
//    high = 6
//    temp = [high - low + 1]
//    temp = [3]
//    for i : temp
//    arr[low + i] = temp
//    arr[4] = temp[0]
//    arr[5] = temp[1]
//    arr[6] = temp[2]
}
