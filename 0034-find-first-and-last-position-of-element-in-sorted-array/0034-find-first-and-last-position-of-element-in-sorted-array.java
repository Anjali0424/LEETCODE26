class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int s = -1 , e = -1;
        int ans = 0;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                s = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }  

        left = 0;
        right = nums.length -1 ;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                e = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        int arr[] = new int[2];
        arr[0] = s;
        arr[1] = e;
        return arr;
    }
}