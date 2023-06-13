package in.ineuron.in;

public class MissingNumber {

	    public static int findMissingNumber(int[] nums) {
	        int n = nums.length;
	        int expectedSum = (n * (n + 1)) / 2;
	        int actualSum = 0;
	        
	        for (int num : nums) {
	            actualSum += num;
	        }
	        
	        return expectedSum - actualSum;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums1 = {3, 0, 1};
	        System.out.println("Missing number: " + findMissingNumber(nums1));
	        
	        int[] nums2 = {0, 1};
	        System.out.println("Missing number: " + findMissingNumber(nums2));
	        
	        int[] nums3 = {0, 2, 3, 4, 1, 6};
	        System.out.println("Missing number: " + findMissingNumber(nums3));
	    }
	}


