class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans=0;
        long d =0;
        if(nums.length%2==1)
        {
          ans+=nums[nums.length/2];
        }
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            String a=String.valueOf(nums[left]);
            String b=String.valueOf(nums[right]);
            String c=a+b;
            System.out.println(c);
            d=Integer.parseInt(c);
            ans+=d;
            left++;
            right--;
        }
        return ans;
    }
}