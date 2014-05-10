package November2013;

public class copyEndy {

	public static int[] copyEvens(int[] nums, int count) {
		  int[] x = new int[count];
		  int y = 0;
		  for (int i = 0; i < nums.length; i++) {
			  if (y < count && isEndy(nums[i])) {
				  x[y] = nums[i];
				  y++;
			  }
		  }
		  return x;
		}
	
	public static boolean isEndy(int num) {
		return (num >= 0 && num <= 10 || num >= 90 && num <= 100);
	}
	
	public static void main(String[] args) {
		
		int[] nums = {12, 1, 1, 13, 0, 20};
		int count = 2;
		for (int i = 0; i < count; i++) {
			System.out.println(copyEvens(nums, count)[i]);
		}
	}
}
