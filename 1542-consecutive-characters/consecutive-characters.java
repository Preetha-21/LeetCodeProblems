class Solution {
    public int maxPower(String s) {
        int count=1;
        int max=1;
        char a[]=s.toCharArray();
        if(a.length==2)
        {
            if(a[0]==a[1])
            {
                count+=1;
                if(max<count)
                       {
                         max=count;
                       }
            }
        }
        else
        {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                count+=1;
                if(i==a.length-1)
                {
                    if(max<count)
                       {
                         max=count;
                       }
                }
            }
            else 
            {
                if(max<count)
                {
                    max=count;
                }
                count=1;
            }

        }
        if(max<count)
                       {
                         max=count;
                       }
        }
        return max;
    }
}