class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String c[]=new String[heights.length];
        int b[]=heights.clone();
        Arrays.sort(b);
        int a=heights.length-1;
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(b[i]==heights[j])
                {
                 c[a]=names[j];
                 a--;  
                }
            }
        }
        return c;
    }
}