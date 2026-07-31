class Solution {
    public int findShortestSubArray(int[] nums) {
        int arr[]=new int[50000];
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
       int max = Arrays.stream(arr).max().getAsInt();
       System.out.println(max);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                li.add(i);
                
            }
        }
        System.out.println(li);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<li.size();i++)
        {
            int a=li.get(i);
            int f=0;
            int l=0;
            boolean first =false;
            for(int j=0;j<nums.length;j++)
            {
               if((nums[j]==a)&&first ==false)
               {
                f=j;
                first= true;
               }
               if((nums[j]==a)&&first!=false)
               {
                l=j;
               }
            }
            System.out.println(f+" "+l);
            min=Integer.min(min,(l+1)-f);
        }
        return min;
    }
}