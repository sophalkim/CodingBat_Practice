
public class post43 {
	public static void main(String[] args) {
		int[] nums = {2, 4, 1, 4, 3, 2};
		int four = 0;
	    for(int i = 0; i < nums.length; i++) {
	    	if(nums[i] == 4) {
	    		four = i;
	    	}
	    }
	    four++;
	    int[] result = new int[nums.length - four];
	    for(int i = four; i < nums.length; i++) {
	    	result[i - four] = nums[i];
	    }
	}
}
