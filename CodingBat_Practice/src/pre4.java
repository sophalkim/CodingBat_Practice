
public class pre4 {
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 2, 4};
		int[] x = new int[nums.length];
		int y = 0;
		  for (int i=0; i<nums.length; i++) {
			y=i;
		    if (nums[i]==4) {
		      break;
		    }
		    
		    x[i] = nums[i];
		    
		  }
		System.out.println(y);
	}
}
