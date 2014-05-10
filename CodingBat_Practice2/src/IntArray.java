
public class IntArray {
	public static void main(String[] args) {
		int[] nums = {2, 4, 1, 4, 3, 2};
		int x = nums.length;
		  int y = 0;
		  for (int i=x-1; i>0; i--) {
		    if (nums[i]==4) {
		    	y = i;
		    	break;
		    }
		  }
		  System.out.println(x);
		  System.out.println(y);
		  int[]z = new int[x-y-1];
		  for (int i=0; i<x-y-1; i++) {
		    z[i] = nums[y+1+i];
		  }
		  for (int i=0; i<x-y-1; i++) {
			  //System.out.println(z[i]);
		  }
	}
}
