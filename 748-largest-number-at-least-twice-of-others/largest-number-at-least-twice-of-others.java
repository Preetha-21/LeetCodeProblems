class Solution {
    public int dominantIndex(int[] nums) {
        int count=0;
       for(int i=0;i<nums.length;i++)
       {
        count=0;
        for(int j=0;j<nums.length;j++)
        {
            if(i==j)
            {
                continue;
            }
            else if(nums[i]>=2*nums[j])
            {
                count++;
            }
            else 
            {
                break;
            }
        }
        if(count==nums.length-1)
        {
            return i;
        }
       }
       return -1;
    }
}