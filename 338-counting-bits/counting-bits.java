class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        
        for(int i=0;i<=n;i++)
        {
            int c=i;
            int count=0;
           while(c!=0)
           {
            int r=c%2;
            if(r==1)
            {
                count++;
            }
            c=c/2;
           }
           arr[i]=count;
        }
        return arr;
    }
}