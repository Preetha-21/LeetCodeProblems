import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);        // sort the array
        return nums[nums.length / 2];  // middle element is majority
    }
}
