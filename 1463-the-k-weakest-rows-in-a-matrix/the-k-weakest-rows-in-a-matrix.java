class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int arr[]=new int[k];
        int a[]=new int[mat.length];
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==0)
                {
                    count++;
                }
            }
            a[i]=count;
        }
       System.out.print(Arrays.toString(a));
        for(int i=0;i<k;i++)
        {
            int ind=-1;
            int max=-1;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]!=-1&&max<a[j])
                {
                    max=a[j];
                    ind =j;
                }
            }
            if(ind!=-1)
            {
            arr[i]=ind;
            a[ind]=-1;
            }

            
        }
        return arr;
    }
}