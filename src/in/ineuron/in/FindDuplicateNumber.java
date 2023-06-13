package in.ineuron.in;

public class FindDuplicateNumber {
	    public static int findDuplicate(int[] nums) {
	        int slow = nums[0];
	        int fast = nums[0];

	        // Find the intersection point of the two pointers
	        do {
	            slow = nums[slow];
	            fast = nums[nums[fast]];
	        } while (slow != fast);

	        // Move one pointer to the beginning while keeping the other at the intersection point
	        slow = nums[0];
	        while (slow != fast) {
	            slow = nums[slow];
	            fast = nums[fast];
	        }

	        // Return the duplicate number
	        return slow;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 3, 4, 2, 2};
	        int duplicate = findDuplicate(nums);
	        System.out.println("Duplicate number: " + duplicate);
	    }
	}


