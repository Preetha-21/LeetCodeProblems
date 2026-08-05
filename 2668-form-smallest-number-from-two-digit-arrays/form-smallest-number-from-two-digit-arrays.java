class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums1)
        {
            list.add(i);
        }
        for(int i:nums2){
            if(list.contains(i))
            {
                return i;
            }
        }
        int ans=0;
        if(nums1[0]<nums2[0])
        {
            ans=(nums1[0]*10)+nums2[0];
        }
        else{
            ans=(nums2[0]*10)+nums1[0];
        }
        return ans;
    }
}