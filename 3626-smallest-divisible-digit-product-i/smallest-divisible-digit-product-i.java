class Solution {
    public int smallestNumber(int n, int t) {
        boolean ans=true;
        while(ans)
        {
            int num=n;
            int prod=1;
            while(num!=0)
            {
                int rem=num%10;
                prod*=rem;
                num=num/10;
            }
            if(prod%t==0)
            {
                ans=false;
                return n;
            }
            else{
                n++;
            }
        }
        return -1;
    }
}