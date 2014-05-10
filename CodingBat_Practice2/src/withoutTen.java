
public class withoutTen {
	public static void main(String[] args) {
		int[] nums = {10, 13, 10, 14, 10};
		int count = 0;
		  for (int i=0; i<nums.length; i++) {
		    if (nums[i]==10) {
		      count++;
		      nums[i]=0;
		    }
		  }
		  int x = nums.length-count;
		  int[] y = new int[x];
		  int add = 0;
		  for (int i=0; i<nums.length; i++) {
		    if (nums[i]!=0) {
		      y[add] = nums[i];
		      add++;
		    }
		  }
		  for (int i=0; i<x; i++) {
	      System.out.println(y[i]);
		  }
	}
}
