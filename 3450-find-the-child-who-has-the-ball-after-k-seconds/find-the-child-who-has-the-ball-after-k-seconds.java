class Solution {
    public int numberOfChild(int n, int k) {
        boolean ans=true;
        int j=0;
        int h=-1;
        for(int i=0;i<=k;i++)
        {
            if(ans)
            {
               h=h+1;
               if(h==n-1)
               {
                ans=false;
               }
            }
            else if(!ans)
            {
                h=h-1;
                if(h==0)
                {
                    ans=true;
                }
            }
        }
        return h;
    }
}