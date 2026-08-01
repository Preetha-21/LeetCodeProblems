class Solution {
    public int hammingDistance(int x, int y) {
        int res=x^y;
        String s=String.format("%4s", Integer.toBinaryString(res))
                      .replace(' ', '0');
       
    int count=0;
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='1')
        {
            count++;
        }
      }
      return count;
    }
}