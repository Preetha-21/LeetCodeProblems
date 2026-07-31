class Solution {
    public int countCharacters(String[] words, String chars) {
        ArrayList<Character> list=new ArrayList<>();
        int count=0;
        int s=0;
        for(int i=0;i<chars.length();i++)
        {
            list1.add(chars.charAt(i));
        }
        for(int i=0;i<words.length;i++)
        {
            s=0;
            for(int j=0;j<words[i].length();j++)
            {
                
                if(list.contains(words[i].charAt(j)))
                {
                    s++;
                    list.remove((Character)words[i].charAt(j));
                }
                else{
                  j=words[i].length()+1;
                }
            }
            if(s==words[i].length())
            {
                count+=s;
            }
            list.clear();
             for(int l=0;l<chars.length();l++)
             {
               list.add(chars.charAt(l));
              }
        }
        return count;
    }
}
