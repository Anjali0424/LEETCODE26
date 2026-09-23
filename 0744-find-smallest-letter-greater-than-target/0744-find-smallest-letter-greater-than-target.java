class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int left = 0, right = arr.length - 1;
        char ans = arr[0];
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] > target) {
                ans = arr[mid];
                right = mid - 1;
            }
            else {
                left = mid+1;
            }
        }
        
        return ans;
    }
}