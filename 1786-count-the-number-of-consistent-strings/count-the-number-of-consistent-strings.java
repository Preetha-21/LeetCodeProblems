class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        int i=0;
        for( i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                if(allowed.contains(String.valueOf(words[i].charAt(j))))

                {
                    
                    if(j==words[i].length()-1)
                    {
                        count++;
                    }
                    continue;
                }
                else
                {
                    break;
                }
            }
        }
        return count;
    }
}