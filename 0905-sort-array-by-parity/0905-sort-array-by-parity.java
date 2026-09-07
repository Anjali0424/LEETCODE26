class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k = 0;
        int j = nums.length - 1;
        int arr[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                arr[k] = nums[i];
                k++;
            }
            else {
                arr[j] = nums[i];
                j--;
            }
        }
        return arr;
    }
}