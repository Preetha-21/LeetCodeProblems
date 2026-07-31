class Solution {
    public boolean checkString(String s) {
        boolean a=true;
        boolean b=true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b'&&b==true)
            {
                b=false;
            }
            if(!b)
            {
                if(s.charAt(i)=='a')
                {
                    return false;
                }
            }
        }
        return true;
    }
}