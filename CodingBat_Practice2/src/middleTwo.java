
public class middleTwo {
	public static void main(String[] args) {
		String str = "0123456789";
		int middle = str.length()/2;
		if (str.length()<=2) {
		  System.out.println(str);
		} else {
			System.out.println(str.substring(middle-1, middle+1));
		}
	}
}

