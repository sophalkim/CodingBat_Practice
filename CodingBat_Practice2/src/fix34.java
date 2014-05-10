
public class fix34 {
	public static void main(String[] args) {
		int[] nums = {4, 5, 4, 1, 5};
		int temp = 0;
		int x = 0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i]==4 && nums[i+1]!=5) {
				for (int j=x; j<nums.length; j++) {
					temp = nums[i+1];
					if (nums[j]==5) {
						nums[i+1]=5;
						nums[j]=temp;
						x = j;
					}
				}
			}
		}
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
}
