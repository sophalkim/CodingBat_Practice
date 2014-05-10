
public class zeroMax {
	public static void main(String[] args) {
		int[] nums = {0, 5, 0, 3};
		for (int i=0; i<nums.length; i++) {
			if (nums[i]==0) {
				for (int j=i; j<nums.length; j++) {
					if (nums[j]%2==1) {
						nums[i] = Math.max(nums[i], nums[j]);
					}
				}
			}
		}
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);	
		}	
	}
}
