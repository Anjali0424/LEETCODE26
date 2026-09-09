class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
       
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for(int num : nums2) {
            if(set.contains(num) && !list.contains(num)) {
                list.add(num);
            }
        }
        int ans[] = new int[list.size()];
        for(int i = 0; i <ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}