package in.ineuron.in;

public class PeakElement {
	
	    public static int findPeakElement(int[] nums) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] < nums[mid + 1]) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }

	        return left;
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {1, 2, 3, 1};
	        int peakIndex1 = findPeakElement(nums1);
	        System.out.println("Peak index in nums1: " + peakIndex1);

	        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
	        int peakIndex2 = findPeakElement(nums2);
	        System.out.println("Peak index in nums2: " + peakIndex2);
	    }
	}


