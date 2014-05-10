
public class withoutTen {
	public static void main(String[] args) {
		int[] nums = {10, 13, 10, 14, 10};
		int x = nums.length;
		int count = 0;
		for (int i=0; i<x; i++) {
			if (nums[i]==10) {
				nums[i]=0;
				count++;
			}
		}
		int y = x-count;
		int[] temp = new int[y];
		int z = 0;
		for (int i=0; i<x; i++) {
			if (nums[i]!=0) {
				temp[z] = nums[i];
				z++;
			}
		}
		
		int[] result = new int[x];
		for (int i=0; i<y; i++) {
			result[i] = temp[i];
		}
		for (int i=y; i<x; i++) {
			result[i] = 0;
		}
		for (int i=0; i<x; i++) {
			System.out.print(result[i] + ",");
		}
	}
}
