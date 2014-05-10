
public class maxBlock2 {
	public static void main(String[] args) {
		int max = 0;
		int count = 0;
		String str = "abbCCCddBBBxx";
		for (int i=0; i<str.length()-1; i++) {
			if (str.substring(i, i+1).equals(str.substring(i+1,i+2))) {
				count = 2;
				for (int j=i+2; j<str.length(); j++) {
					if (str.substring(i, i+1).equals(str.substring(j,j+1))) {
						count++;
					} else {
						break;
					}
				}
			max = Math.max(max, count);
			}
		}
		System.out.println(max);
	}
}
