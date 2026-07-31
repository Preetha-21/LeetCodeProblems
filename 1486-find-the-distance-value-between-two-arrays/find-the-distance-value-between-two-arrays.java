class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        boolean g=false;
        boolean s=false;
        int res=0;
        for(int i=0;i<arr1.length;i++)
        {
            int count=0;
            for(int j=0;j<arr2.length;j++)
            {
                int ans=arr1[i]-arr2[j];
                ans=Math.abs(ans);
                    if(ans<=d)
                    {
                        count++;
                    }
            }
            if(count==0)
            {
                res++;
            }
        }
        return res;
    }
}