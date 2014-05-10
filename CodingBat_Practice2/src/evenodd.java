
public class evenodd {
	public static void main(String[] args) {
		int[] nums = {3, 3, 2};
		int even = 0;
		int odd = 0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i]%2==0) {
				even++;
			} else {
				odd++;
			}
		}
		int[] evens = new int[even];
		int[] odds = new int[odd];
		for (int i=0, j=0, k=0; i<nums.length; i++) {
			if (nums[i]%2==0) {
				evens[j] = nums[i];
				j++;
			} else {
				odds[k] = nums[i];
				k++;
			}
		}
		for (int i=0; i<nums.length; i++) {
			if (i<even) nums[i]=evens[i];
			if (i>=even) nums[i]=odds[i-even];
		}
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
