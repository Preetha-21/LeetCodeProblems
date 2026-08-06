class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]={-1,-1};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums)
        {
            if(!list.contains(i))
            {
                list.add(i);
            }
            else{
                arr[0]=i;
            }

        }
        Collections.sort(list);
        System.out.print(list);
        int j=1;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)!=j)
            {
                arr[1]=j;
                break;
            }
            j++;
        }
        if(arr[1]==-1)
        {
            arr[1]=list.get(list.size()-1)+1;
        }
        return arr;
    }
}