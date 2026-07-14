class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int no : nums){
            set.add(no);
        }
         int max = 1; 
        for(int no : set){
            if(set.contains(no - 1)){
               int curr = no;
               int count = 1;
               while(set.contains(curr + 1 )){
                count ++;
                curr ++;
                
               }
               max = Math.max(max ,count + 1);
            }
            
        }

        return max;
        
    }
}
