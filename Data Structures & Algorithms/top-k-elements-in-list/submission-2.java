class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer ,Integer> map = new HashMap<>();
      for(int no : nums){
        map.put(no,map.getOrDefault(no, 0)+1);
      }

      ArrayList<Integer>[] bucket =  new ArrayList[nums.length + 1];
      for(int key : map.keySet()){
        int freq = map.get(key);

        if(bucket[freq] == null) bucket[freq] = new ArrayList<>();

        bucket[freq].add(key); 

      }

      int ans[] = new int[k];
      int idx  = 0 ;
      for(int i = nums.length ; i >= 0 ; i--){
          if(bucket[i] != null){
            for(int no : bucket[i]){
              ans[idx] = no;
              idx ++;
              if(idx == k) return ans;
            }
          }
      }
      return ans;
        
    }
}
