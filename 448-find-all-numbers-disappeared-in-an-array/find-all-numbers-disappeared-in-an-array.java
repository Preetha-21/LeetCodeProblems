class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        int k=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            while(k<nums[i])
            {
                numbers.add(k);
                k++;
            }
            if(k==nums[i])
            {
                k++;
            }
        }
        while(k<=nums.length)
        {
            numbers.add(k);
            k++;
        }
        return numbers;
       
    }
}