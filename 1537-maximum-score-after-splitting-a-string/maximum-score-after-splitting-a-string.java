class Solution {
    public int maxScore(String s) {
        int total=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                total++;
            }
        }
        int left=0;
        int right=total;
        int max=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')
            {
                left++;
            }
            else if(s.charAt(i)=='1')
            {
              right--;
            }
            max=Math.max(max,left+right);
        }
        return max;
    }
}