package Recursion;

public class Array6 {

	public static boolean array6(int[] nums, int index) {
		  if (index + 1 > nums.length) {
			  return false;
		  }
		  if (nums[index] == 6) {
			  return true;
		  }
		  return (array6(nums, index + 1));
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 4};
		int index = 0;
		System.out.println(array6(nums, index));
	}
}
