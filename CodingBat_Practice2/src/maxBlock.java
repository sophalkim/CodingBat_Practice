
public class maxBlock {
	public static void main(String[] args) {
		String str = "abbCCCddBBBxx";
		int max = 0;
		int count = 0;
		char y = 'p';
		  for (int i=0; i<str.length()-1; i++) {
		    if (str.charAt(i)==str.charAt(i+1)) {
		      y = str.charAt(i);
		      count = 2;
		      i=i+2;
		      for (int j=i; j<str.length(); j++) {
		        if (str.charAt(j)==y) {
		          count++;
		        } else {
		          max = Math.max(max, count);
		          count = 0;
		          break;
		        }
		      }
		    }
		  }
		  System.out.println(max);
	}
}
