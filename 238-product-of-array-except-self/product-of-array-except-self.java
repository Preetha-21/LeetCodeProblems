class Solution {
    public int[] productExceptSelf(int[] nums) {
       int arr[]=new int[nums.length];
        arr[0]=1;
        int prod=1;
        for(int i=1;i<nums.length;i++)
        {
            prod*=nums[i-1];
            arr[i]=prod;
        }
        prod=nums[nums.length-1];
        System.out.print(Arrays.toString(arr));
        for(int i=nums.length-2;i>=0;i--)
        {
           
           arr[i]=prod*arr[i];
           prod=prod*nums[i];
           
        }
        return arr;
    }
}