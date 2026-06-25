class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> have = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(have.containsKey(target - nums[i])){
                return new int[]{ have.get(target - nums[i]), i} ;
                
         }
         have.put(nums[i],i);
        }
        
        return new int[]{};
    }
}
