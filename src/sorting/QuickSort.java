package sorting;


//space complexity = O(log n) for recursion stack
//time complexity = O(n log n) on average , O(n^2) in worst case
//todo: learn this better
public class QuickSort {

    public void quickSort(int[] arr, int low, int high) {
        if (low >= high) return; // Correct base case
        int pivot = findPivot(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    private int findPivot(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        while (i < j) {
            while (i < high && arr[i] <= arr[low]) i++;
            while (j > low && arr[j] > arr[low]) j--;
            if (i < j) swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        quickSort.quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}