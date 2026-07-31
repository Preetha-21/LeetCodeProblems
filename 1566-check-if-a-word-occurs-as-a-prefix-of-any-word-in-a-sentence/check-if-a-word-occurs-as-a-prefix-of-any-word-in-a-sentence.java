class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String arr[]=sentence.split(" ");
        int ind=-1;
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            if(arr[i].contains(searchWord))
            {
                for(int j=0;j<searchWord.length();j++)
                {
                    if(arr[i].charAt(j)==searchWord.charAt(j))
                    {
                        count++;
                    }
                }
                if(count==searchWord.length())
                {
                    ind=i;
                return i+1;
                }
                
                
            }
        }
        return ind;
    }
}