package arrays;


//todo: revise modular arithmetic approach
public class LeftRotateArrayByNPlace {

    //o(n) time and o(n) space
    void leftRotateByD(int[] arr, int d){
        int[] temp = new int[arr.length];
        d = d % arr.length;
        for(int i= 0; i < d; i++){
            temp[arr.length - d + i] = arr[i];
        }
        for(int i = d ; i < arr.length; i++){
            temp[i - d] = arr[i];
        }
        System.out.println("Array after left rotation by " + d + " places:");
        System.out.println(java.util.Arrays.toString(temp));

    }

    //o(n) time and o(1) space
//    alternative approach
//            reverse(arr, 0, d - 1);
//            reverse(arr, d, arr.length - 1);
//            reverse(arr, 0, arr.length - 1);

    public static void main(String[] args) {
        LeftRotateArrayByNPlace leftRotateArrayByNPlace = new LeftRotateArrayByNPlace();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 4;
        leftRotateArrayByNPlace.leftRotateByD(arr, d);
    }
}
