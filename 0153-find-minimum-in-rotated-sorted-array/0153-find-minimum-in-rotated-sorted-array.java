class Solution {
    public int findMin(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while(first < last) {
            int mid = first + (last - first) / 2;
            if(arr[mid] > arr[last]) {
                first = mid + 1;
            }
            else {
                last = mid;
            }
        }
        return arr[first];
    }
}