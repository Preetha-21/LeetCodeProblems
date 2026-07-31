class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]){
                    if(!list.contains(nums1[i]))
                    { 
                     count++;
                     list.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        int a[] =new int[count];
        int h=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]){
                    if(!l.contains(nums1[i])){
                    a[h]=nums1[i];
                    h++;
                    l.add(nums1[i]);
                    break;
                    }
                }
            }
        }
        return a;
    }
}