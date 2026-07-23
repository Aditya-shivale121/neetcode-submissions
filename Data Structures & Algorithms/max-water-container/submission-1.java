class Solution {
    public int maxArea(int[] heights) {
        int maxwater = 0;

        int l = 0, r = heights.length - 1;
        while (l < r) {
            int water = Math.min(heights[l], heights[r]) * (r - l);
            maxwater = Math.max(water, maxwater);

            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxwater;
    }
}
