
public class fix45 {
	public static void main(String[] args) {
		int[] nums = {4, 9, 4, 9, 5, 5, 4, 9, 5};
		int temp = 0;
		int x = 0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i]==4 && nums[i+1]!=5) {
				for (int j=x; j<nums.length; j++) {
					if (j>0 && nums[j]==5 && nums[j-1]==4) continue;
					if (nums[j]==5) {
						temp = nums[i+1];
						nums[i+1] = nums[j];
						nums[j] = temp;
						x = j;
					}
				}
			}
			for (int k=0; k<nums.length; k++) {
				if (k==8) {
					System.out.println(" ");
				} else {
				System.out.print(nums[k]);
			}
			}
		}
//		for (int i=0; i<nums.length; i++) {
//			System.out.print(nums[i]);
//		}
	}
}
