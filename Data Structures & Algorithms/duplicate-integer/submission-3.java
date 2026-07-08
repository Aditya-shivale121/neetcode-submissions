class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(){};
        for(int no : nums){
            set.add(no);
        }
        if(set.size() != nums.length) return true;
        else return false;
    }
}