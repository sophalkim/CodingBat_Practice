
public class plusOut2 {
	public static void main(String[] args) {
		String str = "12xy34xyabcxy";
		for (int i=0; i<str.length()-1; i++) {
			if (str.charAt(i)!='x') {
				str.replace(str.charAt(i), '+');
			}
		}
		System.out.println(str);
	}
}
