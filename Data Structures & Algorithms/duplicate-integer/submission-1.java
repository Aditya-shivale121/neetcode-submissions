class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int no : nums){
            
            
            map.put(no,map.getOrDefault(no,0)+1);
            if(map.get(no) > 1) return true;
        }
        return false;
    }
}