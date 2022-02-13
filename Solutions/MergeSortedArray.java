import java.util.Arrays;

/*

https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

*/
public class MergeSortedArray {
    public static void main(String[] args) {

        int[] nums1 = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        mergeWithoutSort(nums1, m, nums2, n);

    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m] = nums2[i];
            m++;
        }

        Arrays.sort(nums1);

        /*
         * Time Complexity:
         * Cost of sorting the array oo length n = O(nlogn)
         * For two arrays of length m and lenghth n = O((n+m)log(n+m))
         * Space Complexity:
         * Most built-in sorting algorithms are O(n) space complexity
         */

        System.out.println(Arrays.toString(nums1));

    }

    private static void mergeWithoutSort(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {

        }

    }

}
