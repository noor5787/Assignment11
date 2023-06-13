package in.ineuron.in;
import java.util.*;
public class IntersectionArray {



	    public static int[] intersection(int[] nums1, int[] nums2) {
	        Set<Integer> set1 = new HashSet<>();
	        for (int num : nums1) {
	            set1.add(num);
	        }

	        Set<Integer> resultSet = new HashSet<>();
	        for (int num : nums2) {
	            if (set1.contains(num)) {
	                resultSet.add(num);
	            }
	        }

	        int[] result = new int[resultSet.size()];
	        int index = 0;
	        for (int num : resultSet) {
	            result[index++] = num;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {1, 2, 2, 1};
	        int[] nums2 = {2, 2};
	        int[] intersectionArray = intersection(nums1, nums2);
	        System.out.println(Arrays.toString(intersectionArray));

	        int[] nums3 = {4, 9, 5};
	        int[] nums4 = {9, 4, 9, 8, 4};
	        int[] intersectionArray2 = intersection(nums3, nums4);
	        System.out.println(Arrays.toString(intersectionArray2));
	    }
	}


