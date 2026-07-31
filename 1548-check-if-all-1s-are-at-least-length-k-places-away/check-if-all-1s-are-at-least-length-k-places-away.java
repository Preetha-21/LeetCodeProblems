class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count=0;
        boolean a=false;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==0)
           {
            count++;
           }
           else{
 
            if(i!=0&&a==true)
            {
            if(count<k)
            {
                System.out.print(count);
                return false;
            }
            else{
                count=0;
            }
            }
            a=true;
            count=0;
           }
        }
        return true;
    }
}