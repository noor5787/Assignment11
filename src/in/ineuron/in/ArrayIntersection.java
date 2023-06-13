package in.ineuron.in;
import java.util.*;
public class ArrayIntersection {


	
	    public static int[] intersect(int[] nums1, int[] nums2) {
	        // Create hash maps to store the count of each element
	        Map<Integer, Integer> countMap1 = new HashMap<>();
	        Map<Integer, Integer> countMap2 = new HashMap<>();

	        // Count the occurrences of each element in nums1
	        for (int num : nums1) {
	            countMap1.put(num, countMap1.getOrDefault(num, 0) + 1);
	        }

	        // Count the occurrences of each element in nums2
	        for (int num : nums2) {
	            countMap2.put(num, countMap2.getOrDefault(num, 0) + 1);
	        }

	        List<Integer> intersection = new ArrayList<>();

	        // Find the intersection by comparing the count of each element in both arrays
	        for (int num : countMap1.keySet()) {
	            if (countMap2.containsKey(num)) {
	                int occurrences = Math.min(countMap1.get(num), countMap2.get(num));
	                for (int i = 0; i < occurrences; i++) {
	                    intersection.add(num);
	                }
	            }
	        }

	        // Convert the intersection list to an array
	        int[] result = new int[intersection.size()];
	        for (int i = 0; i < intersection.size(); i++) {
	            result[i] = intersection.get(i);
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {1, 2, 2, 1};
	        int[] nums2 = {2, 2};
	        int[] result1 = intersect(nums1, nums2);
	        System.out.println(Arrays.toString(result1)); // Output: [2, 2]

	        int[] nums3 = {4, 9, 5};
	        int[] nums4 = {9, 4, 9, 8, 4};
	        int[] result2 = intersect(nums3, nums4);
	        System.out.println(Arrays.toString(result2)); // Output: [4, 9]
	    }
	}


