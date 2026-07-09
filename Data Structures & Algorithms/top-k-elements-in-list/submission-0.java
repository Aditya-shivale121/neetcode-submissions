class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> freq = new HashMap<>();

        for(int no : nums){
            freq.put(no,freq.getOrDefault(no,0)+1);
        };

        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];

        for(int key : freq.keySet()){
            int count = freq.get(key);

            if(bucket[count] == null) bucket[count] = new ArrayList<>();

            bucket[count].add(key);
        }

        int ans[] = new int[k];

        int idx = 0;
        for(int i = nums.length ; i >= 0  ; i --){
            if (bucket[i] != null){

                for(int num : bucket[i]){
                    ans[idx++] = num;

                    if(idx == k) return ans;
                }
            }
        }
        return ans;

      
    }
}
