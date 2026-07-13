class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int no: nums){
            if(!set.add(no)) return true;
        }
        return false;
    }
}