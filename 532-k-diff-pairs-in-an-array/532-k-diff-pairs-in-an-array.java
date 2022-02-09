class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums); // sorted the array
        Set<Integer> set = new HashSet<>(); // Declare the HashSet to only consider unique one's
        int n = nums.length; // length of the array
        for(int i = 0; i < nums.length - 1; i++){
            // searching for binary index for the no from the i + 1 index to n 
            // and check if we are getting nums[i] + k, where nums[i] is our 'x'
            if(Arrays.binarySearch(nums, i + 1, n, nums[i] + k) > 0){
                set.add(nums[i]);
            }
        }
        return set.size();
    }
}