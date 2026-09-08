class Solution {
    public int[] productExceptSelf(int[] nums) {
        int x = 1, count = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == 0) count++;
            else x *= nums[i];
        }

        for(int i = 0 ; i < nums.length; i++) {
            if(count > 1 ) nums[i] = 0;
            else if(count == 1 ) {
                if(nums[i] == 0 ) nums[i] = x;
                else nums[i] = 0;
            }
            else {
                nums[i] = x / nums[i];
            }
        }
        return nums;
    }
}