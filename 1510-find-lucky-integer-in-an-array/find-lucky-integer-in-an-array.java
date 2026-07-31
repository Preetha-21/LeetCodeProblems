class Solution {
    public int findLucky(int[] arr) {
        int a[]=new int[600];
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            a[arr[i]]++;
        }
        for(int i=0;i<a.length;i++)
        {
            if(i==0)
            {
                continue;
            }
            else if(i==a[i])
            {
                max=Math.max(i,max);
            }
        }
      return max;
    }
}