class Solution {
    public int countGoodSubstrings(String s) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length()-2;i++)
        {
            String h=s.substring(i,i+3);
            list.add(h);
        }
        int max=0;
        for(int i=0;i<list.size();i++)
        {
            String j=list.get(i);
            int count=0;
            for(int l=0;l<j.length();l++)
            {
                
                for(int k=l+1;k<j.length();k++)
                {
                    if(j.charAt(l)==j.charAt(k))
                    {
                        count++;
                    }
                }
            }
            if(count==0)
                {
                    max++;
                }
        }
        return max;
    }
}