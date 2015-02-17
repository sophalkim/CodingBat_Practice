
public class Amazon_Array {
	
	public static void main(String[] args) {
		int[] nums = {1,1,0,0,1,0,1,1,1,0,1,1,1};
	    int len = nums.length;
	    int count = 0;
	    int max = 0;
	    int index = 0;
	    for (int i = 0; i < len; i++) {
	      if (nums[i] == 0) {
	        nums[i] = 1;
	        count = 0;
	        for (int j = 0; j < len; j++) {
	          if (nums[j] == 1) {
	            count++;
	          }
	          if (nums[j] == 0) {
	            max = Math.max(max, count);
	            count = 0;
	          }
	        }
	        if (count > max) {
	          max = count;
	          index = i;
	        }
	        nums[i] = 0;
	      }
	    }
	    System.out.println("The max is: " + max + " At index: " + index);
	}
	
}
