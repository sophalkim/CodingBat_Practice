
public class zeroFront {
	public static void main(String[] args) {
		int[] nums = {9, 9, 0, 9, 0, 9};
		
		
		int zeros = 0;
		int val = 0;
		int count = 0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i]==0) {
				zeros++;
			} else {
				count++;
				val = nums[i];
			}
		}
		int[] result = new int[nums.length];
		for (int i=0; i<zeros; i++) {
			result[i] = 0;
		}
		for (int i=0; i<count; i++) {
			result[i+zeros] = val;
		}
		for (int i=0; i<nums.length; i++) {
			System.out.println(result[i]);
		}
	}
}
