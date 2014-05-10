
public class maxSpan {
	public static void main(String[] args) {
		int[] nums = {};
		int count = 0;
		int len = nums.length;
		int last = 0;
		for (int i=len-1; i>=0; i--) {
			if (nums[i]==nums[len-1]) last = i;
		}
		count = Math.max(count,  len-last);
		for (int i=0; i<len; i++) {
			if (nums[i]==nums[0]) last = i;
		}
		count = Math.max(count, last);
		System.out.println(count);
	}
}
