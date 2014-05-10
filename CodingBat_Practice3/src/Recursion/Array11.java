package Recursion;

public class Array11 {

	public static int array11(int[] nums, int index) {
		  int count = 0;
		  if (index + 1 > nums.length) return 0;
		  if (nums[index] == 11) count++;
		  count += array11(nums, index + 1);
		  return count;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {11, 11};
		int index = 0;
		System.out.println(array11(nums, index));
	}
}
