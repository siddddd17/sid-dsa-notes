package arrays;

public class ShiftAllZerosToRight {

    //tc : o(n^2)
    //sc : o(1)
    public void shiftZeros(int[] arr) {
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i] == 0 ){
                int temp = arr[i];
                for(int j = i ; j < arr.length - 1; j ++){
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = temp;
            }
        }
    }

    public void shiftZerosOptimized(int arr[]){
        int nonZeroIndex = 0 ;
        for(int i = 0 ; i < arr.length; i ++ ){
            if(arr[i]  != 0){
                arr[nonZeroIndex++] = arr[i];
            }
        }
        while(nonZeroIndex < arr.length){
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }


    public static void main(String[] args) {
        ShiftAllZerosToRight shiftAllZerosToRight = new ShiftAllZerosToRight();
        int[] arr = {0, 1, 0, 3, 12};
        shiftAllZerosToRight .shiftZerosOptimized(arr);
        for ( int i : arr) System.out.print(i + " ");
    }
}
