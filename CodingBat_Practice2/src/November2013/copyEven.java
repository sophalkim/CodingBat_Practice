package November2013;

public class copyEven {

	public static int[] copyEvens(int[] nums, int count) {
		  int[] x = new int[count];
		  int y = 0;
		  for (int i = 0; i < nums.length; i++) {
			  if (y < count && nums[i] % 2 == 0) {
				  x[y] = nums[i];
				  y++;
			  }
		  }
		  return x;
		}
	
	
	public static void main(String[] args) {
		
		int[] nums = {3, 2, 4, 5, 8};
		int count = 2;
		for (int i = 0; i < count; i++) {
			System.out.println(copyEvens(nums, count)[i]);
		}
	}
}
