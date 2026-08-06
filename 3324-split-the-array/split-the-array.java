class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int arr[]=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
        int count=0;
        for(int i:arr)
        {
            if(i==2||i==0)
            {
                continue;
            }
            else if(i==1)
            {
                count++;
            }
            else{
                return false;
            }
        }
        return count%2==0;
    }
}