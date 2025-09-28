package basicrecursion;

//TC = O(n)
//SC = O(n) for recursion stack , auxiliary space = O(1)
public class ArrayReversal {
    int[] reverseArrayRecursion(int[] arr,int start, int end ){
        if ( start >= end ) return arr;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverseArrayRecursion(arr, start +1 , end -1 );
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        arr = new ArrayReversal().reverseArrayRecursion(arr, 0, n-1);
        for ( int i : arr) System.out.print(i + " ");
    }


}
