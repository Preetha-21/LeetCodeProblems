class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]){
                     count++;
                     list.add(nums2[j]);
                     nums2[j]=-1;
                     break;
                }
            }
        }
        int a[] =new int[count];
        int h=0;
        for(int i:list)
        {
            a[h++]=i;
        }
        return a;
    }
}