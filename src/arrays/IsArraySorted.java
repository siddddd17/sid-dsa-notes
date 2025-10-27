package arrays;

public class IsArraySorted {
//    //check if array is sorted
//// {12345}
//1>2> 3> 4> 5
//
////iterate through the array, check if the next element is greater than prev, if yes true:
//    tc: o(n)
//    sc: o(1)
//
    public boolean check(int[] nums) {
    int count = 0, n = nums.length;
    for (int i = 0; i < n; i++)
        if (nums[i] > nums[(i+1) % n] && ++count > 1) return false;
    return count <= 1;
    }

    public static void main(String[] args) {
        IsArraySorted isArraySorted = new IsArraySorted();
        System.out.println(isArraySorted.check(new int[]{1,2,3}));
    }
}
