class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        ArrayList<Integer> list=new ArrayList<>();
        int ans[]={-1,-1};
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++){
                if(!list.contains(grid[i][j]))
                {
                list.add(grid[i][j]);
                }
                else{
                    ans[0]=grid[i][j];
                }
            }
        }
    
        Collections.sort(list);
         System.out.print(list);
        int j=1;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)!=j)
            {
                ans[1]=list.get(i)-1;
                break;
            }
            j++;
        }
        if(ans[1]==-1)
        {
            ans[1]=list.get(list.size()-1)+1;
        }
        return ans;
    }
}