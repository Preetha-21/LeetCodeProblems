class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int count=0;
            for(int j=i+1;j<s.length();j++)
            {
              char ch1=s.charAt(j);
              {
                if(ch==ch1)
                {
                    int a=ch-'a';
                    if(distance[a]==count)
                    {
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    count++;
                }
              }
            }
        }
        return true;
    }
}