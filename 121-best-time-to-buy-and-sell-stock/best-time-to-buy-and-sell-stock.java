class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
             if(prices[i]<max)
             {
                  max=prices[i];
             }
             else{
                  profit=Math.max(profit,(prices[i]-max));
             }
        }
        return profit;
    }
}