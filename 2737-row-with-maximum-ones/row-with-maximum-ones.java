class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0;
        int a[]={0,0};
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[i].length;j++)
            {
               if(mat[i][j]==1)
               {
                count++;
               }
            }
            if(count>max)
            {
                a[0]=i;
                a[1]=count;
                max=count;
            }
        }
        return a;
    }
}