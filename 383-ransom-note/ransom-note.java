class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       
        for(int i=0;i<ransomNote.length();i++)
        {
            for(int j=0;j<magazine.length();j++)
            {
                if(ransomNote.charAt(i)==magazine.charAt(j))
                {
                    magazine = magazine.replaceFirst(String.valueOf(magazine.charAt(j)), "1");
                    break;
                }
                else if(j==magazine.length()-1)
                {
                    return false;
                }
            }
        }
        return true;
    }
}