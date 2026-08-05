class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int a=max;
        System.out.print(max);
        for(int i=1;i<k;i++)
        {
            max+=a+i;
            System.out.print(max);
        }
        return max;
    }
}