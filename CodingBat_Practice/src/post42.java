
public class post42 {
	public static void main(String[] args) {
		int[] nums = {2, 4, 1, 4, 3, 2};
		int index = 0;
		int length = nums.length;
		for (int i=0; i<nums.length; i++) {
			if (nums[i]==4) {
				index = i;
			}
		}
		int length2 = length-index-1;
		int[] result = new int[length2];
		for (int i=0; i<length2; i++) {
			result[i] = nums[i+index+1];
		}
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
