
public class withoutTen2 {
	public static void main(String[] args) {
		int[] nums = {10, 13, 10, 14, 10};
		int[] result = new int[nums.length];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 10) {
			} else {
				result[j] = nums[i]; 
				j++;
			}
		}
		for (int i = j; i < nums.length; i++) {
			result[i] = 0;
		}
		for (int i=0; i<nums.length; i++) {
			System.out.print(result[i] + ",");
		}
	}
}
