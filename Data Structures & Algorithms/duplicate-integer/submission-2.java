class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for (int no : nums){
            res.add(no);
        }
        if(res.size() != nums.length) return true;
        else return false;
    }
}