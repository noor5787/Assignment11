package in.ineuron.in;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Find the leftmost position of the target
        int leftIndex = binarySearch(nums, target, true);
        
        // If the target is not found, return [-1, -1]
        if (leftIndex == nums.length || nums[leftIndex] != target) {
            return result;
        }
        
        // Find the rightmost position of the target
        int rightIndex = binarySearch(nums, target, false) - 1;
        
        result[0] = leftIndex;
        result[1] = rightIndex;
        
        return result;
    }
    
    // Helper function to perform binary search
    private int binarySearch(int[] nums, int target, boolean left) {
        int low = 0;
        int high = nums.length;
        
        while (low < high) {
            int mid = (low + high) / 2;
            
            if (nums[mid] > target || (left && nums[mid] == target)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
}

public class Main {

	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        
	        int[] nums1 = {5, 7, 7, 8, 8, 10};
	        int target1 = 8;
	        int[] result1 = solution.searchRange(nums1, target1);
	        System.out.println("Output for nums1 and target1: [" + result1[0] + ", " + result1[1] + "]");
	        
	        int[] nums2 = {5, 7, 7, 8, 8, 10};
	        int target2 = 6;
	        int[] result2 = solution.searchRange(nums2, target2);
	        System.out.println("Output for nums2 and target2: [" + result2[0] + ", " + result2[1] + "]");
	    }
	}


