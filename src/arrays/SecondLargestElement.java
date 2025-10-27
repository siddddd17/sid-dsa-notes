package arrays;

public class SecondLargestElement {
//    //bruteforce:
//    sort the array O(nlogn)
//    last number would be the largest;
//    iterate from the last to first number to find the second largest  o(n)
//    total time complextiy = O(n + nlogn)
//    total space complexity = O(n)
//
//    //optimised
//    find the largest o(n)
//    find the second largest 0 (n)
//    total time compelxity : o(n)
//    total space complexity : o(1)


    int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest) largest = i;
        }

        for (int i : arr) {
            if (i > secondLargest && i < largest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 9, 6};
        System.out.println(new SecondLargestElement().findSecondLargest(arr));
    }
}

