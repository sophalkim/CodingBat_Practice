
public class evenodd2 {
	public static void main(String[] args) {
		int[] nums = {1, 0, 1, 0, 0, 1, 1};
		
		int[] res = new int[nums.length];
		for (int i=0, j=res.length-1, k=0; i<nums.length; i++) {
			if (nums[i]%2==0) {
				res[k++] = nums[i];
			} else {
				res[j--] = nums[i];
			}
		}
		for (int i=0; i<nums.length; i++) {
			System.out.println(res[i]);
		}
	}
}
