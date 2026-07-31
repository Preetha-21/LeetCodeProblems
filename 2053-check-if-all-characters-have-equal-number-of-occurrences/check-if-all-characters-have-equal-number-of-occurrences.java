class Solution {
    public boolean areOccurrencesEqual(String s) {
        int k=1;
        int count=1;
        char c[]=s.toCharArray();
        Arrays.sort(c);
        for(int i=0;i<c.length-1;i++)
        {
            if(c[i]==c[i+1])
            {
                count+=1;
            }

            else if(k==1)
            {
                k=count;
                if(count==c.length-1)
                {
                    return false;
                }
                else if(count==k)
                {
                    count=1;
                    continue;
                }
                
            }
            if(i==c.length-2)
            {
                if(count==c.length)
                {
                    return true;
                }
                else if(k!=count)
                {
                    return false;
                }
            }
            
            else if(c[i]!=c[i+1])
            {
                if(count==k)
                {
                    count=1;
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        
        return true;
    }
}