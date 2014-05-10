package Recursion;

public class Array220 {

	public static boolean array220(int[] nums, int index) {
		  if (index + 1 >= nums.length) return false;
		  if (nums[index] * 10 == nums[index + 1]) return true;
		  return array220(nums, index + 1);
	}
	
	
	public static void main(String[] args) {
		int[] nums = {2, 19, 4};
		int index = 0;
		System.out.println(array220(nums, index));
	}
}
