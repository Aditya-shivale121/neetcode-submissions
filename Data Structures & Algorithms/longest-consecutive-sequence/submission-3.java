class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if (nums.length == 0) return 0;
        for(int no : nums){
            set.add(no);
        }
        
        int max = 1;
        for(int key :set){
            if(!set.contains(key - 1)){
              int no = key;
              int curr = 1;
              while(set.contains(no + 1)){
                curr ++;
                no++;
              }
              max = Math.max(max ,curr);
            }
        }
        return max;
    }
}
