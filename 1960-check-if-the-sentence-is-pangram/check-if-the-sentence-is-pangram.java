class Solution {
    public boolean checkIfPangram(String sentence) {
        char a[]=new char[26];
        for(int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            a[ch-'a']++;

        }
        for(int nums:a)
        {
            if(nums==0)
            {
                return false;
            }
        }
        return true;
    }
}