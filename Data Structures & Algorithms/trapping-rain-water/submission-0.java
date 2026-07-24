class Solution {
    public int trap(int[] height) {
        
        int water = 0;
        int n = height.length;

        int leftmax = height[0];
        int rightmax = height[n-1];
        
        int l = 0 , r = n - 1;
        for (int i = 0 ; i < n ; i++){

            leftmax = Math.max(leftmax , height[l]);
            rightmax = Math.max(rightmax , height[r]);
            water += Math.min(leftmax , rightmax) - height[i];
            

            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }

        
        return water;

        
    }
}
