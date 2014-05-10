
public class post4 {
	public static void main(String[] args) {
		int[] nums = {2,4,1,2};
		int[] x = new int[nums.length];
		boolean y = false;
		int z = 0;
		for (int i=0; i<nums.length; i++) {
			if (y) {
				x[i] = nums[i];
		    }
		    if (nums[i]==4 && y==false) {
		      y = true;
		      z = i;
		    }
		}
		
		int[] a = new int[nums.length-z-1];
		for (int i=0; i<a.length; i++) {
			a[i] = x[i+z+1];
		}
		for (int i=0; i<a.length; i++) {
			System.out.println("the number is " + a[i] + ". ");
		}
	}
}
