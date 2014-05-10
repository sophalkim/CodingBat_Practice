package November2013;

public class countTen {

	public static int countTen = 0;
	
	public static int[] countTen(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 10) {
				nums[i] = 0;
			    countTen++;
			}
		}
		int[] x = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			x[i] = 0;
		}
		int y = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				x[y] = nums[i];
				y++;
			}
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = {1, 99, 10};
		for (int i = 0; i < nums.length; i++) {
			System.out.print(countTen(nums)[i]);
		}
		System.out.println(", TenCount: " + countTen);
	}
}
