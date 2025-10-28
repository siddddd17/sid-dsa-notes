package arrays;

public class RemoveDuplicates {
    int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;

    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates.removeDuplicates(arr);
        System.out.println("Length after removing duplicates: " + length);
    }
}
