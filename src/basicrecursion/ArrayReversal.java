package basicrecursion;

//TC = O(n)
//SC = O(n) for recursion stack , auxiliary space = O(1)
public class ArrayReversal {
//    int[] reverseArrayRecursion(int[] arr,int start, int end ){
//        if ( start >= end ) return arr;
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//        return reverseArrayRecursion(arr, start +1 , end -1 );
//    }

    int[] reverseArrayRecursion(int[] arr, int i){
        int n = arr.length;
        if ( i >= n - i - 1 ) return arr;

        int temp = arr[i] ;
        arr [ i ] = arr [ n -i - 1];
        arr [ n -i-1 ] = temp;

        return reverseArrayRecursion(arr, i + 1  ) ;

        //f({1,2,3,4,5}, 0) -> f({5,2,3,4,1}, 1) -> f({5,4,3,2,1}, 2) -> f({5,4,3,2,1}, 3) -> return {5,4,3,2,1}
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        arr = new ArrayReversal().reverseArrayRecursion(arr, 0);
        for ( int i : arr) System.out.print(i + " ");
    }


}
