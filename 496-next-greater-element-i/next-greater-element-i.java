class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            boolean a=false;
            for(int j=0;j<nums2.length;j++)
            {
                if (a)
                {
                  if(nums1[i]<nums2[j])
                  {
                     arr[i]=nums2[j];
                     break;
                  }
                }
                else if(nums1[i]==nums2[j])
                {
                    a=true;
                }
                
            }
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
         return arr;
    }
   
}