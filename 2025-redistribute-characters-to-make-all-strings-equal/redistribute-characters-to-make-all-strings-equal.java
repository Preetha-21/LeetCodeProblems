class Solution {
    public boolean makeEqual(String[] words) {
        int a[]=new int[26];
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                char ch=words[i].charAt(j);
                a[ch-'a']++;
            }
        }
        for(int i:a){
            if(i%words.length!=0)
            {
                return false;
            }
        }
        return true;
    }
}