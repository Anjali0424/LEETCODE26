class Solution {
    public int pivotIndex(int[] nums) {
        for(int i = 0; i < nums.length ; i++) {
            int left = 0 , right = 0 , j = i - 1 , k = i + 1;
            while(j >= 0) {
                left += nums[j];
                j--;
            }
            while(k < nums.length) {
                right += nums[k];
                k++;
            }
            if(left == right) {
                return i;
            }
        }
        return -1;
    }
}