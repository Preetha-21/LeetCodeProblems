class Solution {
    public String[] findRelativeRanks(int[] score) {
        int arr[]=score.clone();
        String b[]=new String[score.length];
        String a[]={"1"};
        Arrays.sort(arr);
        int count=1;
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=0;j<score.length;j++)
            {
                if(score[j]==arr[i])
                {
                    String x=String.valueOf(count);
                    b[j]=x;
                    count++;
                    break;
                }
            }
        }
        for(int i=0;i<b.length;i++)
        {
            if(b[i].equals("1"))
            {
                b[i]="Gold Medal";
            }
            else if(b[i].equals("2"))
            {
                b[i]="Silver Medal";
            }
            else if(b[i].equals("3"))
            {
                b[i]="Bronze Medal";
            }
        }
        return b;
    }
}