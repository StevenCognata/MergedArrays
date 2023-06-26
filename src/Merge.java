import java.util.Arrays;

public class Merge {


    public static void mergeSortedArrays(int[] nums1, int[] nums2){
        int mergedArrayLength = nums1.length + nums2.length;

        int[] mergedArray = new int[mergedArrayLength];

        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);

        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        Arrays.sort(mergedArray);

        System.out.println(Arrays.toString(mergedArray));

    }
}
