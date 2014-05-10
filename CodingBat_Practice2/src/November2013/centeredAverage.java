package November2013;

public class centeredAverage {

	public static int centeredAverage(int[] nums) {
		  int sum = 0;
		  int max = 0;
		  int min = nums[0];
		  for (int i = 0; i < nums.length; i++) {
		    max = Math.max(max, nums[i]);
		    min = Math.min(min, nums[i]);
		    sum = sum + nums[i];
		  }
		  System.out.println("Max: " + max);
		  System.out.println("Min: " + min);
		  System.out.println("Sum: " + sum);
		  System.out.println("Length: " + nums.length);
		  return (sum - max - min) / (nums.length - 2);
		}
	
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 100};
		System.out.println(centeredAverage(nums));
	}
}
