class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.charAt(0)=='1'){
               for(int i=0;i<=s.lastIndexOf('1');i++)
               {
                if(s.charAt(i)=='1')
                {
                    continue;
                }
                else{
                    return false;
                }
               }
        }
        else if(s.charAt(0)=='0'){
               for(int i=s.lastIndexOf('1')+1;i<s.length();i++)
               {
                if(s.charAt(i)=='0')
                {
                    continue;
                }
                else{
                    return false;
                }
               }
        }
        return true;
    }
}