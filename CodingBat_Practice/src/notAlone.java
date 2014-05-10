
public class notAlone {
	public static void main(String[] args) {
		int[] nums = {1, 3, 1, 2};
		int val = 1;
		int bigger = 0;
		/*if (nums.length<=2) {
			return nums;
		}*/
		for (int i=1; i<nums.length-1; i++) {
			System.out.println(i);
			if (nums[i]==val) {
				bigger = Math.max(nums[i-1], nums[i+1]);
				nums[i] = bigger;
			}	
		}
		
		for (int i=0; i<nums.length; i++) {
			//System.out.print(nums[i]+",");
		}
		//System.out.println(bigger);
	}
}
