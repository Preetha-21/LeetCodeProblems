class Solution {
    public int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.print(map);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
       list.sort((a, b) -> {
       if (a.getValue().equals(b.getValue())) {
        return b.getKey() - a.getKey();   // Descending value
         }
        return a.getValue() - b.getValue();   // Ascending frequency
          });
        int j=0;
        for (Map.Entry<Integer, Integer> i: list) {
             int num=i.getKey();
             int count=i.getValue();
             while(count!=0)
             {
                nums[j]=i.getKey();
                j++;
                count--;
             }

        }
        System.out.print(list1);
        return nums;
    }
}