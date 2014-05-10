package November2013;

public class post4 {

	public static int[] post4(int[] nums) {
		int len = nums.length;
		  int four = 0;
		  for (int i = 0; i < len; i++) {
		    if (nums[i] == 4) {
		      four = i;
		    }
		  }
		  int[] x = new int[len - four - 1];
		  for (int i = four + 1; i < len; i++) {
		    x[i - four - 1] = nums[i];
		  }
		  return x;
		}
	
	
	public static void main(String[] args) {
		
		int[] nums = {2, 4, 1, 2};
		System.out.println(post4(nums));
	}
}
