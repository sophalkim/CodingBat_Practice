
public class notReplace {
	public static void main(String[] args) {
		String str = "This is right";
		String x = "";
		int count = 0;
		for (int i=0; i<str.length()-1; i++) {
			if (str.substring(i, i+2).equals("is")) {
				if (i==0) {
				  x = x.substring(0, i) + "is not" + str.substring(i+2);
				} else {
					if (Character.isLetter(str.charAt(i-1))) {
					} else {
						x = x.substring(0, i+4) + "is not" + str.substring(i+2);
					}
				}
			}
		}
		
		System.out.print(x);
	}
}
