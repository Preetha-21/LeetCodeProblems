class Solution {
    public int maxNumberOfBalloons(String text) {
        char a[]=new char[26];
        for(int i=0;i<text.length();i++)
        {
         char ch=text.charAt(i);
         a[ch-'a']++;
        }
        int count=0;
        boolean c=true;
        while(c)
        {
            if((a['b'-'a']>0)&&(a['a'-'a']>0)&&(a['l'-'a']>0)&&(a['l'-'a']>1)&&(a['o'-'a']>0)&&(a['o'-'a']>1)&&(a['n'-'a']>0))
            {
                a['b'-'a']--;
                a['a'-'a']--;
                a['l'-'a']--;
                a['l'-'a']--;
                a['o'-'a']--;
                a['o'-'a']--;
                a['n'-'a']--;
                count++;
            }
            else{
                return count;
            }
        }
        return count;
    }
}